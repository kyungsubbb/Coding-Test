package solving;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class BOJ_10816 {
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static HashMap<Integer, Integer> hash = new HashMap<Integer, Integer>();

	public static void main(String[] args) throws Exception {
		int M = Integer.parseInt(in.readLine());
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(in.readLine(), " ");
		for (int i = 0; i < M; i++) {
			int tmp = Integer.parseInt(st.nextToken());
			if (!hash.containsKey(tmp)) {
				hash.put(tmp, 1);
			} else {
				hash.put(tmp, hash.get(tmp) + 1);
			}
		}

		int count = Integer.parseInt(in.readLine());
		st = new StringTokenizer(in.readLine(), " ");
		for (int i = 0; i < count; i++) {
			int tmp = Integer.parseInt(st.nextToken());
			if (hash.containsKey(tmp))
				sb.append(hash.get(tmp)).append(" ");
			else
				sb.append("0 ");
		}
		sb.setLength(sb.length() - 1);
		System.out.println(sb);
	}

}
