import java.util.Scanner;

public class SWEX_2805Farm {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		for (int a = 1; a <= T; a++) {
			int n = sc.nextInt();
			int sum = 0;
			for (int i = 0; i < n; i++) {
				String val = sc.next();
				for (int j = 0; j < n; j++) {
					if (Math.abs(i - n / 2) + Math.abs(j - n / 2) <= n / 2) {
						sum += val.charAt(j) - '0';
					}
				}
			}
			System.out.println("#" + a + " " + sum);
		}
		sc.close();
	}
}
