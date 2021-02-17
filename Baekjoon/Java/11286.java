import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class BOJ_11286 {
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws Exception {
		PriorityQueue<Integer> q = new PriorityQueue<Integer>(new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				int tmp = Math.abs(o1)-Math.abs(o2);
				if(tmp == 0) {
					return o1-o2;
				}
				return tmp;
			}
		});
		int N = Integer.parseInt(in.readLine());
		for (int i = 0; i < N; i++) {
			int tmp = Integer.parseInt(in.readLine());
			if (tmp == 0) {
				if (q.isEmpty())
					System.out.println(0);
				else
					System.out.println(q.poll());
			} else {
				q.offer(tmp);
			}
		}
	}

}
