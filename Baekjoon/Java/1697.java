import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ_1697 {
	static int start, finish;
	static boolean check[];
	static boolean flag = false;
	public static void main(String[] args) throws Exception{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(in.readLine());
		start = Integer.parseInt(st.nextToken());
		finish = Integer.parseInt(st.nextToken());
		check = new boolean[1000001];
		
		if(start >= finish) {
			System.out.println(start - finish);
		}else {
			System.out.println(BFS());
		}
		
	}
	private static int BFS() {
		Queue<int[]> q = new LinkedList<>();
		
		q.offer(new int[] {start, 0});
		check[start] = true;
		
		while(!q.isEmpty()) {
			int[] tmp = q.poll();
			if(tmp[0]==finish) {
				return tmp[1];
			}
			int k = Integer.MAX_VALUE;
			for (int i = 0; i < 3; i++) {
				switch(i) {
				case 0:
					k = tmp[0] -1;
					break;
				case 1:
					k = tmp[0] +1;
					break;
				case 2:
					k = tmp[0] *2;
					break;
				}
				if(k < 0 || k >= 1000000) continue;
				if(check[k]) continue;
				check[k] = true;
				q.offer(new int[] {k, tmp[1]+1});
			}
		}
		return 0;
	}
	

}
