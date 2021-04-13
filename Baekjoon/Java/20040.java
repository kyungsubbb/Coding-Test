import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_20040 {
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	static int parents[], N, M;

	public static void main(String[] args) throws Exception {
		st = new StringTokenizer(in.readLine(), " ");
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());

		makeSet();
		boolean flag = false;
		for (int i = 0; i < M; i++) {
			st = new StringTokenizer(in.readLine(), " ");
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			if (!unionSet(a, b)) {
				flag = true;
				System.out.println(i + 1);
				break;
			}
		}
		if (!flag)
			System.out.println(0);

	}

	private static void makeSet() {
		parents = new int[N];
		for (int i = 0; i < N; i++) {
			parents[i] = i;
		}
	}

	private static int findSet(int a) {
		if (parents[a] == a)
			return a;
		return parents[a] = findSet(parents[a]);
	}

	private static boolean unionSet(int a, int b) {
		if (findSet(a) == findSet(b))
			return false;
		parents[findSet(b)] = findSet(a);
		return true;
	}

}
