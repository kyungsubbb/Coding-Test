public class 5215-inclass {
    
}
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SWEA_5215_inclass {
	static int R[][] , maxCal;				// R : 각 재료별 점수와 칼로리 저장 배열 , maxCal : 최대칼로리
	
	// idx번째의 재료를 고려해서 (넣을 수도 있고 뺄 수도 있다.) 조합을 만들었을 때 칼로리 체크 후 맛점수를 리턴하는 메소드
	// idx : 사용할 재료 번호, score : idx번째 재료를 고려했을 때 맛점수 , maxCal : 사용할 수 있는 열량
	private static int find(int idx, int score, int remain) {
		
		if(remain < 0) {	// 남아있는 칼로리가 0 미만일 때 -> 조합 성립x
			return 0;
		}
		
		if(remain == 0) {
			return score;		// 그 시점의 맛점수 리턴
		}
		if(idx == R.length) return score;	// 인덱스의 값이 끝이라면, 재료를 모두 확인헀다면 점수 반환
		
		// idx번째 재료를 사용하지 않은 경우
		int v1 = find(idx+1, score, remain);
		
		// idx번째 재료를 사용하는 경우
		int v2 = find(idx+1, score+R[idx][0], remain-R[idx][1]);
		return Math.max(v1, v2);
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(in.readLine());		// tc no
		for (int tc = 1; tc <= T; tc++) {
			StringTokenizer st = new StringTokenizer(in.readLine(), " ");
			int N = Integer.parseInt(st.nextToken());
			maxCal = Integer.parseInt(st.nextToken());
			
			R = new int[N][2];
			for (int i = 0; i < R.length; i++) {
				st = new StringTokenizer(in.readLine(), " ");
				R[i][0] = Integer.parseInt(st.nextToken());	// 맛 점수
				R[i][1] = Integer.parseInt(st.nextToken());	// 칼로리
			}
			
			// 각 재료별 조합을 만들어 그 때의 맛점수가 최고인 것을 찾는다.
			int idx = 0;	// 조합할 재료의 번호
			int score = 0;	// 맛점수, 재료를 선택해 나갈 때 마다 올라감
			
			int max = find(idx, score, maxCal);
			System.out.println("#"+tc+" "+max);
			
		}
	}


}