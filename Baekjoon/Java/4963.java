import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BOJ_4963 {
	static int dx[] = { -1, -1, -1, 0, 0, 1, 1, 1 };
	static int dy[] = { -1, 0, 1, -1, 1, -1, 0, 1 };

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			int w = sc.nextInt();
			int h = sc.nextInt();
			if (w == 0 && h == 0) {
				break;
			}
			int arr[][] = new int[h][w]; // 입력값
			int map[][] = new int[h][w]; // 갯수 표시
			int cnt = 1; // 섬갯수
			for (int i = 0; i < arr.length; i++) {			// 섬의 모양을 입력받음
				for (int j = 0; j < arr[i].length; j++) {
					arr[i][j] = sc.nextInt();
				}
			}
			Queue<int[]> q = new LinkedList<>();			// 같은 섬을 판단할 큐 생성
			for (int i = 0; i < arr.length; i++) {			// 배열을 하나씩 탐색
				for (int j = 0; j < arr[i].length; j++) {
					if (arr[i][j] == 1 && map[i][j] == 0) {		// 입력 배열에서 섬이고, 이미 탐색한 곳이 아니라면
						q.offer(new int[] { i, j });			// 큐에 좌표를 넣음

						while (!q.isEmpty()) {					// 큐가 빌 때까지 계속 반복하는데,
							int[] a = q.poll();					// 우선 큐에서 하나 빼고
							map[a[0]][a[1]] = cnt;				// 그 좌표에 cnt 번째 섬임을 표시
							for (int k = 0; k < 8; k++) {		// 8방 탐색
								int nx = a[0] + dx[k];
								int ny = a[1] + dy[k];
								if (nx < h && nx >= 0 && ny < w && ny >= 0 && arr[nx][ny] == 1 && map[nx][ny] == 0) {		// 배열 안이면서, 섬이고, 탐색하지 않은 곳이라면
									q.offer(new int[] { nx, ny });															// 큐에 넣음 ( 같은 섬임을 판단 )
									map[nx][ny] = cnt;																		// 탐색한 곳에 몇번째 섬인지 표시
									continue;
								}
							}
						}

						cnt++;																								// 큐가 끝났다는 것은 그 cnt번째 섬 탐색을 끝마쳤다는 거니까 다음 번째 섬을 탐색
					}
				}
			}

			System.out.println(--cnt);																						// 개수는 하나씩 늘리고 끝냈으니 map의 최대는 하나 빼야 정상적인 출력 가능
		}
		sc.close();
	}

}
