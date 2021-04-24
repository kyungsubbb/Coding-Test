package solving;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ_11404 {
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st = null;
	static int n, m;
	static final int INF = 999999999;
	public static void main(String[] args) throws Exception {
		n = Integer.parseInt(in.readLine());
		m = Integer.parseInt(in.readLine());
		int map[][] = new int[n+1][n+1];
		
		for (int i = 0; i <= n; i++) {
			Arrays.fill(map[i], INF);
		}
		for (int i = 0; i < m; i++) {
			st = new StringTokenizer(in.readLine());
			int start = Integer.parseInt(st.nextToken());
			int dist = Integer.parseInt(st.nextToken());
			int cost = Integer.parseInt(st.nextToken());
			
			map[start][dist] = Math.min(cost, map[start][dist]);
		}
		
		for(int k=1; k<=n; k++) {		// 경유지
			for(int i=1; i<=n; i++) {	// 출발지
				if(i==k) continue;
				for(int j=1; j<=n; j++) {	// 도착지
					if(i==j || j==k) continue;
					map[i][j] = Math.min(map[i][j], map[i][k] + map[k][j]);
				}
			}
		}
		
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if(map[i][j] == INF) System.out.print("0 ");
				else System.out.print(map[i][j] + " ");
			}
			System.out.println();
		}
	}
 
}
