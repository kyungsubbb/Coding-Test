import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ_4386 {
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	static final double INF = Double.MAX_VALUE;
	static double res;

	static class XY {
		double x, y;

		public XY(double x, double y) {
			super();
			this.x = x;
			this.y = y;
		}

		@Override
		public String toString() {
			return "XY [x=" + x + ", y=" + y + "]";
		}

	}

	static ArrayList<XY> list = new ArrayList<>();
	static boolean isSelected[];
	static double MinArr[];

	public static void main(String[] args) throws Exception {
		int N = Integer.parseInt(in.readLine());
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(in.readLine(), " ");
			double x = Double.parseDouble(st.nextToken());
			double y = Double.parseDouble(st.nextToken());
			list.add(new XY(x, y));
		}
		double map[][] = new double[N][N];
		isSelected = new boolean[N];
		MinArr = new double[N];
		Arrays.fill(MinArr, INF);
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				map[i][j] = getLength(i, j);
			}
		}

		MinArr[0] = 0;

		int cnt = 0;
		while (true) {
			int idx = 0;
			double val = Double.MAX_VALUE;
			for (int i = 0; i < N; i++) {
				if (!isSelected[i] && MinArr[i] < val) {
					val = MinArr[i];
					idx = i;
				}
			}

			isSelected[idx] = true;
			res += MinArr[idx];
			if (++cnt == N)
				break;
			for (int i = 0; i < N; i++) {
				if (!isSelected[i] && map[idx][i] < MinArr[i]) {
					MinArr[i] = map[idx][i];
				}
			}

		}
		System.out.println((double) Math.round(res * 100) / 100);

	}

	private static double getLength(int i, int j) {
		XY one = list.get(i);
		XY two = list.get(j);

		return Math.sqrt(Math.pow(one.x - two.x, 2) + Math.pow(one.y - two.y, 2));
	}

}
