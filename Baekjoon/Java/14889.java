package solving;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ_14889 {
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	static int arr[][], isSelected[], result = Integer.MAX_VALUE;

	public static void main(String[] args) throws Exception {
		int N = Integer.parseInt(in.readLine());
		arr = new int[N][N];
		isSelected = new int[N];
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(in.readLine(), " ");
			for (int j = 0; j < N; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		for (int i = 0; i < N / 2; i++) {
			isSelected[i] = 1;
		}
		Arrays.sort(isSelected);
		do {

			check(isSelected);

			if (result == 0)
				break;

		} while (np());
		System.out.println(result);
	}

	private static void check(int[] isSelected) {
		ArrayList<Integer> start = new ArrayList<>();
		ArrayList<Integer> link = new ArrayList<>();
		for (int i = 0; i < isSelected.length; i++) {
			if (isSelected[i] == 0) { // start team
				start.add(i);
			} else if (isSelected[i] == 1) { // link team
				link.add(i);
			}
		}

		int v1 = 0;				// start team의 합
		int v2 = 0;				// link team의 합
		for (int i = 0; i < start.size(); i++) {			// 각 리스트에서 합계 구하기
			for (int j = 0; j < start.size(); j++) {
				if (start.get(i) != start.get(j)) {
					v1 += arr[start.get(i)][start.get(j)];
				}
			}
			for (int j = 0; j < link.size(); j++) {
				if (link.get(i) != link.get(j)) {
					v2 += arr[link.get(i)][link.get(j)];
				}
			}
		}
		result = Math.min(Math.abs(v1 - v2), result);		// 최솟값 구하기
	}

	private static boolean np() {
		int i = isSelected.length - 1;
		while (i > 0 && isSelected[i - 1] >= isSelected[i])
			--i;
		if (i == 0)
			return false;

		int j = isSelected.length - 1;
		while (isSelected[i - 1] >= isSelected[j])
			--j;
		swap(i - 1, j);

		int k = isSelected.length - 1;
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
