import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ_1260 {
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	static int V, E, start;
	static int[][] map;
	static boolean[] visited;

	public static void main(String[] args) throws Exception {
		st = new StringTokenizer(in.readLine(), " ");
		V = Integer.parseInt(st.nextToken());
		E = Integer.parseInt(st.nextToken());
		start = Integer.parseInt(st.nextToken());
		map = new int[V + 1][V + 1];
		for (int i = 0; i < E; i++) {
			st = new StringTokenizer(in.readLine(), " ");
			int pre = Integer.parseInt(st.nextToken());
			int post = Integer.parseInt(st.nextToken());
			map[pre][post] = 1;
			map[post][pre] = 1;
		}
		visited = new boolean[V + 1];
		DFS(start);
		System.out.println();
		visited = new boolean[V + 1];
		BFS(start);
	}

	private static void BFS(int s) {
		Queue<Integer> q = new LinkedList<>();
		q.offer(s);
		visited[s] = true;
		while (!q.isEmpty()) {
			int tmp = q.poll();
			System.out.print(tmp + " ");
			for (int i = 1; i <= V; i++) {
				if (map[tmp][i] == 1 && !visited[i]) {
					q.offer(i);
					visited[i] = true;
				}
			}
		}
	}

	private static void DFS(int s) {
		System.out.print(s + " ");
		visited[s] = true;
		for (int i = 1; i <= V; i++) {
			if (map[s][i] == 1 && !visited[i]) {
				visited[i] = true;
				DFS(i);
			}
		}
	}

}
