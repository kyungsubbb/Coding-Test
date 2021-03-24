import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

class Vertex implements Comparable<Vertex> {
	int to;
	int weight;

	public Vertex(int to, int weight) {
		this.to = to;
		this.weight = weight;
	}

	@Override
	public int compareTo(Vertex o) {
		return this.weight - o.weight;
	}

}

public class BOJ_1753 {
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	static int V, E, start, matrix[][], distance[];
	static boolean visited[];
	static ArrayList<List<Vertex>> list;

	public static void main(String[] args) throws Exception {
		st = new StringTokenizer(in.readLine(), " ");
		V = Integer.parseInt(st.nextToken());
		E = Integer.parseInt(st.nextToken());
		start = Integer.parseInt(in.readLine().trim());
		list = new ArrayList<List<Vertex>>();
		for (int i = 0; i <= V; i++) {
			list.add(new ArrayList<Vertex>());
		}
		for (int i = 0; i < E; i++) {
			st = new StringTokenizer(in.readLine(), " ");
			int u = Integer.parseInt(st.nextToken());
			int v = Integer.parseInt(st.nextToken());
			int w = Integer.parseInt(st.nextToken());
			list.get(u).add(new Vertex(v, w));
		}

		distance = new int[V + 1];
		visited = new boolean[V + 1];

		Arrays.fill(distance, Integer.MAX_VALUE);
		PriorityQueue<Vertex> p = new PriorityQueue<Vertex>();
		distance[start] = 0;
		p.offer(new Vertex(start, 0));

		while (!p.isEmpty()) {
			Vertex tmp = p.poll();
			
			if(!visited[tmp.to]) {
				visited[tmp.to] = true;
				
				for (Vertex v : list.get(tmp.to)) {
					if(distance[v.to] > distance[tmp.to] + v.weight) {
						distance[v.to] = distance[tmp.to] + v.weight;
						p.offer(new Vertex(v.to, distance[v.to]));
					}
				}
			}

		}

		for (int i = 1; i < distance.length; i++) {
			if (distance[i] == Integer.MAX_VALUE)
				System.out.println("INF");
			else
				System.out.println(distance[i]);
		}

	}

}
