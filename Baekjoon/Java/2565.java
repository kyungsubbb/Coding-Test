import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;
class Building implements Comparable<Building>{
	int from;
	int to;
	public Building(int from, int to) {
		super();
		this.from = from;
		this.to = to;
	}
	@Override
	public int compareTo(Building o) {
		return this.from - o.from;
	}
	@Override
	public String toString() {
		return "Building [from=" + from + ", to=" + to + "]";
	}
	
	
}
public class BOJ_2565 {
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	static ArrayList<Building> list = new ArrayList<Building>();
	public static void main(String[] args) throws Exception {
		int N = Integer.parseInt(in.readLine());
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(in.readLine(), " ");
			int from = Integer.parseInt(st.nextToken());
			int to = Integer.parseInt(st.nextToken());
			list.add(new Building(from, to));
		}
		
		Collections.sort(list);
		int[] dp = new int[N];
		int max = 0;
		for (int i = 0; i < N; i++) {
			dp[i] = 1;
			for (int j = 0; j < i; j++) {
				if(list.get(j).to < list.get(i).to) {
					dp[i] = Math.max(dp[i], dp[j]+1);
				}
			}
			max = Math.max(max, dp[i]);
		}
		System.out.println(N-max);
		
	}

}
