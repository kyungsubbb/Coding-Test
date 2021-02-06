
import java.io.IOException;
import java.util.Scanner;

public class BOJ_10829 {
	private static void printbinary(long n) {
		if (n <= 1) {
			System.out.print(n);
			return;
		}

		printbinary(n / 2);
		System.out.print(n % 2);

	}

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		printbinary(n);

		sc.close();
	}

}