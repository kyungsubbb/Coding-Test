import java.util.*;

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T=Integer.parseInt(sc.nextLine());
		for(int test_case = 1; test_case <= T; test_case++){
			int a = sc.nextInt();
			int b = sc.nextInt();
			if(a>b) {
				System.out.printf("#%d %s\n",test_case, ">");
			}
			else if(a==b) {
				System.out.printf("#%d %s\n",test_case, "=");
			}
			else if(a<b) {
				System.out.printf("#%d %s\n",test_case, "<");
			}
		}
		sc.close();
	}
}