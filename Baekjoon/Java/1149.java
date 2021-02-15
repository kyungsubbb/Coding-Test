import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	static StringBuilder sb;
	static int arr[][];

	public static void main(String[] args) throws Exception {
		int N = Integer.parseInt(in.readLine());
		arr = new int[N][3];
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(in.readLine(), " ");
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		for (int i = N - 2; i >= 0; i--) {
			int tmp[] = new int[2];
			for (int j = 0; j < arr[i].length; j++) {
				switch (j) {
				case 0:
					tmp[0] = arr[i + 1][1];
					tmp[1] = arr[i + 1][2];
					break;
				case 1:
					tmp[0] = arr[i + 1][0];
					tmp[1] = arr[i + 1][2];
					break;
				case 2:
					tmp[0] = arr[i + 1][0];
					tmp[1] = arr[i + 1][1];
					break;
				}
				arr[i][j] += Math.min(tmp[0], tmp[1]);
			}
		}

		int result = Integer.MAX_VALUE;
		for (int i = 0; i < 3; i++) {
			if (arr[0][i] < result)
				result = arr[0][i];
		}
		System.out.println(result);
	}
}