import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] arr = new int[N+1];
		arr[0] = 1;
		arr[1] = 1;
		for (int i = 0; i < arr.length; i++) {
			if(i==0 || i==1)
				arr[i] = 1;
			else
				arr[i] = (arr[i-1] + arr[i-2])%10007;
		}

		System.out.println(arr[N]);
		sc.close();
	}
}
