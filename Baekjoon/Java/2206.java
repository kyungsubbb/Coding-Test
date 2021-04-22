import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ_2206 {
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	static int N, M, map[][][], arr[][], res = Integer.MAX_VALUE;

	static class Point {
		int x, y, floor, time;

		public Point(int x, int y, int floor, int time) {
			super();
			this.x = x;
			this.y = y;
			this.floor = floor;
			this.time = time;
		}

		@Override
		public String toString() {
			return "Point [x=" + x + ", y=" + y + ", floor=" + floor + ", time=" + time + "]";
		}

	}

	public static void main(String[] args) throws IOException {
		st = new StringTokenizer(in.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		map = new int[2][N][M];
		arr = new int[N][M];

		for (int i = 0; i < N; i++) {
			String input = in.readLine();
			for (int j = 0; j < M; j++) {
				arr[i][j] = input.charAt(j) - '0';
			}
		}

		map[0][0][0] = 1;
		BFS(0, 0, 0, 1);
		System.out.println(res);

	}

	static int dx[] = { -1, 0, 0, 1 };
	static int dy[] = { 0, -1, 1, 0 };

	private static void BFS(int x, int y, int floor, int time) {
		Queue<Point> q = new LinkedList<>();
		q.offer(new Point(x, y, floor, time));

		while (!q.isEmpty()) {
			Point p = q.poll();

			for (int i = 0; i < 4; i++) {
				int nx = p.x + dx[i];
				int ny = p.y + dy[i];
				if (nx < 0 || nx >= N || ny < 0 || ny >= M)
					continue;
				if (p.floor == 0) {
					if (arr[nx][ny] == 1) {
						if (map[1][nx][ny] == 0 || map[1][nx][ny] > p.time + 1) {
							map[1][nx][ny] = p.time + 1;
							q.offer(new Point(nx, ny, 1, p.time + 1));
						}
					}
					if (arr[nx][ny] == 0) {
						if (arr[nx][ny] == 1)
							continue;
						if (map[0][nx][ny] == 0 || map[0][nx][ny] > p.time + 1) {
							map[0][nx][ny] = p.time + 1;
							q.offer(new Point(nx, ny, 0, p.time + 1));
						}
					}
				} else {
					if (arr[nx][ny] == 1)
						continue;
					if (map[1][nx][ny] == 0 || map[1][nx][ny] > p.time + 1) {
						map[1][nx][ny] = p.time + 1;
						q.offer(new Point(nx, ny, 1, p.time + 1));
					}
				}

			}
		}
		for (int i = 0; i < 2; i++) {
			if (map[i][N - 1][M - 1] == 0)
				continue;
			res = Math.min(res, map[i][N - 1][M - 1]);
		}
		if (res == Integer.MAX_VALUE)
			res = -1;
	}
}
