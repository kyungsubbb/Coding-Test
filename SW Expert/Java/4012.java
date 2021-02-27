package solving;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class SWEA_4012 {
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	static int map[][], N, isSelected[], res;

	public static void main(String[] args) throws Exception {
		int T = Integer.parseInt(in.readLine());
		for (int tc = 1; tc <= T; tc++) {
			N = Integer.parseInt(in.readLine());
			map = new int[N][N];
			isSelected = new int[N];
			res = Integer.MAX_VALUE;
			for (int i = 0; i < N / 2; i++) {
				isSelected[i] = 1;
			}
			Arrays.sort(isSelected);
			for (int i = 0; i < N; i++) {
				st = new StringTokenizer(in.readLine());
				for (int j = 0; j < N; j++) {
					map[i][j] = Integer.parseInt(st.nextToken());
				}
			}

			do {
				ArrayList<Integer> A = new ArrayList<Integer>();
				ArrayList<Integer> B = new ArrayList<Integer>();
				for (int i = 0; i < isSelected.length; i++) {
					if (isSelected[i] == 0)
						A.add(i);
					else if (isSelected[i] == 1)
						B.add(i);
				}
				int res_A = 0;
				int res_B = 0;

				for (int i = 0; i < N / 2; i++) {
					for (int j = 0; j < N / 2; j++) {
						if (i == j)
							continue;
						res_A += map[A.get(i)][A.get(j)];
						res_B += map[B.get(i)][B.get(j)];
					}
				}
				res = Math.min(Math.abs(res_A - res_B), res);
			} while (np());
			System.out.println("#" + tc + " " + res);
		}
	}

	private static boolean np() {
		int i = N - 1;
		while (i > 0 && isSelected[i - 1] >= isSelected[i])
			--i;
		if (i == 0)
			return false;

		int j = N - 1;
		while (isSelected[i - 1] >= isSelected[j])
			--j;
		swap(i - 1, j);

		int k = N - 1;
		while (i < k)
			swap(i++, k--);
		return true;
	}

	private static void swap(int i, int j) {
		int tmp = isSelected[i];
		isSelected[i] = isSelected[j];
		isSelected[j] = tmp;
	}

}
