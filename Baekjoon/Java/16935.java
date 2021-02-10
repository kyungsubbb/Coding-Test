import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ_16935 {
	static int N, M, R, arr[][], result[][];
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	
	static void updown(int N, int M) {								// 상하반전
		result = new int[N][M];
		for (int i = 0; i < result.length; i++) {
			for (int j = 0; j < result[i].length; j++) {
				result[i][j] = arr[result.length-1-i][j];
			}
		}
	}
	static void leftright(int N, int M) {							// 좌우반전
		result = new int[N][M];
		for (int i = 0; i < result.length; i++) {
			for (int j = 0; j < result[i].length; j++) {
				result[i][j] = arr[i][result[i].length-j-1];
			}
		}
	}
	static void right(int N, int M) {								// 오른쪽으로 90도
		result = new int[M][N];
		for (int i = 0; i < result.length; i++) {
			for (int j = 0; j < result[i].length; j++) {
				result[i][j] = arr[j][i];
			}
		}
		arr = Arrays.copyOfRange(result, 0, result.length);
		leftright(M, N);
	}
	static void left(int N, int M) {								// 왼쪽으로 90도
		result = new int[M][N];
		for (int i = 0; i < result.length; i++) {
			for (int j = 0; j < result[i].length; j++) {
				result[i][j] = arr[j][i];
			}
		}
		arr = Arrays.copyOfRange(result, 0, result.length);			// arr을 기준으로 result를 만들기 때문에 여러번의 연산을 위해 result 배열을 arr에 복사
		updown(M, N);
	}
	static void section1(int N, int M) {							// 1 -> 2 -> 3 -> 4 -> 1
		result = new int[N][M];
		int s1 = N/2;
		int s2 = M/2;
		for (int i = 0; i < s1; i++) {								 // section1
			for (int j = 0; j < s2; j++) {
				result[i][j] = arr[i+s1][j];
			}
		}
		for (int i = 0; i < s1; i++) {						 		// section2
			for (int j = s2; j < arr[i].length; j++) {
				result[i][j] = arr[i][j-s2];
			}
		}
		for (int i = s1; i < arr.length; i++) {						 // section3
			for (int j = s2; j < arr[i].length; j++) {
				result[i][j] = arr[i-s1][j];
			}
		}
		for (int i = s1; i < arr.length; i++) {						 // section4
			for (int j = 0; j < s2; j++) {
				result[i][j] = arr[i][s2+j];
			}
		}
		arr = Arrays.copyOfRange(result, 0, result.length);			// arr을 기준으로 result를 만들기 때문에 여러번의 연산을 위해 result 배열을 arr에 복사
	}
	static void section2(int N, int M) {							// 4 -> 3 -> 2 -> 1 -> 4
		result = new int[N][M];
		int s1 = N/2;
		int s2 = M/2;
		for (int i = 0; i < s1; i++) {						 		// section1
			for (int j = 0; j < s2; j++) {
				result[i][j] = arr[i][j+s2];
			}
		}
		for (int i = 0; i < s1; i++) {						 		// section2
			for (int j = s2; j < arr[i].length; j++) {
				result[i][j] = arr[i+s1][j];
			}
		}
		for (int i = s1; i < arr.length; i++) {						 // section3
			for (int j = s2; j < arr[i].length; j++) {
				result[i][j] = arr[i][j-s2];
			}
		}
		for (int i = s1; i < arr.length; i++) {						 // section4
			for (int j = 0; j < s2; j++) {
				result[i][j] = arr[i-s1][j];
			}
		}
		arr = Arrays.copyOfRange(result, 0, result.length);			// arr을 기준으로 result를 만들기 때문에 여러번의 연산을 위해 result 배열을 arr에 복사
	}
	
	
	static void swap() {											// N과 M의 값을 바꾸는 메소드
		int tmp = N;
		N = M;
		M = tmp;
	}

	
	public static void main(String[] args) throws IOException {
		st = new StringTokenizer(in.readLine(), " ");
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		R = Integer.parseInt(st.nextToken());
		
		arr = new int[N][M];
		for (int i = 0; i < arr.length; i++) {
			st = new StringTokenizer(in.readLine(), " ");
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		st = new StringTokenizer(in.readLine(), " ");
		for (int i = 0; i < R; i++) {
			int tmp = Integer.parseInt(st.nextToken());
			if(tmp == 1) {					// 상하 반전
				updown(N, M);				// N, M
			}
			else if(tmp == 2) {				// 좌우반전
				leftright(N, M);			// N, M
			}
			else if(tmp == 3) {				// 오른쪽 90도
				right(N, M);				// M, N
				swap();
			}
			else if(tmp == 4) {				// 왼쪽 90도
				left(N, M);
				swap();
			}
			else if(tmp == 5) {				// 1 -> 2 -> 3 -> 4 -> 1
				section1(N, M);
			}
			else if(tmp == 6) {				// 4 -> 3 -> 2 -> 1 -> 4
				section2(N, M);
			}
			arr = Arrays.copyOfRange(result, 0, result.length);
		}
		
		
		// 배열 확인용 (출력)

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(result[i][j]+" ");
			}
			System.out.println();
		}
	}

}
