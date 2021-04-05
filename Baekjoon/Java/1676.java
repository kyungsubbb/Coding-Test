import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ_1676 {
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws Exception {
		int N = Integer.parseInt(in.readLine());
		int count = 0;
		while (N >= 5) {
			count += N / 5;
			N /= 5;
		}
		System.out.println(count);
	}

}
