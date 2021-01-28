import java.util.Scanner;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
		int date[] = {0,31,28,31,30,31,30,31,31,30,31,30,31};
		for(int test_case = 1; test_case <= T; test_case++)
		{
			
			int first[] = new int[2];
			int last[] = new int[2];
			int day=0;
			for (int i = 0; i < first.length; i++) {
				first[i] = sc.nextInt();
			}
			for (int i = 0; i < last.length; i++) {
				last[i] = sc.nextInt();
			}
			for (int i = first[0]; i < last[0]; i++) {
				day += date[i];
			}
			day = day - first[1] + last[1]+1;
			
			System.out.printf("#%d %d\n", test_case, day);
		}
		sc.close();
	}
}