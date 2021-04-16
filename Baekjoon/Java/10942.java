package solving;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_10942 {
	static boolean map[][];
	static int N, arr[];
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		N = Integer.parseInt(in.readLine());
		arr = new int[N + 1];
		map = new boolean[N + 1][N + 1];
		
		st = new StringTokenizer(in.readLine(), " ");
		for (int i = 1; i <= N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}

		dp();

		StringBuilder sb = new StringBuilder();
		int M = Integer.parseInt(in.readLine());
		for (int i = 0; i < M; i++) {
			st = new StringTokenizer(in.readLine(), " ");
			int S = Integer.parseInt(st.nextToken());
			int E = Integer.parseInt(st.nextToken());

			if (map[S][E])
				sb.append("1");
			else
				sb.append("0");
			sb.append("\n");
		}
		System.out.println(sb.toString());
	}

	private static void dp() {
		for (int i = 1; i <= N; i++) {
			map[i][i] = true;
		}

		for (int i = 1; i <= N - 1; i++) {
			if (arr[i] == arr[i + 1])
				map[i][i + 1] = true;
		}

		for (int i = 3; i <= N; i++) {
			for (int j = 1; j <= N - i + 1; j++) {
				int k = i + j - 1;
				if (arr[j] == arr[k] && map[j + 1][k - 1]) map[j][k] = true;
			}
		}
	}

}
