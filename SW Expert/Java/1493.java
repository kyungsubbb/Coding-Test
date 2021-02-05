import java.util.HashMap;
import java.util.Scanner;

public class SWEX_1493 {

	public static void main(String[] args) {
		int map[][] = new int[301][301];
		int cnt = 1;
		HashMap<Integer, int[]> m = new HashMap<>();
		for (int i = 1; i < map.length; i++) {
			int nx = i;
			int ny = 1;
			while(nx>=1 && ny<map.length) {
				m.put(cnt, new int[] {nx, ny});
				map[nx][ny] = cnt++;
				nx--;
				ny++;
			}
		}
		for (int i = 2; i < map.length; i++) {
			int nx = map.length-1;
			int ny = i;
			while(nx>=1 && ny<map.length) {
				m.put(cnt, new int[] {nx, ny});
				map[nx][ny] = cnt++;
				nx--;
				ny++;
			}
		}
		Scanner sc =new Scanner(System.in);
		int T = sc.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int result[] = new int[2];
			result[0] = m.get(a)[0] + m.get(b)[0];
			result[1] = m.get(a)[1] + m.get(b)[1];
			int res = map[result[0]][result[1]];
			System.out.println("#"+tc+" "+res);
		}
		sc.close();
	}

}
