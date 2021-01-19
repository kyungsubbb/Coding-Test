import java.util.*;

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T=Integer.parseInt(sc.nextLine());
		int sum = 0;
		while(T>1) {
			sum += T%10;
			T /= 10;
		}
		System.out.println(sum);
		sc.close();
	}
}
