package solving;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

class Pair implements Comparable<Pair> {
	int x;
	int y;
	int idx;

	public Pair(int idx, int x, int y) {
		super();
		this.x = x;
		this.y = y;
		this.idx = idx;
	}

	@Override
	public String toString() {
		return "Pair [x=" + x + ", y=" + y + ", idx=" + idx + "]";
	}

	@Override
	public int compareTo(Pair o) {
		return this.idx - o.idx;
	}

}

public class BOJ_15686 {
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	static ArrayList<Pair> house = new ArrayList<Pair>();
	static ArrayList<Pair> chicken = new ArrayList<Pair>();
	static int arr[], dist;

	static boolean np() {
		int i = arr.length - 1;
		while (i > 0 && arr[i - 1] >= arr[i])
			--i;
		if (i == 0)
			return false;

		int j = arr.length - 1;
		while (arr[i - 1] >= arr[j])
			--j;
		swap(i - 1, j);

		int k = arr.length - 1;
		while (i < k)
			swap(i++, k--);
		return true;

	}

	static void swap(int i, int j) {
		int tmp = arr[i];
		arr[i] = arr[j];
		arr[j] = tmp;
	}

	public static void main(String[] args) throws Exception {
		st = new StringTokenizer(in.readLine(), " ");
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		dist = Integer.MAX_VALUE;
		int house_idx = 0;
		int chicken_idx = 0;
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(in.readLine(), " ");
			for (int j = 0; j < N; j++) {
				int tmp = Integer.parseInt(st.nextToken());
				if (tmp == 1)
					house.add(new Pair(house_idx++, i, j));
				if (tmp == 2)
					chicken.add(new Pair(chicken_idx++, i, j));
			}
		}
		arr = new int[chicken.size()];
		int val = 0;
		while (val < M) {
			arr[arr.length - 1 - val++] = 1;
		}

		do {
			int sum = 0;
			for (int i = 0; i < house.size(); i++) {
				int res = Integer.MAX_VALUE;
				for (int j = 0; j < arr.length; j++) {
					if (arr[j] == 1) {
						res = Math.min(getDist(chicken.get(j), house.get(i)), res);
					}
				}
				sum += res;
			}
			dist = Math.min(sum, dist);
		} while (np());

		System.out.println(dist);
	}

	private static int getDist(Pair pair, Pair pair2) {
		return Math.abs(pair.x - pair2.x) + Math.abs(pair.y - pair2.y);
	}

}
