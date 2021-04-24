import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ_1504 {
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st = null;
	static int n, m;
	static final int INF = 999999999;
	public static void main(String[] args) throws Exception {
		n = Integer.parseInt(in.readLine());
		int map[][] = new int[n][n];
		
		for (int i = 0; i < n; i++) {
			Arrays.fill(map[i], INF);
		}
		
		for (int i = 0; i < n ; i++) {
			st = new StringTokenizer(in.readLine());
			for (int j = 0; j < n; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		
		for(int k=0; k<n; k++) {		// 경유지
			for(int i=0; i<n; i++) {	// 출발지
				for(int j=0; j<n; j++) {	// 도착지
					if(map[i][j] == 1) continue; 
					if(map[i][k] == 1 && map[k][j] == 1) map[i][j] = 1;
				}
			}
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(map[i][j]==INF ? 0 : map[i][j] + " ");
			}
			System.out.println();
		}
	}
 
}
