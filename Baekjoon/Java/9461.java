import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static long[] arr = new long[100];

	public static void main(String[] args) throws Exception {
		int N = Integer.parseInt(in.readLine());
		arr[0] = arr[1] = arr[2] = 1;
		for (int i = 3; i < arr.length; i++) {
			arr[i] = arr[i - 2] + arr[i - 3];
		}
		for (int i = 0; i < N; i++) {
			System.out.println(arr[Integer.parseInt(in.readLine()) - 1]);
		}
	}

}