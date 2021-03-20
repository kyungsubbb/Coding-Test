import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SWEA_3289 {
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	static StringBuilder sb = new StringBuilder("");
	static int parents[];
	public static void main(String[] args) throws Exception {
		int T = Integer.parseInt(in.readLine());
		for (int tc = 1; tc <= T; tc++) {
			st = new StringTokenizer(in.readLine(), " ");
			int N = Integer.parseInt(st.nextToken());
			int M = Integer.parseInt(st.nextToken());
			parents = new int[N+1];
			make();
			sb.append("#").append(tc).append(" ");
			for (int i = 0; i < M; i++) {
				st = new StringTokenizer(in.readLine(), " ");
				int mode = Integer.parseInt(st.nextToken());
				int pre = Integer.parseInt(st.nextToken());
				int post = Integer.parseInt(st.nextToken());
				if(mode == 0) {
					unionSet(pre, post);
				}else {
					findEqualSet(pre, post);
				}
			}
			sb.append("\n");
		}
		System.out.println(sb);
	}
	private static void findEqualSet(int pre, int post) {
		if(findSet(pre) == findSet(post)) {
			sb.append(1);
			return;
		}
		sb.append(0);
	}
	private static void unionSet(int pre, int post) {
		if(findSet(pre) == findSet(post)) return;
		parents[findSet(post)] = findSet(pre);
	}
	private static int findSet(int a) {
		if(parents[a] == a) return a;
		return parents[a] = findSet(parents[a]);
	}
	private static void make() {
		for (int i = 0; i < parents.length; i++) {
			parents[i] = i;
		}
	}
}
