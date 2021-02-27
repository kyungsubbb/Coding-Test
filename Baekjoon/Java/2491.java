package solving;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_2491 {
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static int map[],  res = 1, up=1, down=1;
	public static void main(String[] args) throws Exception {
		int N = Integer.parseInt(in.readLine());
		StringTokenizer st = new StringTokenizer(in.readLine(), " ");
		int tmp = Integer.parseInt(st.nextToken());
		for (int i = 1; i < N; i++) {
			int val = Integer.parseInt(st.nextToken());
			if(tmp > val) {
				down++;
				up = 1;
				res = Math.max(down, res);
			}
			else if(tmp < val) {
				up++;
				down = 1;
				res = Math.max(up, res);
			}
			else {
				up++;
				down++;
				res = Math.max(down, res);
				res = Math.max(up, res);
			}
			tmp = val;
			
		}
		System.out.println(res);
	}
}
