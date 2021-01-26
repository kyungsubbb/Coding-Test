import java.util.Scanner;

class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		for (int test_case = 1; test_case <= T; test_case++) {
			int[][] arr = new int[9][9];
			for (int i = 0; i < 9; i++) {
				for (int j = 0; j < 9; j++) {
					arr[i][j] = sc.nextInt();
				}
			}
			boolean flag = true;
			for (int i = 0; i < arr.length; i++) {
				int row = 0;
				int col = 0;
				
				for (int j = 0; j < arr.length; j++) {
					row += arr[i][j];
					col += arr[j][i];
					if(i%3 == 0 && j%3 == 0) {
						int sum = 0;
						for (int j2 = i; j2 < i+3; j2++) {
							for (int k = j; k < j+3; k++) {
								if(j2 < 9 && k < 9) {
									sum += arr[j2][k];
								}
							}
						}
						if(sum != 45)
							flag = false;
					}
				}
				if(row != 45 || col != 45) {
					flag = false;
					break;
				}
				
			}
			if(flag)
				System.out.printf("#%d %d\n",test_case, 1);
			else
				System.out.printf("#%d %d\n",test_case, 0);
		}
		sc.close();
	}

}
