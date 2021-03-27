import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ_1259 {
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws Exception {
		String input;
		while (!(input = in.readLine()).equals("0")) {
			check(input);
		}
	}

	private static void check(String input) {
		int pre = 0;
		int post = input.length() - 1;
		char arr[] = input.toCharArray();

		while (pre < post) {
			if (arr[pre] != arr[post]) {
				System.out.println("no");
				return;
			}
			pre++;
			post--;
		}
		System.out.println("yes");
	}

}
