import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

class Info {
	private int x;
	private int y;
	private int dist;

	public Info(int x, int y, int dist) {
		this.x = x;
		this.y = y;
		this.dist = dist;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getDist() {
		return dist;
	}

	public void setDist(int dist) {
		this.dist = dist;
	}

}

class Solution {
	static int dx[] = { -1, 0, 1, 0 };
	static int dy[] = { 0, -1, 0, 1 };

	public static void main(String args[]) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(in.readLine());
		int arr[][] = new int[n][n];

		for (int i = 0; i < arr.length; i++) {
			StringTokenizer st = new StringTokenizer(in.readLine(), " ");
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		int shark_size = 2;
		int eat = 0;
		int num = 0;
		Queue<Info> que = new LinkedList<>();
		for (int i = 0; i < n; i++) { // 상어 인덱스 설정
			for (int j = 0; j < n; j++) {
				if (arr[i][j] == 9) {
					que.add(new Info(i, j, num)); // 큐에 상어 좌표 넣기
					arr[i][j] = 0;
				}
			}
		}

		while (true) {
			LinkedList<Info> fish = new LinkedList<>(); // 물고기 리스트 작성
			int dist[][] = new int[n][n]; // 똑같은 사이즈의 거리값 배열 설정

			while (!que.isEmpty()) {
				Info s = que.poll(); // 큐에서 하나씩 꺼냄

				for (int i = 0; i < 4; i++) { // 사방 탐색
					int nx = s.getX() + dx[i];
					int ny = s.getY() + dy[i];

					if (nx >= 0 && nx < n && ny >= 0 && ny < n && dist[nx][ny] == 0 && arr[nx][ny] <= shark_size) { // // 사이드 탐색, 그 위치에서 상어가 지나갈 수 있는지 확인
						dist[nx][ny] = dist[s.getX()][s.getY()] + 1; // 있다면 그 좌표의 거리+1 -> 사방탐색이기에 1차이밖에 날 수 밖에 없음
						if (arr[nx][ny] >= 1 && arr[nx][ny] <= 6 && arr[nx][ny] < shark_size) { // 물고기가 있다면, 그리고 물고기 사이즈가 작다면
							fish.add(new Info(nx, ny, dist[nx][ny])); // 먹을 수 있는 물고기 추가
							que.add(new Info(nx, ny, dist[nx][ny])); // 큐에 좌표값 추가
							continue;
						}
						que.add(new Info(nx, ny, dist[nx][ny]));
					}

				}
			}

			if (fish.size() == 0) { // 물고기 리스트 사이즈가 0이면 정지 -> 정지조건
				System.out.println(num);
				break;
			}
			Info eating = fish.get(0); // 맨 앞 요소 가져오기(상어 위치)
			for (int i = 1; i < fish.size(); i++) { // 물고기를 하나하나 비교
				if (eating.getDist() > fish.get(i).getDist()) { // 1. 거리순
					eating = fish.get(i);
				} else if (eating.getDist() == fish.get(i).getDist()) { // 2. 위쪽 우선
					if (eating.getX() > fish.get(i).getX()) {
						eating = fish.get(i);
						continue;
					} else if (eating.getX() == fish.get(i).getX()) { // 3. 왼쪽 우선
						if (eating.getY() > fish.get(i).getY()) {
							eating = fish.get(i);
						}
					}

				}
			}

			num += eating.getDist(); // 위에서 선정된 최단, 먹을 수 있는 물고기 거리 (이동시간) 더하기
			eat++; // 먹은 요소 1 증가
			arr[eating.getX()][eating.getY()] = 0; // 그 좌표로 이동
			if (eat == shark_size) { // 먹은 수랑 상어 사이즈랑 같으면 성장
				eat = 0;
				shark_size++;
			}
			que.add(new Info(eating.getX(), eating.getY(), eating.getDist())); // 새로운 상어 위치로 큐에 넣기
																				// 여기서 다시 각 좌표의 물고기를 탐색
		}

	}
}