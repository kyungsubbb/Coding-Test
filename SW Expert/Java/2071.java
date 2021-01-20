import java.util.*;

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T;
		T=Integer.parseInt(sc.nextLine());
		for(int test_case = 1; test_case <= T; test_case++){
			double sum = 0;
			String arr[] = sc.nextLine().split(" ");
			for(String k : arr) {
				sum += Integer.parseInt(k);
			}
			System.out.printf("#%d %d\n",test_case,Math.round(sum/arr.length));
		}
		sc.close();
	}
}
