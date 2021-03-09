package solving;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Iterator;
import java.util.StringTokenizer;

public class BOJ_20057 {
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	static int map[][];
	static int N, cnt, distance=1; 		// 2번 꺾을 때마다 가는 거리 1 증가
	static int res, x, y, dir; 	// 현재의 좌표 구하기 + 방향 구하기(0: 좌, 1: 하 , 2: 우 , 3: 상)
	static int dx[][] = {{-1,1,-2,2,0,-1,1,-1,1,0},{-1,-1,0,0,2,0,0,1,1,1},{-1,1,-2,2,0,-1,1,-1,1,0},{1,1,0,0,-2,0,0,-1,-1,-1}};
	static int dy[][] = {{1,1,0,0,-2,0,0,-1,-1,-1},{-1,1,-2,2,0,-1,1,-1,1,0},{-1,-1,0,0,2,0,0,1,1,1},{-1,1,-2,2,0,-1,1,-1,1,0}};
	static int percent[] = {1,1,2,2,5,7,7,10,10};
	public static void main(String[] args) throws Exception {
		N = Integer.parseInt(in.readLine());
		map = new int[N][N];
		x = y = N/2;		// 시작 좌표 설정
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(in.readLine(), " ");
			for (int j = 0; j < N; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		boolean flag = false;
		while(true) {
			if(cnt == 2) {
				distance++;
				cnt = 0;
			}
			for (int i = 0; i < distance; i++) {
				move(dir);
				sand();
//				printmap();
				if(x == 0 && y == 0) {
					flag = true;
					break;
				}
			}
			if(flag) break;
			dir = (dir == 3) ? 0 : dir+1;
			cnt++ ;
		}
		System.out.println(res);
		
		
	}
	
//	private static void printmap() {	// 디버깅용
//		for (int i = 0; i < N; i++) {
//			System.out.println(Arrays.toString(map[i]));
//		}
//		System.out.println();
//	}

	private static void sand() {
		int place_sand = map[x][y];
		int tmp = map[x][y];
		
		int nx, ny;
		for (int i = 0; i < 9; i++) {
			nx = x + dx[dir][i];
			ny = y + dy[dir][i];
			
			int spread = (percent[i] * place_sand) /100;			// percent[i]/100 * place_sand 이런식으로 계산하면 절대안됨 -> 앞의 식이 0이되서 계산이 안됨
			tmp -= spread;
			if(!range(nx, ny)) {
				res += spread;
			}else {
				map[nx][ny] += spread;
			}
		}
		nx = x + dx[dir][9];		// alpha에 해당
		ny = y + dy[dir][9];
		if(!range(nx, ny)) {
			res += tmp;
		}
		else {
			map[nx][ny] += tmp;
		}
		map[x][y] = 0;
		
	}
	private static boolean range(int nx, int ny) {
		if(nx >= 0 && nx < N && ny>=0 && ny < N) return true;
		return false;
	}
	private static void move(int d) {
		switch(d){		// (0: 좌, 1: 하 , 2: 우 , 3: 상)
		case 0:
			y -= 1;
			break;
		case 1:
			x += 1;
			break;
		case 2:
			y += 1;
			break;
		case 3:
			x -= 1;
			break;
		}
	}

}
