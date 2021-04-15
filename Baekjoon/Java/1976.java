import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_1976 {
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;

	public static void main(String[] args) throws Exception {
		int N = Integer.parseInt(in.readLine());
		int M = Integer.parseInt(in.readLine());

		int map[][] = new int[N + 1][N + 1];
		for (int i = 1; i <= N; i++) {
			st = new StringTokenizer(in.readLine(), " ");
			for (int j = 1; j <= N; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
				if(i==j) map[i][j] = 1;							// 돌아서 나에게 돌아오는 경로는 무조건 존재한다.
			}
		}
		st = new StringTokenizer(in.readLine(), " ");
		int visit[] = new int[M];
		for (int i = 0; i < M; i++) {
			visit[i] = Integer.parseInt(st.nextToken());
		}

		for (int k = 1; k <= N; k++) {
			for (int i = 1; i <= N; i++) {
				if (i == k)
					continue;
				for (int j = 1; j <= N; j++) {
					if (i == j || k == j)
						continue;
					if (map[i][k] == 1 && map[k][j] == 1)
						map[i][j] = 1;
				}
			}
		}
		
		
		
		boolean flag = false;
		for (int i = 0; i < visit.length - 1; i++) {
			if (map[visit[i]][visit[i + 1]] == 0) {
				flag = false;
				break;
			} else {
				flag = true;
			}
		}

		if (flag)
			System.out.println("YES");
		else
			System.out.println("NO");

	}

}
