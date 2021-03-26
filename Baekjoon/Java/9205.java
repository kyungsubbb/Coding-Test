import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class BOJ_9205 {
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;

	static class Point {
		int x, y;

		public Point(int x, int y) {
			this.x = x;
			this.y = y;
		}

		@Override
		public String toString() {
			return "Point [x=" + x + ", y=" + y + "]";
		}

	}

	static ArrayList<Point> list;
	static int map[][], n;
	static boolean avail[][];
	static final int INF = 9999;

	public static void main(String[] args) throws Exception {
		int T = Integer.parseInt(in.readLine());
		for (int tc = 0; tc < T; tc++) {
			list = new ArrayList<>();
			n = Integer.parseInt(in.readLine());
			map = new int[n + 2][n + 2];
			avail = new boolean[n + 2][n + 2];

			for (int i = 0; i < map.length; i++) {															// 각 포인트들을 받아옴
				st = new StringTokenizer(in.readLine(), " ");
				list.add(new Point(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())));
			}

			for (int i = 0; i < map.length; i++) {															// 포인트간 거리 측정
				for (int j = 0; j < map[i].length; j++) {
					int tmp = getDist(list.get(i), list.get(j));
					map[i][j] = tmp > 1000 ? INF : tmp;

					if (map[i][j] <= 1000)																	// 각 거리가 50*20 보다 작으면 갈수 있음 표시
						avail[i][j] = true;
				}
			}
			floyd();
			if (avail[0][n + 1]) {																			// 집 -> 페스티벌 장소
				System.out.println("happy");
			} else {
				System.out.println("sad");
			}

		}
	}

	private static void floyd() {
		for (int via = 0; via < n + 2; via++) {
			for (int from = 0; from < n + 2; from++) {
				if (via == from)
					continue;
				for (int to = 0; to < n + 2; to++) {
					if (from == to || via == to)
						continue;
					if (avail[from][via] && avail[via][to])													// 출발지에서 경유지까지 갈 수 있고, 경유지에서 도착지까지 갈 수 있으면 출발지에서 도착지까지 갈 수 있다.
						avail[from][to] = true;
				}
			}
		}
	}

	private static int getDist(Point a, Point b) {
		return Math.abs(a.x - b.x) + Math.abs(a.y - b.y);
	}
}
