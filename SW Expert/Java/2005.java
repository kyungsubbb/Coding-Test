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
			int N=sc.nextInt();
			int[][] pa = new int[N][];
			for (int i = 1; i <= N; i++) {
				pa[i-1] = new int[i];
			}
			for (int i = 0; i < pa.length; i++) {
				for (int j = 0; j < pa[i].length; j++) {
					if(j == 0 || j == pa[i].length-1) {
						pa[i][j] = 1;
					}
					else {
						pa[i][j] = pa[i-1][j-1] + pa[i-1][j]; 
					}
				}
			}
			System.out.println("#"+test_case);
			for (int i = 0; i < pa.length; i++) {
				for (int j = 0; j < pa[i].length; j++) {
					
					System.out.print(pa[i][j] + " ");
				}
				System.out.println();
			}
		}
		sc.close();
	}
}