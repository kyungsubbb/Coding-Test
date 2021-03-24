

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ_1600 {
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	static int k, r, c, map[][], count = -1, hx[] = { -1, -2, -2, -1, 1, 2, 2, 1 },
			hy[] = { -2, -1, 1, 2, 2, 1, -1, -2 }, dx[] = { -1, 0, 0, 1 }, dy[] = { 0, -1, 1, 0 };
	static int visited[][][];	// x, y, k 순으로 3차원 배열 선언 
	static Queue<int[]> q;

	public static void main(String[] args) throws Exception {
		k = Integer.parseInt(in.readLine());
		st = new StringTokenizer(in.readLine(), " ");
		c = Integer.parseInt(st.nextToken());
		r = Integer.parseInt(st.nextToken());
		map = new int[r][c];
		visited = new int[r][c][k + 1];
		for (int i = 0; i < r; i++) {
			st = new StringTokenizer(in.readLine(), " ");
			for (int j = 0; j < c; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		q = new LinkedList<>();
		q.offer(new int[] { 0, 0, 0, 0 });	// x, y, count, k
		visited[0][0][0] = 0;				// 시작점은 0으로 초기화
		BFS(k);
	}

	private static void BFS(int k) {
		while (!q.isEmpty()) {
			int[] tmp = q.poll();
			if (tmp[0] == r - 1 && tmp[1] == c - 1) {		// 도착 지점에 도달하면 count값 갱신
				count = visited[r - 1][c - 1][tmp[3]];
				break;
			}
			if (tmp[3] < k) {								// 말처럼 뛸 수 있다면?
				for (int i = 0; i < 8; i++) {				// 8방탐색
					int nx = tmp[0] + hx[i];
					int ny = tmp[1] + hy[i];
					if (nx < 0 || nx >= r || ny < 0 || ny >= c)
						continue;
					if (visited[nx][ny][tmp[3] + 1] == 0 && map[nx][ny] == 0) {		// 이동한 좌표랑 k값을 1 증가시킨 값과, 그 좌표값이 0이라면
						visited[nx][ny][tmp[3] + 1] = tmp[2] + 1;					// 방문 배열의 값을 해당 카운트 값으로 초기화
						q.offer(new int[] { nx, ny, tmp[2] + 1, tmp[3] + 1 });		// 큐에 해당 값을 넣어줌
					}
				}
			}
			for (int i = 0; i < 4; i++) {											// 말처럼 뛸 수 있는 경우가 있더라도 사방탐색으로 찾아봐야함 -> 혹시나 더 나은 최적해가 있는가?
				int nx = tmp[0] + dx[i];
				int ny = tmp[1] + dy[i];

				if (nx < 0 || nx >= r || ny < 0 || ny >= c)
					continue;
				if (visited[nx][ny][tmp[3]] == 0 && map[nx][ny] == 0) {				// 갈 수 있는 곳이 있으면
					visited[nx][ny][tmp[3]] = tmp[2] + 1;							// 배열에 카운트값 초기화
					q.offer(new int[] { nx, ny, tmp[2] + 1, tmp[3] });				// 큐에 해당 값을 넣어줌
				}
			}
		}
		System.out.println(count);													// break -> count 할당한 값 아니면, count는 1이어야함
	}

}

