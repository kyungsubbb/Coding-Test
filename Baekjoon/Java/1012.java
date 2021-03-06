package solving;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class BOJ_1012 {
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	static int map[][], dx[] = { -1, 1, 0, 0 }, dy[] = { 0, 0, -1, 1 }; // 상, 하, 좌, 우
	static boolean isSelected[][];

	public static void main(String[] args) throws Exception {
		int T = Integer.parseInt(in.readLine());
		for (int tc = 1; tc <= T; tc++) {
			st = new StringTokenizer(in.readLine(), " ");
			int M = Integer.parseInt(st.nextToken());
			int N = Integer.parseInt(st.nextToken());
			int K = Integer.parseInt(st.nextToken());
			map = new int[N][M];
			isSelected = new boolean[N][M];
			for (int i = 0; i < K; i++) {
				st = new StringTokenizer(in.readLine(), " ");
				int Y = Integer.parseInt(st.nextToken());
				int X = Integer.parseInt(st.nextToken());
				map[X][Y] = 1;
			}
			Stack<int[]> stack = new Stack<>();
			int count = 0;
			for (int i = 0; i < map.length; i++) {
				for (int j = 0; j < map[i].length; j++) {
					if (map[i][j] == 1 && !isSelected[i][j]) {
						stack.push(new int[] { i, j });
						isSelected[i][j] = true;
						while (!stack.isEmpty()) {
							int[] tmp = stack.pop();
							for (int k = 0; k < 4; k++) {
								if (tmp[0] + dx[k] >= 0 && tmp[0] + dx[k] < N && tmp[1] + dy[k] >= 0
										&& tmp[1] + dy[k] < M && !isSelected[tmp[0] + dx[k]][tmp[1] + dy[k]]
										&& map[tmp[0] + dx[k]][tmp[1] + dy[k]] == 1) {
									stack.push(new int[] { tmp[0] + dx[k], tmp[1] + dy[k] });
									isSelected[tmp[0] + dx[k]][tmp[1] + dy[k]] = true;
								}
							}
						}
						count++;
					}
				}
			}
			System.out.println(count);
		}
	}

}
