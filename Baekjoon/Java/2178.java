import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ_2178 {
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	static int N, M, map[][];
	static int dir[][] = { { -1, 0 }, { 0, -1 }, { 0, 1 }, { 1, 0 } };
	static boolean visited[][];

	public static void main(String[] args) throws Exception {
		st = new StringTokenizer(in.readLine(), " ");
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		map = new int[N][M];
		visited = new boolean[N][M];
		for (int i = 0; i < N; i++) {
			String tmp = in.readLine();
			for (int j = 0; j < M; j++) {
				map[i][j] = tmp.charAt(j) - '0';
			}
		}

		search(); // 0, 0에서 출발
		System.out.println(map[N - 1][M - 1]);

	}

	private static void search() {
		Queue<int[]> q = new LinkedList<>(); // x, y, val
		q.offer(new int[] { 0, 0, 1 });
		visited[0][0] = true;

		while (!q.isEmpty()) {
			int[] tmp = q.poll();

			map[tmp[0]][tmp[1]] = tmp[2];
			for (int i = 0; i < 4; i++) {
				int nx = tmp[0] + dir[i][0];
				int ny = tmp[1] + dir[i][1];
				if (nx < 0 || nx >= N || ny < 0 || ny >= M)
					continue;
				if (map[nx][ny] == 1 && !visited[nx][ny]) {
					q.offer(new int[] { nx, ny, tmp[2] + 1 });
					visited[nx][ny] = true;
				}
			}
			if (tmp[0] == N - 1 && tmp[1] == M - 1)
				return;
		}
	}

}
