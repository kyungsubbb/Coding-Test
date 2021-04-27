import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_2630 {
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	static int N, map[][], one, zero;
	public static void main(String[] args) throws Exception {
		N = Integer.parseInt(in.readLine());
		map = new int[N][N];
		
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(in.readLine());
			for (int j = 0; j < N; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		DFS(0, 0, N);
		System.out.println(zero);
		System.out.println(one);
	}
	private static void DFS(int x, int y, int len) {
		if(len == 1) {
			upValue(x, y);
			return;
		}
		if(isAvail(x, y, len)) {
			upValue(x, y);
			return;
		}
		int inLen = len/2;
		DFS(x, y, inLen);
		DFS(x+inLen, y, inLen);
		DFS(x, y+inLen, inLen);
		DFS(x+inLen, y+inLen, inLen);
		
	}
	private static void upValue(int x, int y) {
		if(map[x][y] == 0) {
			zero++;
		}else {
			one++;
		}
	}
	private static boolean isAvail(int x, int y, int len) {
		int tmp = map[x][y];
		for (int i = x; i < x+len; i++) {
			for (int j = y; j < y+len; j++) {
				if(map[i][j] != tmp) return false;
			}
		}
		return true;
	}

}
