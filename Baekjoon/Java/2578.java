package solving;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_2578 {
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	static int count, check_num;
	static int map[][] = new int[5][5];

	public static void main(String[] args) throws Exception {
		for (int i = 0; i < 5; i++) {
			st = new StringTokenizer(in.readLine(), " ");
			for (int j = 0; j < 5; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		boolean flag = false;
		for (int i = 0; i < 5; i++) {
			st = new StringTokenizer(in.readLine(), " ");
			for (int j = 0; j < 5; j++) {
				int tmp = Integer.parseInt(st.nextToken());
				callNumber(tmp);
				check_num = 0;
				if (checkBingo()) {
					if (check_num >= 3) {
						flag = true;
						break;
					}
				}
			}
			if (flag)
				break;
		}
		System.out.println(count);

	}

	private static boolean checkBingo() {
		boolean flag = false;
		for (int i = 0; i < map.length; i++) {
			if (checkWidth(i)) {
				check_num++;
				flag = true;
			}
		}
		for (int i = 0; i < map.length; i++) {
			if (checkHeight(i)) {
				check_num++;
				flag = true;
			}
		}

		if (checkCross()) {
			flag = true;
		}

		return flag;
	}

	private static boolean checkHeight(int i) {
		int count = 0;
		for (int j = 0; j < map.length; j++) {
			if (map[j][i] == 0)
				count++;
		}
		if (count == 5)
			return true;
		return false;
	}

	private static boolean checkWidth(int i) {
		int count = 0;
		for (int j = 0; j < map.length; j++) {
			if (map[i][j] == 0)
				count++;
		}
		if (count == 5)
			return true;
		return false;
	}

	private static boolean checkCross() {
		int count = 0;
		int idx = 0;
		boolean flag = false;
		for (int i = 0; i < map.length; i++) {
			if (map[idx][idx] == 0) {
				count++;
			}
			idx++;
		}
		if (count == 5) {
			check_num++;
			flag = true;
		}
		count = 0;
		int idx_x = 0;
		int idx_y = 4;
		for (int i = 0; i < map.length; i++) {
			if (map[idx_x][idx_y] == 0) {
				count++;
			}
			idx_x++;
			idx_y--;
		}
		if (count == 5) {
			check_num++;
			flag = true;
		}
		return flag;
	}

	private static void callNumber(int num) {
		for (int i = 0; i < map.length; i++) {
			for (int j = 0; j < map.length; j++) {
				if (map[i][j] == num) {
					count++;
					map[i][j] = 0;
				}
			}
		}
	}
}
