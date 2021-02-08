import java.util.*;
import java.io.*;

public class SWEA_1204 {
	static HashMap<Integer, Integer> map;

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder("");
		int T = Integer.parseInt(in.readLine());
		for (int tc = 1; tc <= T; tc++) {
			map = new HashMap<>();
			in.readLine();
			String[] val = in.readLine().split(" ");
			for (int i = 0; i < val.length; i++) {
				if (!map.containsKey(Integer.parseInt(val[i]))) {
					map.put(Integer.parseInt(val[i]), 1);
				} else {
					map.put(Integer.parseInt(val[i]), map.get(Integer.parseInt(val[i])) + 1);
				}
			}
			int key = Integer.MIN_VALUE;
			int value = Integer.MIN_VALUE;
			for (int k : map.keySet()) {
				if (map.get(k) >= value) {
					key = k;
					value = map.get(k);
				}
			}
			sb.append("#").append(tc).append(" ").append(key).append("\n");
		}
		System.out.println(sb);
	}

}
