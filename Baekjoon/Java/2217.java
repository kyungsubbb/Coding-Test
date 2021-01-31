import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] arr = new int[N];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);

		for (int i = arr.length -1 ; i >= 0; i--) {
			arr[i] = arr[i] * (arr.length - i);
		}
		int max = Integer.MIN_VALUE;
		for(int k : arr) {
			if(max < k)
				max = k;
		}
		System.out.println(max);
		sc.close();
	}
}