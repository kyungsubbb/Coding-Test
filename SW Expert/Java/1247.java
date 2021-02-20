package solving;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

class Pair implements Comparable<Pair> {
	int x;
	int y;

	public Pair(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public String toString() {
		return "Pair [x=" + x + ", y=" + y + "]";
	}

	@Override
	public int compareTo(Pair o) {
		if (this.y == o.y)
			return this.x - this.x;
		return this.y - o.y;
	}

}

public class SWEA_1247 {
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static Queue<Pair> spot;
	static StringTokenizer st;
	static boolean isSelected[];
	static Pair arr[], con[], home, company;
	static int res;

	static void perm(int idx) {
		if (idx == arr.length) {
			spot = new LinkedList<Pair>();
			spot.offer(company);
			for (int i = 0; i < arr.length; i++) {
				spot.offer(arr[i]);
			}
			spot.offer(home);

			int ans = 0;
			Pair pre = spot.poll();
			while (!spot.isEmpty()) {
				Pair after = spot.poll();
				ans += Math.abs(pre.x - after.x) + Math.abs(pre.y - after.y);
				pre = after;
			}
			res = Math.min(res, ans);
			return;
		}
		for (int i = 0; i < con.length; i++) {
			if (isSelected[i])
				continue;
			isSelected[i] = true;
			arr[idx] = con[i];
			perm(idx + 1);
			isSelected[i] = false;
		}
	}

	public static void main(String[] args) throws Exception {
		int T = Integer.parseInt(in.readLine());
		for (int tc = 1; tc <= T; tc++) {
			res = Integer.MAX_VALUE;
			int N = Integer.parseInt(in.readLine());
			con = new Pair[N];
			arr = new Pair[N];
			isSelected = new boolean[N];
			st = new StringTokenizer(in.readLine(), " ");
			company = new Pair(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
			home = new Pair(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));

			for (int i = 0; i < con.length; i++) {
				con[i] = new Pair(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
			}
			perm(0);
			System.out.println("#"+tc+" "+res);

		}
	}

}
