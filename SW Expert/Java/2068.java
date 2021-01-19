import java.util.*;

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T=Integer.parseInt(sc.nextLine());
		for(int test_case = 1; test_case <= T; test_case++){
			String[] a = sc.nextLine().split(" ");
			int max = 0;
			for(String k : a) {
				if(max<Integer.parseInt(k)) {
					max = Integer.parseInt(k);
				}
			}
			System.out.printf("#%d %d\n",test_case, max);
		}
		sc.close();
	}
}
