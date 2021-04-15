import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ_4811 {

	static long dp[][] = new long[31][31];
	public static void main(String[] args) throws Exception {
		dp[1][0] = 1;
		dp[2][0] = 2;
		dp[3][0] = 5;
		
		Capsule(30,0);

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int input = Integer.MAX_VALUE;
		while((input = Integer.parseInt(in.readLine()))!=0) {
			System.out.println(dp[input][0]);
		}
	}

	private static long Capsule(int one, int half) {
		if(dp[one][half] != 0) return dp[one][half];	// 이미 값이 있다면 돌아가기
		if(one == 0) return 1;							// 1개짜리가 하나도 남아있지 않다면 모두 반개짜리니까 1 리턴
		long word = 0;
		if(one != 0) word += Capsule(one-1, half+1);	// 1개짜리 먹었을 경우 1개짜리 개수를 줄이고, 반개짜리 한개 증가
		if(half != 0) word += Capsule(one, half-1);		// 반개짜리가 있을 경우 반개짜리 먹는 경우 고려
		
		return dp[one][half] = word;					// 두 가지 모두 고려한 값 리턴
		
	}

}
