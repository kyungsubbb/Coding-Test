import java.util.Scanner;

class Solution
{
	public static void main(String args[]) throws Exception
	{
	Scanner sc = new Scanner(System.in);
		int n= Integer.parseInt(sc.nextLine());
		for(int i=0; i<n; i++) {
			int sum = 0;
			String arr[] = sc.nextLine().split(" ");
			for(String k : arr) {
				if(Integer.parseInt(k)%2 == 1) {
					sum += Integer.parseInt(k);
				}
			}
			System.out.printf("#%d %d\n", i+1, sum);
			
		}
		sc.close();	
    }
}