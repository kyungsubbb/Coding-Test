package solving;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ_9663 {
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static int N, map[][], count;

	public static void main(String[] args) throws Exception {
		N = Integer.parseInt(in.readLine());
		map = new int[N][N];

		for (int i = 0; i < N; i++) {
			map[0][i] = 1;
			DFS(0, i, 1); // row, col, 갯수
			map[0][i] = 0;
		}
		System.out.println(count);
	}

	private static void DFS(int a, int b, int cnt) {
		if (!checkAv(a, b))
			return;
		if (cnt == N) {
			count++;
			return;
		}
		for (int i = 0; i < N; i++) {
			map[a + 1][i] = 1;
			DFS(a + 1, i, cnt + 1);
			map[a + 1][i] = 0;
		}

	}

	private static boolean checkAv(int a, int b) {
		if (!checkCol(a, b))
			return false;
		if (!checkCross(a, b))
			return false;
		return true;
	}

	private static boolean checkCross(int a, int b) {

		int x = a, y = b;
		while (x > 0 && y > 0) {
			if (map[--x][--y] == 1)
				return false;
		}
		x = a;
		y = b;
		while (x < N - 1 && y < N - 1) {
			if (map[++x][++y] == 1)
				return false;
		}
		x = a;
		y = b;
		while (x > 0 && y < N - 1) {
			if (map[--x][++y] == 1)
				return false;
		}
		x = a;
		y = b;
		while (x < N - 1 && y > 0) {
			if (map[++x][--y] == 1)
				return false;
		}

		return true;
	}

	private static boolean checkCol(int a, int b) {
		int tmp = a;
		while (tmp > 0) {
			if (map[--tmp][b] == 1)
				return false;
		}
		tmp = a;
		while (tmp < N - 1) {
			if (map[++tmp][b] == 1)
				return false;
		}
		return true;
	}

}
