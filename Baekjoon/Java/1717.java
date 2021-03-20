import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_1717 {
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	static int p[], n, m;
	public static void main(String[] args) throws Exception{
		st = new StringTokenizer(in.readLine(), " ");
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		make();
		
		for (int i = 0; i < m; i++) {
			st = new StringTokenizer(in.readLine(), " ");
			int mode = Integer.parseInt(st.nextToken());
			int pre = Integer.parseInt(st.nextToken());
			int post = Integer.parseInt(st.nextToken());
			
			switch(mode) {
			case 0:
				unionSet(pre, post);
				break;
			case 1:
				if(findSet(pre) == findSet(post)) {
					System.out.println("YES");
				}
				else {
					System.out.println("NO");
				}
				break;
			}
		}
	}
	private static int findSet(int i) {
		if(p[i] == i) return i;
		return p[i] = findSet(p[i]);
	}
	private static void unionSet(int pre, int post) {
		if(findSet(pre) == findSet(post)) return;
		p[findSet(post)] = findSet(pre); 
	}
	private static void make() {
		p = new int[n+1];
		for (int i = 0; i < n+1; i++) {
			p[i] = i;
		}
	}

}
