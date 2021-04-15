import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class SWEA_1953 {
	static class Point{
		int r, c, dir, time;

		public Point(int r, int c, int dir, int time) {
			super();
			this.r = r;
			this.c = c;
			this.dir = dir;
			this.time = time;
		}

		@Override
		public String toString() {
			return "Point [r=" + r + ", c=" + c + ", dir=" + dir +", time=" + time + "]";
		}
		
	}
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static Queue<Point> q = new LinkedList<>();
	static StringTokenizer st;
	static int N, M, HR, HC, L, map[][], res;
	static boolean visited[][];
	static boolean flag[][];
	public static void main(String[] args) throws Exception {
		st = new StringTokenizer(in.readLine());
		int T = Integer.parseInt(st.nextToken());
		for (int tc = 1; tc <= T; tc++) {
			st = new StringTokenizer(in.readLine());
			N = Integer.parseInt(st.nextToken());	// 세로
			M = Integer.parseInt(st.nextToken());	// 가로
			HR = Integer.parseInt(st.nextToken());	// 맨홀 x
			HC = Integer.parseInt(st.nextToken());	// 맨홀 y
			L = Integer.parseInt(st.nextToken());	// 시간
			res = 0;
			
			map = new int[N][M];
			visited = new boolean[N][M];
			flag = new boolean[8][4];	// true 일경우 가능
			
			setFlag();
			
			for (int i = 0; i < N; i++) {
				st = new StringTokenizer(in.readLine());
				for (int j = 0; j < M; j++) {
					map[i][j] = Integer.parseInt(st.nextToken());
				}
			}
			
			BFS(HR, HC);
			System.out.println("#"+tc+" "+res);
		}
	}
	private static void setFlag() {
		for (int i = 1; i <= 7; i++) {
			switch(i) {
			case 1:
				flag[i][0] = true;
				flag[i][1] = true;
				flag[i][2] = true;
				flag[i][3] = true;
				break;
			case 2:
				flag[i][0] = true;
				flag[i][3] = true;
				break;
			case 3:
				flag[i][1] = true;
				flag[i][2] = true;
				break;
			case 4:
				flag[i][0] = true;
				flag[i][2] = true;
				break;
			case 5:
				flag[i][2] = true;
				flag[i][3] = true;
				break;
			case 6:
				flag[i][1] = true;
				flag[i][3] = true;
				break;
			case 7:
				flag[i][0] = true;
				flag[i][1] = true;
				break;
			}
		}
		
	}
	private static void BFS(int r, int c) {
		int dx[] = {-1, 0, 0, 1}, dy[]= {0, -1, 1, 0};
		q.offer(new Point(r, c, map[r][c], 1));
		visited[r][c] = true;
		
		while(!q.isEmpty()) {
			Point p = q.poll();
			res++;
			
			for (int i = 0; i < 4; i++) {
				if(!flag[p.dir][i]) continue;
				int nx = p.r + dx[i];
				int ny = p.c + dy[i];
				if(nx < 0 || nx >= N || ny < 0 || ny >= M) continue;
				if(visited[nx][ny]) continue;
				if(!isAvail(nx, ny, i)) continue;
				if(map[nx][ny] == 0) continue;
				if(p.time + 1 <= L) {
					q.offer(new Point(nx, ny, map[nx][ny], p.time +1));
					visited[nx][ny] = true;
				}
				
			}
		}
	}

	private static boolean isAvail(int nx, int ny, int i) {
		int dir = map[nx][ny];
		
		switch(i) {
		case 0:	// 상
			if(dir == 1 || dir == 2 || dir == 5 || dir == 6)
				return true;
			break;
		case 1: // 좌
			if(dir == 1 || dir == 3 || dir == 4 || dir == 5)
				return true;
			break;
		case 2: // 우
			if(dir == 1 || dir == 3 || dir == 6 || dir == 7)
				return true;
			break;
		case 3: // 하
			if(dir == 1 || dir == 2 || dir == 4 || dir == 7)
				return true;
			break;
		}
		return false;
	}
}
