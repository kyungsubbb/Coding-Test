import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st = null;
	static int N, K, map[][];
	public static void main(String[] args) throws Exception {
		st = new StringTokenizer(in.readLine());
		N = Integer.parseInt(st.nextToken());	// 물품의 수
		K = Integer.parseInt(st.nextToken());	// 수용 가능 최대 무게
		map = new int[N+1][K+1];
		for (int i = 1; i <= N; i++) {
			st = new StringTokenizer(in.readLine());
			int W = Integer.parseInt(st.nextToken());		// 물건의 무게
			int V = Integer.parseInt(st.nextToken());		// 물건의 가치
			
			for (int j = 1; j <= K; j++) {
				if(j < W) map[i][j] = map[i-1][j];
				else map[i][j] = Math.max(map[i-1][j], map[i-1][j-W]+V);
			}
		}
		System.out.println(map[N][K]);
	}

}