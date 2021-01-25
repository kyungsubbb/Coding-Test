import java.util.Scanner;

class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for (int test_case = 1; test_case <= T; test_case++) {
			int f_clock = sc.nextInt();
			int f_min = sc.nextInt();
			int l_clock = sc.nextInt();
			int l_min = sc.nextInt();
			int r_clock = f_clock+l_clock;
			int r_min = f_min + l_min;
			if(r_min >= 60) {
				r_clock += 1;
				r_min -= 60;
			}
			if(r_clock >= 12) {
				r_clock -= 12;
			}

			System.out.printf("#%d %d %d\n", test_case, r_clock, r_min);
			
		}
		
	}

}
