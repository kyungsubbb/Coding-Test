import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ_7576 {
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	static int map[][], r, c;
	static Queue<Point> q = new LinkedList<>();
	static int dx[] = { -1, 0, 0, 1 };
	static int dy[] = { 0, -1, 1, 0 };

	static class Point {
		int x, y, time;

		public Point(int x, int y, int time) {
			super();
			this.x = x;
			this.y = y;
			this.time = time;
		}

	}

	public static void main(String[] args) throws Exception {
		st = new StringTokenizer(in.readLine(), " ");
		c = Integer.parseInt(st.nextToken());
		r = Integer.parseInt(st.nextToken());
		map = new int[r][c];

		for (int i = 0; i < r; i++) {
			st = new StringTokenizer(in.readLine(), " ");
			for (int j = 0; j < c; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
				if (map[i][j] == 1) {
					q.offer(new Point(i, j, 0));
				}
			}
		}
		int time = 0;
		while (!q.isEmpty()) {

			Point point = q.poll();
			for (int i = 0; i < 4; i++) {
				int nx = point.x + dx[i];
				int ny = point.y + dy[i];
				if (nx < 0 || nx >= r || ny < 0 || ny >= c || map[nx][ny] != 0)
					continue;
				if (map[nx][ny] == 0) {
					time = point.time + 1;
					q.offer(new Point(nx, ny, time));
					map[nx][ny] = 1;
				}
			}

		}
		if (allClear()) {
			System.out.println(time);
		} else
			System.out.println(-1);

	}

	private static boolean allClear() {
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				if (map[i][j] == 0)
					return false;
			}
		}
		return true;
	}

}
