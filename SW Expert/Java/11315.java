package solving;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SWEA_11315 {
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	static char[][] input;
	static int result;

	static int Lcross(int x, int y) { // 오른쪽 아래로
		int num = 1;
		int dx[] = { -1, 1 };
		int dy[] = { -1, 1 };
		int nx = x;
		int ny = y;
		while (nx + dx[0] >= 0 && nx + dx[0] < input.length && ny + dy[0] >= 0 && ny + dy[0] < input.length
				&& input[nx + dx[0]][ny + dy[0]] == 'o') {
			nx += dx[0];
			ny += dy[0];
			num++;
		}
		nx = x;
		ny = y;
		while (nx + dx[1] >= 0 && nx + dx[1] < input.length && ny + dy[1] >= 0 && ny + dy[1] < input.length
				&& input[nx + dx[1]][ny + dy[1]] == 'o') {
			nx += dx[1];
			ny += dy[1];
			num++;
		}

		return num;
	}

	static int Rcross(int x, int y) {
		int num = 1;
		int dx[] = { -1, 1 };
		int dy[] = { 1, -1 };
		int nx = x;
		int ny = y;
		while (nx + dx[0] >= 0 && nx + dx[0] < input.length && ny + dy[0] >= 0 && ny + dy[0] < input.length
				&& input[nx + dx[0]][ny + dy[0]] == 'o') {
			nx += dx[0];
			ny += dy[0];
			num++;
		}
		nx = x;
		ny = y;
		while (nx + dx[1] >= 0 && nx + dx[1] < input.length && ny + dy[1] >= 0 && ny + dy[1] < input.length
				&& input[nx + dx[1]][ny + dy[1]] == 'o') {
			nx += dx[1];
			ny += dy[1];
			num++;
		}

		return num;
	}

	static int vertical(int x, int y) {
		int num = 1;
		int dx[] = { -1, 1 };
		int nx = x;
		int ny = y;
		while (nx + dx[0] >= 0 && nx + dx[0] < input.length && input[nx + dx[0]][ny] == 'o') {
			nx += dx[0];
			num++;
		}
		nx = x;
		ny = y;
		while (nx + dx[1] >= 0 && nx + dx[1] < input.length && input[nx + dx[1]][ny] == 'o') {
			nx += dx[1];
			num++;
		}

		return num;
	}

	static int horizon(int x, int y) {
		int num = 1;
		int dy[] = { 1, -1 };
		int nx = x;
		int ny = y;
		while (ny + dy[0] >= 0 && ny + dy[0] < input.length && input[nx][ny + dy[0]] == 'o') {
			ny += dy[0];
			num++;
		}
		nx = x;
		ny = y;
		while (ny + dy[1] >= 0 && ny + dy[1] < input.length && input[nx][ny + dy[1]] == 'o') {
			ny += dy[1];
			num++;
		}

		return num;
	}

	public static void main(String[] args) throws Exception {
		int T = Integer.parseInt(in.readLine());
		for (int tc = 1; tc <= T; tc++) {
			result = Integer.MIN_VALUE;
			int N = Integer.parseInt(in.readLine());
			input = new char[N][N];
			for (int i = 0; i < N; i++) {
				input[i] = in.readLine().toCharArray();
			}

			for (int i = 0; i < input.length; i++) {
				for (int j = 0; j < input[i].length; j++) {
					if (input[i][j] == 'o') {
						int v1 = Rcross(i, j);
						int v2 = Lcross(i, j);
						int v3 = horizon(i, j);
						int v4 = vertical(i, j);
						int tmp = Math.max(v1, v2);
						int tmp2 = Math.max(v3, v4);
						int res = Math.max(tmp, tmp2);
						result = Math.max(res, result);
					}
				}
			}
			if (result >= 5) {
				System.out.println("#" + tc + " YES");
			} else {
				System.out.println("#" + tc + " NO");
			}

		}
	}
}
