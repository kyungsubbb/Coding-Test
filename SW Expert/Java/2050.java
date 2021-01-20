import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String T= sc.next();
		for (int i = 0; i < T.length(); i++) {
			int val = T.charAt(i)-64;
			System.out.print(val + " ");
		}
		sc.close();
	}
}
