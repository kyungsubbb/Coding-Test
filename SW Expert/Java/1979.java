import java.util.Scanner;

class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for (int test_case = 1; test_case <= T; test_case++) {
			int N = sc.nextInt();
			int[][] arr = new int[N][N];
			int[] cnt = new int[N+1];
			int K = sc.nextInt();
			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr.length; j++) {
					arr[i][j] = sc.nextInt();
				}
			}
			
			for (int i = 0; i < arr.length; i++) {
				int row = 0;
				int col = 0;
				
				for (int j = 0; j < arr.length; j++) {	// 행
					if(arr[i][j] == 1) {
						row++;
					}
					else {
						if(row > 0) {
							cnt[row]++;
							row = 0;
						}
					}
					if(j==N-1 && row > 0) {
						cnt[row]++;
						row = 0;
					}
				}
				
				for (int j = 0; j < arr.length; j++) {	// 열
					
					if(arr[j][i] == 1) {
						col++;
					}
					else {
						if(col > 0) {
							cnt[col]++;
							col = 0;
						}
					}
					if(j==N-1 && col > 0) {
						cnt[col]++;
						col = 0;
					}
					
				}
				
			}
		
			
			
			
			System.out.printf("#%d %d\n", test_case, cnt[K]);
			
		}
		
	}

}
