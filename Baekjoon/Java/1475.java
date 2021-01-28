import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String N = sc.next();
		int[] arr = new int[9];
		for (int i = 0; i < N.length(); i++) {
			if(N.charAt(i) == '9')
				arr[6]++;
			else
				arr[N.charAt(i)-48]++;
		}
		int idx = 0;
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if(max < arr[i]) {
				max = arr[i];
				idx = i;
			}
		}
		
		if(idx == 6) {
			if(max % 2 == 0)
				System.out.println(max/2);
			else
				System.out.println(max/2 +1);
		}
		else
			System.out.println(max);
		sc.close();
	}
}
