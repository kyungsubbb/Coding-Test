import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T=sc.nextInt();
		for(int test_case = 0; test_case <= T; test_case++){
			System.out.printf("%d ",(int)Math.pow(2, test_case));
		}
		sc.close();
	}
}