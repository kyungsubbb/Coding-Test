import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class BOJ_5430 {
	private static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	private static Deque<Integer> arr;
	private static StringTokenizer st;
	private static boolean mode = false, flag; // false : 원래방향 , true : 반대방향
	static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) throws Exception {
		int T = Integer.parseInt(in.readLine());
		for (int tc = 0; tc < T; tc++) {
			String p = in.readLine();
			int N = Integer.parseInt(in.readLine());
			String tmp = in.readLine().replace("[", "").replace("]", "");
			st = new StringTokenizer(tmp, ",");
			arr = new ArrayDeque<>();
			flag = false;
			mode = false;
			for (int i = 0; i < N; i++) {
				arr.add(Integer.parseInt(st.nextToken()));
			}
			for (int i = 0; i < p.length(); i++) {
				if (p.charAt(i) == 'R') {
					mode = !mode;
				} else {
					if (arr.isEmpty()) {
						flag = true;
						break;
					} else {
						if (mode) {
							arr.removeLast();
						} else {
							arr.removeFirst();
						}
					}
				}
			}
			if (!flag) {
				sb.append("[");
				if (mode) {
					while (arr.size() > 1) {
						sb.append(arr.pollLast() + ",");
					}
				} else {
					while (arr.size() > 1) {
						sb.append(arr.pollFirst() + ",");
					}
				}
				if (arr.size() != 0)
					sb.append(arr.getFirst());
				sb.append("]\n");
			} else {
				sb.append("error\n");
			}
		}
		System.out.println(sb);
	}

}
