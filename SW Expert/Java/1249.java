import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class SWEA_1249 {
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	static int map[][];
	static int arr[][];
	static int res;

	static class Idx {
		int x, y, val;

		public Idx(int x, int y, int val) {
			super();
			this.x = x;
			this.y = y;
			this.val = val;
		}

	}

	public static void main(String[] args) throws Exception {
		int T = Integer.parseInt(in.readLine());
		for (int tc = 1; tc <= T; tc++) {
			int n = Integer.parseInt(in.readLine());
			map = new int[n][n];
			arr = new int[n][n];
			for (int i = 0; i < arr.length; i++) {
				Arrays.fill(arr[i], Integer.MAX_VALUE);
			}

			res = Integer.MAX_VALUE;
			for (int i = 0; i < n; i++) {
				String stmp = in.readLine();
				for (int j = 0; j < n; j++) {
					map[i][j] = stmp.charAt(j) - '0';
				}
			}

			BFS(0, 0, n);
			res = arr[n - 1][n - 1];
			System.out.println("#" + tc + " " + res);
		}
	}

	static int dx[] = { -1, 0, 0, 1 };
	static int dy[] = { 0, -1, 1, 0 };

	private static void print(int[][] arr) {
		System.out.println("----------------------------------------");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(Arrays.toString(arr[i]));
		}
	}

	private static void BFS(int a, int b, int n) {
		Queue<Idx> q = new LinkedList<>();
		Idx start = new Idx(0, 0, 0);
		q.offer(start);
		while (!q.isEmpty()) {
			Idx tmp = q.poll();
			for (int i = 0; i < 4; i++) {
				int nx = tmp.x + dx[i];
				int ny = tmp.y + dy[i];
				if (!isAvail(nx, ny, n))
					continue;
				if (tmp.val + map[nx][ny] < arr[nx][ny]) {
					q.offer(new Idx(nx, ny, tmp.val + map[nx][ny]));
					arr[nx][ny] = Math.min(arr[nx][ny], tmp.val + map[nx][ny]);
				}

			}
			// print(arr);

		}
	}

	private static boolean isAvail(int a, int b, int n) {
		if (a == 0 && b == 0)
			return false;
		if (a < 0 || b < 0 || a >= n || b >= n)
			return false;
		return true;
	}

}
