package solving;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ_7569 {
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	static int[][][] map;
	static boolean[][][] visited;
	static int N, M, H, count = 0, dx[] = { -1, 0, 0, 1, 0, 0 }, dy[] = { 0, -1, 1, 0, 0, 0 },
			dz[] = { 0, 0, 0, 0, -1, 1 };
	static Queue<int[]> q = new LinkedList<>();

	public static void main(String[] args) throws Exception {
		st = new StringTokenizer(in.readLine(), " ");
		M = Integer.parseInt(st.nextToken());
		N = Integer.parseInt(st.nextToken());
		H = Integer.parseInt(st.nextToken());
		map = new int[N][M][H];
		visited = new boolean[N][M][H];
		// 1은 익은 토마토 0은 익지않은 토마토 -1은 없는 토마토
		for (int i = 0; i < H; i++) {
			for (int j = 0; j < N; j++) {
				st = new StringTokenizer(in.readLine(), " ");
				for (int k = 0; k < M; k++) {
					map[j][k][i] = Integer.parseInt(st.nextToken());
					if (map[j][k][i] == 1) {
						q.offer(new int[] { j, k, i, 0 });
						visited[j][k][i] = true;
					}
				}
			}
		}
		if(allClear()) {
			System.out.println(count);
		} else {
			BFS();
		}

	}

	private static void BFS() {
		while (!q.isEmpty()) {
			int[] tmp = q.poll();
			for (int i = 0; i < 6; i++) {
				int nx = tmp[0] + dx[i];
				int ny = tmp[1] + dy[i];
				int nz = tmp[2] + dz[i];
				int day = tmp[3];
				if (nx < 0 || nx >= N || ny < 0 || ny >= M || nz < 0 || nz >= H)
					continue;
				if (map[nx][ny][nz] == 0 && !visited[nx][ny][nz]) {
					map[nx][ny][nz] = 1;
					visited[nx][ny][nz] = true;
					q.offer(new int[] { nx, ny, nz, day + 1 });
				}
			}
			if (allClear()) {
				System.out.println(tmp[3] + 1);
				return;
			}
		}
		System.out.println(-1);
	}

	private static boolean allClear() {
		for (int i = 0; i < H; i++) {
			for (int j = 0; j < N; j++) {
				for (int k = 0; k < M; k++) {
					if (map[j][k][i] == 0)
						return false;
				}
			}
		}
		return true;
	}

}
