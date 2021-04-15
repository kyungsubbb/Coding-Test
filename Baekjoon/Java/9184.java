import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_9184 {
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static int[][][] map = new int[21][21][21];
	static StringTokenizer st;
	public static void main(String[] args) throws Exception {
		for (int i = 0; i <= 20; i++) {
			for (int j = 0; j <= 20; j++) {
				for (int k = 0; k <= 20; k++) {
					if(j==0 || k==0 || i==0) map[i][j][k] = 1;
					else {
						int a = i;
						int b = j;
						int c = k;
						if(a-1 < 0 || b-1 < 0 || c-1 < 0) {
							map[i][j][k] = 1; 
							continue;
						}
						map[i][j][k] = map[a-1][b][c] + map[a-1][b-1][c] + map[a-1][b][c-1] - map[a-1][b-1][c-1];
					}
				}
			}
		}
		while(true) {
			st = new StringTokenizer(in.readLine(), " ");
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
			if(a == -1 && b == -1 && c == -1) break;
			if(a <= 0 || b <= 0 || c <= 0) System.out.println("w("+a+", "+b+", "+c+") = "+1);
			else if(a > 20 || b > 20 || c > 20) System.out.println("w("+a+", "+b+", "+c+") = "+map[20][20][20]);
			else System.out.println("w("+a+", "+b+", "+c+") = "+map[a][b][c]);
		}
	}

}
