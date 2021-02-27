import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_2669 {
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	public static void main(String[] args) throws Exception {
		int map[][] = new int[101][101];
		int count = 0;
		for (int i = 0; i < 4; i++) {
			st = new StringTokenizer(in.readLine(), " ");
			int x1 = Integer.parseInt(st.nextToken());
			int y1 = Integer.parseInt(st.nextToken());
			int x2 = Integer.parseInt(st.nextToken());
			int y2 = Integer.parseInt(st.nextToken());
			
			for (int j = x1; j < x2; j++) {
				for (int j2 = y1; j2 < y2; j2++) {
					map[j][j2] = 1;
				}
			}
		}
		for (int i = 0; i < map.length; i++) {
			for (int j = 0; j < map[i].length; j++) {
				if(map[i][j] == 1) count++;
			}
		}
		System.out.println(count);
	}

}
