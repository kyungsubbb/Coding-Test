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
			int m = sc.nextInt();
			int[] arr_n = new int[n];
			int[] arr_m = new int[m];
			for (int i = 0; i < arr_n.length; i++) {
				arr_n[i] = sc.nextInt();
			}
			for (int i = 0; i < arr_m.length; i++) {
				arr_m[i] = sc.nextInt();
			}
			int val = m>n ? m-n+1 : n-m+1;
			int result[] = new int[val];
			int max = Integer.MIN_VALUE;
			if(m>=n) {
				for (int i = 0; i < result.length; i++) {
					int sum = 0;
					for (int j = i; j < i+arr_n.length; j++) {
						sum += arr_n[j-i]*arr_m[j];
					}
					result[i] = sum;
				}
				
				for (int i = 0; i < result.length; i++) {
					if(max < result[i])
						max = result[i];
				}
			}
			else if(m<n) {
				for (int i = 0; i < result.length; i++) {
					int sum = 0;
					for (int j = i; j < i+arr_m.length; j++) {
						sum += arr_m[j-i]*arr_n[j];
					}
					result[i] = sum;
				}
				
				for (int i = 0; i < result.length; i++) {
					if(max < result[i])
						max = result[i];
				}
			}
			
			
			
			
			System.out.printf("#%d %d\n", test_case, max);
		}
		sc.close();
	}
}