import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_20055 {
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	static int N, K, up, down, map[], count;
	public static void main(String[] args) throws Exception{
		st = new StringTokenizer(in.readLine(), " ");
		N = Integer.parseInt(st.nextToken());
		K = Integer.parseInt(st.nextToken());
		map = new int[2*N];
		boolean isPlaced[] = new boolean[N];
		st = new StringTokenizer(in.readLine(), " ");
		for (int i = 0; i < map.length; i++) {
			map[i] = Integer.parseInt(st.nextToken());
		}
		
		up = 0;
		down = N-1;
		while(!check()) {
			changeIndex();											// 벨트를 한칸씩 옮김
				
			for (int i = isPlaced.length-1; i > 0; i--) {			// 로봇의 유무도 한칸씩 같이 옮겨줌
				isPlaced[i] = isPlaced[i-1];
			}
			isPlaced[0] = false;									// 이제 새로 생긴 공간은 비어있어야 함
			
			isPlaced[N-1] = false;									// 마지막 벨트 공간은 내려가야함
			for (int i = N-1; i > 0; i--) {							// 로봇이 1칸씩 움직임(움직일 수 있다면)
				if(isPlaced[i-1] && !isPlaced[i] && map[i] >= 1) {
					isPlaced[i] = true;
					isPlaced[i-1] = false;
					map[i] -= 1;
				}
			}
			
			if(map[0] > 0) {										// 처음칸의 내구도가 존재한다면 올림
				isPlaced[0] = true;
				map[0] -= 1;
			}
			count++;												// 단계증가
		}
		System.out.println(count);

	}
	private static void changeIndex() {								// 벨트의 이동
		int tmp = map[map.length-1];
		for (int i = map.length-1; i > 0 ; i--) {
			map[i] = map[i-1];
		}
		map[0] = tmp;
	}
	
	private static boolean check() {								// 0의 개수 카운트
		int count = 0;
		for (int i = 0; i < map.length; i++) {
			if(map[i] == 0) count++;
			if(count >= K) return true;
		}
		return false;
	}
	
}
