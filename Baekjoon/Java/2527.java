package solving;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_2527 {
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		for (int i = 0; i < 4; i++) {
			StringTokenizer st = new StringTokenizer(in.readLine(), " ");
			int x1 = Integer.parseInt(st.nextToken());
			int y1 = Integer.parseInt(st.nextToken());
			int p1 = Integer.parseInt(st.nextToken());
			int q1 = Integer.parseInt(st.nextToken());

			int x2 = Integer.parseInt(st.nextToken());
			int y2 = Integer.parseInt(st.nextToken());
			int p2 = Integer.parseInt(st.nextToken());
			int q2 = Integer.parseInt(st.nextToken());

			if (p1 < x2 || p2 < x1 || y1 > q2 || y2 > q1) {
				System.out.println("d");
			} else if ((p1 == x2 && q1 == y2) || (x1 == p2 && y1 == q2) || (x2 == p1 && y1 == q2) ||(x1 == p2 && y2 == q1) ) {
				System.out.println("c");
			} else if ((p1 == x2) || (x1 == p2) || (q1 == y2) || (y1 == q2)) {
				System.out.println("b");
			} else {
				System.out.println("a");
			}

		}
	}
}
