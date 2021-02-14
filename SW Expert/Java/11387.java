import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SWEA_11387 {
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	public static void main(String[] args) throws Exception {
		int T = Integer.parseInt(in.readLine());
		for (int tc = 1; tc <= T; tc++) {
			st = new StringTokenizer(in.readLine(), " ");
			int D = Integer.parseInt(st.nextToken());
			int L = Integer.parseInt(st.nextToken());
			int N = Integer.parseInt(st.nextToken());
			
			int sum = 0;
			int n = 0;
			for (int i = 1; i <= N; i++) {
				sum += D*(1+(n++)*0.01*L);
			}
			System.out.println("#"+tc+" "+sum);
		}
	}
}
