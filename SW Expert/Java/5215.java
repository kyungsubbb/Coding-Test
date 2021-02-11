import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SWEA_5215 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(in.readLine());
		for (int tc = 1; tc <= T; tc++) {
			StringTokenizer st = new StringTokenizer(in.readLine(), " ");

			int N = Integer.parseInt(st.nextToken());
			int L = Integer.parseInt(st.nextToken());
			int[][] arr = new int[N + 1][L + 1];
			for (int i = 1; i <= N; i++) {
				StringTokenizer sa = new StringTokenizer(in.readLine(), " ");
				int price = Integer.parseInt(sa.nextToken());
				int cal = Integer.parseInt(sa.nextToken());
				for (int j = 1; j <= L; j++) {
					if (j < cal) {
						arr[i][j] = arr[i - 1][j];
					} else {
						arr[i][j] = Math.max(arr[i - 1][j], arr[i - 1][j - cal] + price);
					}
				}
			}

			System.out.println("#" + tc + " " + arr[N][L]);
		}
	}

}
