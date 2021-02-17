import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class BOJ_1655 {
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) throws Exception {
		PriorityQueue<Integer> q = new PriorityQueue<Integer>((o1, o2) -> o1-o2);
		PriorityQueue<Integer> p = new PriorityQueue<Integer>((o1, o2) -> o2-o1);
		int N = Integer.parseInt(in.readLine());
		for (int i = 0; i < N; i++) {
			int tmp = Integer.parseInt(in.readLine());
			if(q.size() == p.size()) p.offer(tmp);
			else q.offer(tmp);
			
			if(!q.isEmpty() && !p.isEmpty()) {
				if(q.peek() < p.peek()) {
					int eq = q.poll();
					q.offer(p.poll());
					p.offer(eq);
				}
			}
			sb.append(p.peek()).append("\n");
		}
		System.out.println(sb);
	}

}
