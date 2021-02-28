package solving;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ_10819 {
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	static int map[], res = Integer.MIN_VALUE;
	private static boolean np() {
		int i = map.length-1;
		while(i>0 && map[i-1]>= map[i]) --i;
		if(i==0) return false;
		int j = map.length-1;
		while(map[i-1]>=map[j]) --j;
		swap(i-1, j);
		int k = map.length-1;
		while(i<k) swap(i++, k--);
		return true;
	}
	private static void swap(int i, int j) {
		int tmp = map[i];
		map[i] = map[j];
		map[j] = tmp;
	}
	public static void main(String[] args) throws Exception{
		int N = Integer.parseInt(in.readLine());
		map = new int[N];
		st = new StringTokenizer(in.readLine(), " ");
		for (int i = 0; i < map.length; i++) {
			map[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(map);
		do {
			int tmp = 0;
			for (int i = 1; i < map.length; i++) {
				tmp += Math.abs(map[i-1]-map[i]);
			}
			res = Math.max(res, tmp);
		}while(np());
		System.out.println(res);
	}
	
}
