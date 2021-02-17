import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ_2667 {
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	static int[] dx = { -1, 0, 0, 1 };
	static int[] dy = { 0, -1, 1, 0 };
	static int count = 0;
	static int res = 0;
	static ArrayList<Integer> list = new ArrayList<>();

	static void print(boolean[][] check) {
		for (int i = 0; i < check.length; i++) {
			for (int j = 0; j < check.length; j++) {
				System.out.print(check[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) throws Exception {
		int N = Integer.parseInt(in.readLine());
		int[][] map = new int[N][N];
		boolean[][] check = new boolean[N][N];
		for (int i = 0; i < map.length; i++) {
			String tmp = in.readLine();
			for (int j = 0; j < map[i].length; j++) {
				map[i][j] = tmp.charAt(j) - '0';
			}
		}
		Queue<int[]> q = new LinkedList<>();
		for (int i = 0; i < map.length; i++) {
			for (int j = 0; j < map[i].length; j++) {
				if (map[i][j] == 1 && !check[i][j]) {
					q.offer(new int[] { i, j });
					while (!q.isEmpty()) {
						count++;
						int[] tmp = q.poll();
						int nx = tmp[0];
						int ny = tmp[1];
						check[nx][ny] = true;
						for (int k = 0; k < dx.length; k++) {
							if (nx + dx[k] >= 0 && nx + dx[k] < map.length && ny + dy[k] >= 0 && ny + dy[k] < map.length
									&& map[nx + dx[k]][ny + dy[k]] == 1 && !check[nx + dx[k]][ny + dy[k]]) {
								int tx = nx + dx[k];
								int ty = ny + dy[k];
								q.offer(new int[] { tx, ty });
								check[tx][ty] = true;
							}
						}
					}
					list.add(count);
					count = 0;
					res++;
				}
			}
		}

		System.out.println(res);
		Collections.sort(list);
		for (int is : list) {
			System.out.println(is);
		}
	}

}
