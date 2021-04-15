import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class BOJ_2580 {
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	static int map[][] = new int[9][9];

	static class XY {
		int x, y;

		public XY(int x, int y) {
			this.x = x;
			this.y = y;
		}

		@Override
		public String toString() {
			return "XY [x=" + x + ", y=" + y + "]";
		}

	}

	static ArrayList<XY> list = new ArrayList<>();

	public static void main(String[] args) throws Exception {
		for (int i = 0; i < 9; i++) {
			st = new StringTokenizer(in.readLine(), " ");
			for (int j = 0; j < 9; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
				if (map[i][j] == 0)
					list.add(new XY(i, j));
			}
		}

		DFS(0);
	}

	static boolean check;

	private static void DFS(int idx) {
		if (check)
			return;
		if (idx == list.size()) {
			print();
			check = true;
			return;
		}

		XY point = list.get(idx);

		for (int i = 1; i <= 9; i++) {
			if (isAvail(point, i)) {
				map[point.x][point.y] = i;
				DFS(idx + 1);
				map[point.x][point.y] = 0;
			}
		}
	}

	private static void print() {
		for (int i = 0; i < map.length; i++) {
			for (int j = 0; j < map[i].length; j++) {
				System.out.print(map[i][j] + " ");
			}
			System.out.println();
		}
	}

	private static boolean isAvail(XY point, int val) {
		int x = point.x / 3;
		int y = point.y / 3;
		for (int i = x * 3; i < (x + 1) * 3; i++) {
			for (int j = y * 3; j < (y + 1) * 3; j++) {
				if (map[i][j] == val)
					return false;
			}
		}

		for (int i = 0; i < 9; i++) {
			if (map[i][point.y] == val)
				return false;
		}

		for (int i = 0; i < 9; i++) {
			if (map[point.x][i] == val)
				return false;
		}
		return true;
	}

}
