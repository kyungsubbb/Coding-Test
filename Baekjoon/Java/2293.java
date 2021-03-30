import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_2293 {
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;

	public static void main(String[] args) throws Exception {
		st = new StringTokenizer(in.readLine(), " ");
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		int input[] = new int[n];
		int dp[][] = new int[n + 1][k + 1];
		for (int i = 0; i < n; i++) {
			int tmp = Integer.parseInt(in.readLine());
			input[i] = tmp;

		}
		for (int i = 0; i < n + 1; i++) {
			dp[i][0] = 1;
		}
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= k; j++) {
				int current = input[i - 1];

				if (j < current)
					dp[i][j] = dp[i - 1][j];
				else
					dp[i][j] = dp[i][j - current] + dp[i - 1][j];
			}
		}
		System.out.println(dp[n][k]);
	}

}
