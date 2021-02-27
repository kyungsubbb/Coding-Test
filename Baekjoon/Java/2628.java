import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ_2628 {
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	static int res = 0;
	public static void main(String[] args) throws Exception {
		Queue<int[]> q = new LinkedList<>();
		st = new StringTokenizer(in.readLine(), " ");
		int c = Integer.parseInt(st.nextToken());
		int r = Integer.parseInt(st.nextToken());
		q.offer(new int[] {0, 0, c, r});
		int N = Integer.parseInt(in.readLine());
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(in.readLine(), " ");
			int dir = Integer.parseInt(st.nextToken());
			int num = Integer.parseInt(st.nextToken());
			final int size = q.size();
			for (int j = 0; j < size; j++) {
				int[] tmp = q.poll();
				if(num > tmp[1-dir] && num < tmp[1-dir+2]) {
					if(dir == 0) {
						q.offer(new int[] {tmp[0], tmp[1], tmp[2], num});
						q.offer(new int[] {tmp[0], num, tmp[2], tmp[3]});
					}else if(dir == 1) {
						q.offer(new int[] {tmp[0], tmp[1], num, tmp[3]});
						q.offer(new int[] {num, tmp[1], tmp[2], tmp[3]});
					}
				}
				else {
					q.offer(tmp);
				}
			}
		}
		for(int[] tmp : q) {
			int square = Math.abs(tmp[2]-tmp[0]) * Math.abs(tmp[3]-tmp[1]);
			res = Math.max(res, square);
		}
		System.out.println(res);
	}

}
