import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.StringTokenizer;

public class BOJ_1764 {
	static HashMap<String, Integer> map = new HashMap<>();
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	static int num;
	static ArrayList<String> list = new ArrayList<>();

	public static void main(String[] args) throws Exception {
		st = new StringTokenizer(in.readLine(), " ");
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		for (int i = 0; i < N; i++) {
			String tmp = in.readLine();
			if (!map.containsKey(tmp)) {
				map.put(tmp, 1);
			} else {
				map.put(tmp, map.get(tmp) + 1);
			}
		}
		for (int i = 0; i < M; i++) {
			String tmp = in.readLine();
			if (!map.containsKey(tmp)) {
				map.put(tmp, 1);
			} else {
				map.put(tmp, map.get(tmp) + 1);
			}
		}

		for (String k : map.keySet()) {
			if (map.get(k) > 1) {
				num++;
			}
		}
		System.out.println(num);
		for (String k : map.keySet()) {
			if (map.get(k) > 1) {
				list.add(k);
			}
		}
		Collections.sort(list);
		for (String k : list) {
			System.out.println(k);
		}
	}

}
