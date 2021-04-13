package solving;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class BOJ_17406 {
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	static int R, C, K, map[][];

	static class APP implements Comparable<APP> {
		int x, y, range;

		public APP(int x, int y, int range) {
			super();
			this.x = x;
			this.y = y;
			this.range = range;
		}

		@Override
		public String toString() {
			return "APP [x=" + x + ", y=" + y + ", range=" + range + "]";
		}

		public int compareTo(APP o) {
			if (this.range == o.range) {
				if (this.x == o.x)
					return this.y - o.y;
				return this.x - o.x;
			}
			return this.range - o.range;
		}

	}

	static ArrayList<APP> list = new ArrayList<>();
	static boolean isSelected[];

	public static void main(String[] args) throws Exception {
		st = new StringTokenizer(in.readLine(), " ");
		R = Integer.parseInt(st.nextToken());
		C = Integer.parseInt(st.nextToken());
		K = Integer.parseInt(st.nextToken());
		map = new int[R + 1][C + 1];
		for (int i = 1; i <= R; i++) {
			st = new StringTokenizer(in.readLine(), " ");
			for (int j = 1; j <= C; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
			}
		}

		for (int i = 1; i <= K; i++) {
			st = new StringTokenizer(in.readLine(), " ");
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			int range = Integer.parseInt(st.nextToken());
			list.add(new APP(x, y, range));
		}

		Collections.sort(list);

		do {
			process();
		} while (np());

		System.out.println(res);

	}

	static int res = Integer.MAX_VALUE;
	static int arr[][];

	private static void process() {
		deepcopy();

		for (int i = 0; i < list.size(); i++) {
			APP app = list.get(i);
			rotation(arr, app);
		}
		for (int i = 1; i <= R; i++) {
			int answer = 0;
			for (int j = 1; j <= C; j++) {
				answer += arr[i][j];
			}
			res = Math.min(answer, res);
		}

	}

	private static void deepcopy() {
		arr = new int[R + 1][C + 1];
		for (int i = 1; i <= R; i++) {
			for (int j = 1; j <= C; j++) {
				arr[i][j] = map[i][j];
			}
		}
	}

	private static void rotation(int[][] arr, APP app) {
		int xs = app.x - app.range;
		int xf = app.x + app.range;
		int ys = app.y - app.range;
		int yf = app.y + app.range;
		for (int i = 0; i < app.range; i++) {
			rotate(arr, xs + i, xf - i, ys + i, yf - i);
		}
	}

	private static void rotate(int[][] arr, int xs, int xf, int ys, int yf) {
		int a1 = arr[xs][ys];
		int a2 = arr[xs][yf];
		int a3 = arr[xf][ys];
		int a4 = arr[xf][yf];
		for (int i = yf; i > ys; i--) {
			arr[xs][i] = arr[xs][i - 1];
		}
		for (int i = xf; i > xs; i--) {
			arr[i][yf] = arr[i - 1][yf];
		}
		for (int i = ys; i < yf; i++) {
			arr[xf][i] = arr[xf][i + 1];
		}
		for (int i = xs; i < xf; i++) {
			arr[i][ys] = arr[i + 1][ys];
		}

		arr[xs][ys + 1] = a1;
		arr[xs + 1][yf] = a2;
		arr[xf - 1][ys] = a3;
		arr[xf][yf - 1] = a4;

	}

	private static boolean np() {
		int i = list.size() - 1;
		while (i > 0 && list.get(i - 1).compareTo(list.get(i)) >= 0)
			--i;
		if (i == 0)
			return false;

		int j = list.size() - 1;
		while (list.get(i - 1).compareTo(list.get(j)) >= 0)
			--j;
		Collections.swap(list, i - 1, j);

		int k = list.size() - 1;
		while (i < k)
			Collections.swap(list, i++, k--);

		return true;
	}

}
