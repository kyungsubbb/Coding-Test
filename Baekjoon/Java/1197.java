package solving;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class BOJ_1197 {
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;

	static class Edge implements Comparable<Edge> {
		int from, to, weight;

		public Edge(int from, int to, int weight) {
			super();
			this.from = from;
			this.to = to;
			this.weight = weight;
		}

		@Override
		public String toString() {
			return "Edge [from=" + from + ", to=" + to + ", weight=" + weight + "]";
		}

		@Override
		public int compareTo(Edge o) {
			return this.weight - o.weight;
		}

	}

	static PriorityQueue<Edge> pq = new PriorityQueue<>();
	static int[] parents;
	static int V, E, res;

	public static void main(String[] args) throws Exception {
		st = new StringTokenizer(in.readLine(), " ");
		V = Integer.parseInt(st.nextToken());
		E = Integer.parseInt(st.nextToken());
		makeSet();
		for (int i = 0; i < E; i++) {
			st = new StringTokenizer(in.readLine(), " ");
			int from = Integer.parseInt(st.nextToken());
			int to = Integer.parseInt(st.nextToken());
			int weight = Integer.parseInt(st.nextToken());
			pq.offer(new Edge(from, to, weight));
		}
		while (!pq.isEmpty()) {
			Edge tmp = pq.poll();
			unionSet(tmp.from, tmp.to, tmp.weight);
		}
		System.out.println(res);
	}

	private static void makeSet() {
		parents = new int[V + 1];
		for (int i = 1; i <= V; i++) {
			parents[i] = i;
		}
	}

	private static int findSet(int a) {
		if (parents[a] == a)
			return a;
		return parents[a] = findSet(parents[a]);
	}

	private static void unionSet(int a, int b, int w) {
		if (findSet(a) == findSet(b))
			return;
		parents[findSet(b)] = findSet(a);
		res += w;
	}

}
