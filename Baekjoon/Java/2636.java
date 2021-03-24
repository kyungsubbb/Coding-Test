import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Index {
	int x;
	int y;

	public Index(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public String toString() {
		return "Index [x=" + x + ", y=" + y + "]";
	}

}

public class BOJ_2636 {
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static int map[][], row, col, dx[] = { -1, 0, 0, 1 }, dy[] = { 0, -1, 1, 0 }, res, count;
	static boolean check[][];
	static StringTokenizer st;

	public static void main(String[] args) throws Exception {
		st = new StringTokenizer(in.readLine(), " ");
		row = Integer.parseInt(st.nextToken());
		col = Integer.parseInt(st.nextToken());
		map = new int[row][col];			// 치즈가 올라가 있는 2차원 배열

		for (int i = 0; i < row; i++) {
			st = new StringTokenizer(in.readLine(), " ");
			for (int j = 0; j < col; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
			}
		}

		while (!checkZero()) {						// 치즈가 있는지 확인 -> 없다면 while문을 벗어남
			check = new boolean[row][col];			// 매번 공기랑 만난 치즈를 확인하기 위해 새로 선언
			checkRemain();							// 남아있는 치즈의 수량 체크

			check[0][0] = true;						// 0,0에서 시작하니까 0,0을 참으로 바꿔줌
			checkAir(0, 0);							// DFS 수행
			res++;									// 시간 추가

		}
		System.out.println(res);
		System.out.println(count);
	}

	private static void checkRemain() {				// map을 돌아다니면서 1인 요소를 count ( 1: 녹지 않은 치즈, 2: 이제 녹을 치즈 )
		int remain = 0;
		for (int i = 0; i < map.length; i++) {
			for (int j = 0; j < map[i].length; j++) {
				if (map[i][j] == 1)					// 1이면 수량 증가
					remain++;
				else if (map[i][j] == 2)			// 2면 녹임
					map[i][j] = 0;
			}
		}
		if (remain == 0)							// remain이 0이라는 것은 남아있는 것이 없다는 것이고, 문제는 마지막 치즈의 개수를 원함
			return;
		count = remain;						
	}

	private static boolean checkZero() {			// 남은 치즈가 있는지 확인
		for (int i = 0; i < map.length; i++) {
			for (int j = 0; j < map[i].length; j++) {
				if (map[i][j] == 1)					// 남아있는 치즈가 있다면(녹을 예정이거나 아예 공기거나)
					return false;					// while문 실행
			}
		}
		return true;
	}

	private static void checkAir(int x, int y) {	// 좌표에서 공기체크
		for (int i = 0; i < 4; i++) {
			int nx = x + dx[i];						// 사방탐색
			int ny = y + dy[i];
			if (nx >= 0 && nx < row && ny >= 0 && ny < col && !check[nx][ny]) {		// 범위 내고, 방문한 적이 없다면
				check[nx][ny] = true;												// 방문체크
				if (map[nx][ny] == 1) {												// 방문한 곳이 1(치즈가 있는곳)이라면
					map[nx][ny] = 2;												// 녹을예정으로 표시 -> 다음 DFS로 넘어가질 않기 때문에 표면만 구할 수 있다
				} else {
					checkAir(nx, ny);												// 0이라면 다시 DFS 수행
				}
			}
		}

	}

}