import java.util.*;
import java.io.*;

public class Main {
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st = null;
	static int M, N, K, map[][];
	static boolean visited[][];
	static class Point{
		int x, y;

		@Override
		public String toString() {
			return "Point [x=" + x + ", y=" + y + "]";
		}

		public Point(int x, int y) {
			super();
			this.x = x;
			this.y = y;
		}
		
	}
	static PriorityQueue<Integer> pq = new PriorityQueue<>();
	public static void main(String[] args) throws Exception{
		st = new StringTokenizer(in.readLine());
		M = Integer.parseInt(st.nextToken());
		N = Integer.parseInt(st.nextToken());
		K = Integer.parseInt(st.nextToken());
		
		map = new int[M][N];
		visited = new boolean[M][N];
		
		for (int i = 0; i < K; i++) {
			st = new StringTokenizer(in.readLine());
			int x1 = Integer.parseInt(st.nextToken());
			int y1 = Integer.parseInt(st.nextToken());
			int x2 = Integer.parseInt(st.nextToken());
			int y2 = Integer.parseInt(st.nextToken());
			
			paint(x1, y1, x2, y2);
		}
		
		int cnt = 0;
		int num = 3;
		int dx[] = {-1, 0, 0, 1};
		int dy[] = {0, -1, 1, 0};
		for (int i = 0; i < M; i++) {
			for (int j = 0; j < N; j++) {
				if(map[i][j] == 1 || visited[i][j]) continue;
				Stack<Point> stack = new Stack<>();
				stack.push(new Point(i, j));
				visited[i][j] = true;
				int ans = 0;
				while(!stack.isEmpty()) {
					Point p = stack.pop();
					ans++;
					for (int k = 0; k < 4; k++) {
						int nx = p.x + dx[k];
						int ny = p.y + dy[k];
						if(nx < 0 || nx >= M || ny < 0 || ny >= N) continue;
						if(visited[nx][ny]) continue;
						if(map[nx][ny] == 1) continue;
						stack.push(new Point(nx, ny));
						visited[nx][ny] = true;
 					}
				}
				pq.offer(ans);
				cnt ++;
			}
		}
		System.out.println(cnt);
		while(!pq.isEmpty()) {
			System.out.print(pq.poll()+" ");
		}
	}
	private static void paint(int x1, int y1, int x2, int y2) {
		for (int i = y1; i < y2; i++) {
			for (int j = x1; j < x2; j++) {
				map[i][j] = 1;
			}
		}
	}

}