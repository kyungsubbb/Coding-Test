import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ_1158 {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(in.readLine(), " ");
		StringBuilder sb = new StringBuilder("");
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());

		Queue<Integer> q = new LinkedList<>();
		for (int i = 1; i <= N; i++) {
			q.offer(i);
		}
		int cnt = 1;
		sb.append("<");
		while (!q.isEmpty()) {
			int tmp = q.poll();
			if (cnt == K) {
				cnt = 1;
				sb.append(tmp + ", ");
			} else {
				q.offer(tmp);
				cnt++;
			}
		}
		sb.setLength(sb.length() - 2);
		sb.append(">");
		System.out.println(sb);
	}

}
