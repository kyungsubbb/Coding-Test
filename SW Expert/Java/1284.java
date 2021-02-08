import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SWEA_1284 {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(in.readLine());
		for (int tc = 1; tc <= T; tc++) {
			StringTokenizer st = new StringTokenizer(in.readLine(), " ");
			int P = Integer.parseInt(st.nextToken());
			int Q = Integer.parseInt(st.nextToken());
			int R = Integer.parseInt(st.nextToken());
			int S = Integer.parseInt(st.nextToken());
			int W = Integer.parseInt(st.nextToken());

			int price_a = W * P;
			int price_b = (R >= W) ? Q : Q + (W - R) * S;
			System.out.println("#" + tc + " " + Math.min(price_a, price_b));
		}
	}

}
