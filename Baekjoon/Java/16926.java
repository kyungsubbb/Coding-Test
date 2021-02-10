import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ_16926 {
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	static int N, M, arr[][], result[][];
	static int rotate;
	static int dx[] = {1, 0, -1, 0};
	static int dy[] = {0, 1, 0, -1};
	static void rotation(int N, int M, int idx) {
		if(result[idx][idx] != 0) return;							// 기저조건 : 배열의 원소가 다 채워지면 리턴
		int nx = idx;												// 임시 x좌표
		int ny = idx;												// 임시 y좌표
		int dir = 0;												// 방향을 주기위한 요소 (dx, dy의 인덱스)
		while(dir<4) {												// 4방향을 모두 탐색 -> 껍데기만 탐색
			nx += dx[dir];
			ny += dy[dir];
			if(nx >= idx && nx < N && ny >= idx && ny < M) {		// 범위안에 들어오면
				result[nx][ny] = arr[nx-dx[dir]][ny-dy[dir]];		// 이전 값을 가져옴
			}
			else {
				nx -= dx[dir];										// if 문을 빠져나왔다는 것은 범위 안이 아니란 이야기기때문에 하나씩 빼줌
				ny -= dy[dir];
				dir++;												// 방향전환
			}
		}
		rotation(N-1, M-1, idx+1);									// 다음 레벨의 껍데기를 검사하기 위한 요소
	}
	public static void main(String[] args) throws Exception{
		st = new StringTokenizer(in.readLine(), " ");
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		rotate = Integer.parseInt(st.nextToken())%((N+M)*2 -4);
		arr = new int[N][M];
		
		for (int i = 0; i < arr.length; i++) {
			st = new StringTokenizer(in.readLine(), " ");
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		// 반시계 방향으로 회전
		
		for (int i = 0; i < rotate; i++) {
			result = new int[N][M];									// rotation의 기저조건이 result[idx][idx] != 0이기 때문에 매번 생성해줌
			rotation(N, M, 0);
			arr = Arrays.copyOfRange(result, 0, result.length);		// arr을 기준으로 회전하기 때문에 결과값을 복사해둠
		}
		
		// 출력 및 배열 확인용
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(result[i][j] + " ");
			}
			System.out.println();
		}
	}

}
