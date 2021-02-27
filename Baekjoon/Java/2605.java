package solving;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class BOJ_2605 {
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws Exception {
		int N = Integer.parseInt(in.readLine());
		int count = 1;
		ArrayList<Integer> list = new ArrayList<>();
		StringTokenizer st = new StringTokenizer(in.readLine(), " ");
		list.add(count++);
		st.nextToken();
		for (int i = 1; i < N; i++) {
			int tmp = Integer.parseInt(st.nextToken());
			list.add(tmp, count++);
		}
		for (int i = N-1; i >= 0; i--) {
			System.out.print(list.get(i)+" ");
		}
		
	}

}
