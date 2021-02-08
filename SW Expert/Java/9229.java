import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SWEA_9229 {
	private static StringTokenizer st;
	private static int[] arr;
	static int M;

	private static int find(int idx, int score, int weight, int cnt) {
		if (weight < 0)
			return 0;
		if (cnt == 2)
			return score;
		if (idx == arr.length && cnt != 2)
			return 0;
		int v1 = find(idx + 1, score, weight, cnt);
		int v2 = find(idx + 1, score + arr[idx], weight - arr[idx], cnt + 1);
		return Math.max(v1, v2);

	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(in.readLine());
		for (int tc = 1; tc <= T; tc++) {
			st = new StringTokenizer(in.readLine(), " ");
			int N = Integer.parseInt(st.nextToken());
			M = Integer.parseInt(st.nextToken());

			st = new StringTokenizer(in.readLine(), " ");
			arr = new int[N];
			for (int i = 0; i < arr.length; i++) {
				arr[i] = Integer.parseInt(st.nextToken());
			}
			int idx = 0;
			int cnt = 0;
			int score = 0;
			int max = find(idx, score, M, cnt);
			if (max != 0)
				System.out.println("#" + tc + " " + max);
			else
				System.out.println("#" + tc + " " + -1);
		}
	}
}
