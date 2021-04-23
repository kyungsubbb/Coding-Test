import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class BOJ_10026 {
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static char[][] map;
	static int N;
	public static void main(String[] args) throws Exception {
		N = Integer.parseInt(in.readLine());
		map = new char[N][];
		
		for (int i = 0; i < N; i++) {
			map[i] = in.readLine().toCharArray();
		}
		
		System.out.println(Person()+" "+RedPerson());
		
	}
	private static int RedPerson() {
		char[][] arr = copy(map);
		boolean visited[][] = new boolean[N][N];
		int cnt = 0;
		Stack<Point> stack = new Stack<>();
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if(visited[i][j]) continue;

				stack.push(new Point(i, j, cnt, arr[i][j]));
				visited[i][j] = true;
				while(!stack.isEmpty()) {
					Point p = stack.pop();
					for (int k = 0; k < 4; k++) {
						int nx = p.x + dx[k];
						int ny = p.y + dy[k];						
						if(nx < 0 || ny < 0 || nx >= N || ny >= N) continue;
						if(visited[nx][ny]) continue;
						if(arr[nx][ny] == p.color) {
							visited[nx][ny] = true;
							stack.push(new Point(nx, ny, cnt, arr[nx][ny]));
							}
						}
					}
				cnt++;
				

			}
		}
		
		return cnt;
	}
	private static char[][] copy(char[][] arr) {
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if(map[i][j] == 'G') {
					arr[i][j] = 'R';
				}else {
					arr[i][j] = map[i][j];
				}
			}
		}
		return arr;
	}
	static class Point{
		int x, y, cnt;
		char color;
		
		public Point(int x, int y, int cnt, char color) {
			super();
			this.x = x;
			this.y = y;
			this.cnt = cnt;
			this.color = color;
		}

		@Override
		public String toString() {
			return "Point [x=" + x + ", y=" + y + ", cnt=" + cnt + ", color=" + color + "]";
		}
		
	}
	static int dx[] = {-1, 0, 0, 1};
	static int dy[] = {0, -1, 1, 0};
	private static int Person() {
		boolean visited[][] = new boolean[N][N];
		int cnt = 0;
		Stack<Point> stack = new Stack<>();
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if(visited[i][j]) continue;
				stack.push(new Point(i, j, cnt, map[i][j]));
				visited[i][j] = true;
				while(!stack.isEmpty()) {
					Point p = stack.pop();
					for (int k = 0; k < 4; k++) {
						int nx = p.x + dx[k];
						int ny = p.y + dy[k];						
						if(nx < 0 || ny < 0 || nx >= N || ny >= N) continue;
						if(visited[nx][ny]) continue;
						if(map[nx][ny] == p.color) {
							visited[nx][ny] = true;
							stack.push(new Point(nx, ny, cnt, map[nx][ny]));
						}
					}
				}
				cnt++;
			}
		}
		
		return cnt;
	}

}
