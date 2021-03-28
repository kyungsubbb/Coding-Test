import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ_9251 {
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws Exception {
		String v1 = in.readLine();
		String v2 = in.readLine();
		
		int map[][] = new int[v1.length()+1][v2.length()+1];
		for (int i = 1; i < map.length; i++) {
			for (int j = 1; j < map[i].length; j++) {
				if(v1.charAt(i-1) == v2.charAt(j-1)) {
					map[i][j] = map[i-1][j-1]+1;
				}
				else {
					map[i][j] = Math.max(map[i-1][j], map[i][j-1]);
				}
			}
		}
		System.out.println(map[v1.length()][v2.length()]);
	}
}
