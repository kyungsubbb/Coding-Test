import java.util.Scanner;

class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int[] dx = {0,1,0,1};
		int[] dy = {0,0,1,1};
		for (int test_case = 1; test_case <= T; test_case++) {
			int M = sc.nextInt();
			int N = sc.nextInt();
			int[][] arr = new int[M][M];
			for (int i = 0; i < M; i++) {
				for (int j = 0; j < M; j++) {
					arr[i][j] = sc.nextInt();
				}
			}
			
//			for (int i = 0; i < arr.length; i++) {
//				for (int j = 0; j < arr.length; j++) {
//					System.out.print(arr[i][j]+ " ");
//				}
//				System.out.println();
//			}
			int sum = 0;
			for (int i = 0; i < M; i++) {
				for (int j = 0; j < M; j++) {
					int val = 0;
					for (int k = i; k < i+N; k++) {
						for (int k2 = j; k2 < j+N; k2++) {
							if(k < M && k2 < M) {
								val += arr[k][k2];
							}
						}
					}
//					System.out.println(val);
					if(sum < val) 
						sum = val;
				}
			}
			System.out.printf("#%d %d\n",test_case, sum);
		}
		sc.close();
	}

}
