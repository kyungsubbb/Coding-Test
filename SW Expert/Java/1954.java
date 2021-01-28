import java.util.Scanner;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();

		for(int test_case = 1; test_case <= T; test_case++)
		{
			
			int n = sc.nextInt();
			int arr[][] = new int[n][n];
			int cnt = 1;
			int i=0, j=0;
			arr[i][j] = cnt++;
			while(cnt <= Math.pow(n, 2)) {
				
				while(j+1<n && arr[i][j+1] == 0) {
					arr[i][++j] = cnt++;				
				}
				while(i+1<n && arr[i+1][j] == 0) {
					arr[++i][j] = cnt++;				
				}
				while(j-1>=0 && arr[i][j-1] == 0) {
					arr[i][--j] = cnt++;				
				}
				while(i-1>=0 && arr[i-1][j] == 0) {
					arr[--i][j] = cnt++;				
				}
				
				
			}
			System.out.println("#"+test_case);
			for (int j2 = 0; j2 < arr.length; j2++) {
				for (int k = 0; k < arr.length; k++) {
					System.out.print(arr[j2][k] + " ");
				}
				System.out.println();
			}
			
		}
		sc.close();
	}
}