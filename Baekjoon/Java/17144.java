import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	static int r, c, map[][], time;
	static ArrayList<int[]> AC = new ArrayList<>();

	public static void main(String[] args) throws Exception {
		st = new StringTokenizer(in.readLine());
		r = Integer.parseInt(st.nextToken());
		c = Integer.parseInt(st.nextToken());
		time = Integer.parseInt(st.nextToken());

		map = new int[r][c];

		for (int i = 0; i < r; i++) {
			st = new StringTokenizer(in.readLine(), " ");
			for (int j = 0; j < c; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
				if (map[i][j] == -1)
					AC.add(new int[] { i, j });
			}
		}

		while (time-- > 0) {
			spread();
			flow();

		}
		System.out.println(plusMap());
	}

	private static int plusMap() {
		int ans = 0;
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				if (map[i][j] != -1)
					ans += map[i][j];
			}
		}
		return ans;
	}

	private static void print(int[][] map) {
		System.out.println("----print----");
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				System.out.print(map[i][j] + "\t");
			}
			System.out.println();
		}
	}

	private static void flow() {
		int[] up = AC.get(0);
		int[] down = AC.get(1);

		circular(up, false);
		circular(down, true);
	}

	private static void circular(int[] idx, boolean isClockwise) {
		int con[] = new int[4];
		if (isClockwise) { // 아래
			con[0] = map[idx[0]][idx[1]];
			con[1] = map[idx[0]][c - 1];
			con[2] = map[r - 1][0];
			con[3] = map[r - 1][c - 1];

			// 중간 값 돌리기
			for (int i = c - 1; i > 1; i--) {
				map[idx[0]][i] = map[idx[0]][i - 1];
			}
			for (int i = r - 1; i > idx[0] + 1; i--) {
				map[i][c - 1] = map[i - 1][c - 1];
			}
			for (int i = 0; i < c - 2; i++) {
				map[r - 1][i] = map[r - 1][i + 1];
			}
			for (int i = idx[0]; i < r - 2; i++) {
				if (map[i][0] == -1)
					continue;
				map[i][0] = map[i + 1][0];
			}
			map[idx[0]][idx[1] + 1] = 0;

			map[idx[0] + 1][c - 1] = con[1];
			map[r - 2][0] = con[2];
			map[r - 1][c - 2] = con[3];

			// 꼭짓점 값 넣기
		} else { // 위
			con[0] = map[0][0];
			con[1] = map[0][c - 1];
			con[2] = map[idx[0]][0];
			con[3] = map[idx[0]][c - 1];

			for (int i = 0; i < c - 2; i++) {
				map[0][i] = map[0][i + 1];
			}
			for (int i = 0; i < idx[0]; i++) {
				map[i][c - 1] = map[i + 1][c - 1];
			}
			for (int i = c - 1; i > 0; i--) {
				// -1 체크 필요
				map[idx[0]][i] = map[idx[0]][i - 1];

			}
			for (int i = idx[0]; i > 0; i--) {
				// -1 체크 필요
				if (map[i][0] == -1)
					continue;
				map[i][0] = map[i - 1][0];
			}

			map[idx[0]][idx[1] + 1] = 0;
			map[1][0] = con[0];
			map[0][c - 2] = con[1];
			map[idx[0] - 1][c - 1] = con[3];

		}
	}

	static int dx[] = { -1, 0, 0, 1 };
	static int dy[] = { 0, -1, 1, 0 };

	private static void spread() {
		int arr[][] = new int[r][c];

		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				if (map[i][j] > 0) {
					int amount = map[i][j] / 5;
					if (amount == 0)
						continue;
					for (int k = 0; k < 4; k++) {
						int nx = i + dx[k];
						int ny = j + dy[k];
						if (nx < 0 || nx >= r || ny < 0 || ny >= c)
							continue;
						if (map[nx][ny] == -1)
							continue;
						arr[nx][ny] += amount;
						map[i][j] -= amount;
					}
				}
			}
		}

		plusDust(arr);

	}

	private static void plusDust(int[][] arr) {
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				map[i][j] += arr[i][j];
			}
		}
	}

}