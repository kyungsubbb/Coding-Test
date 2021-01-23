import java.util.Scanner;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
		for (int test_case = 1; test_case <= T; test_case++) {
			String input = sc.next();
			boolean flag = true;
			for (int i = 0; i < input.length()/2; i++) {
				if(input.charAt(i) != input.charAt(input.length()-1-i)) {
					flag = false;
					break;
				}
			}
			if(flag) {
				System.out.printf("#%d %d\n",test_case, 1);
			}
			else {
				System.out.printf("#%d %d\n",test_case, 0);
			}
		
		}
	}
}