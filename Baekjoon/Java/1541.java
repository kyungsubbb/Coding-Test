import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ_1541 {
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static String arr[];

	public static void main(String[] args) throws Exception {
		String input = in.readLine();
		arr = input.split("-");
		int val = 0;
		for (int i = 0; i < arr.length; i++) {
			if (i == 0)
				val = plus(arr[0]);
			else
				val -= plus(arr[i]);
		}
		System.out.println(val);

	}

	private static int plus(String s) {
		String k[] = s.split("\\+");
		int val = 0;
		for (int i = 0; i < k.length; i++) {
			val += Integer.parseInt(k[i]);
		}
		return val;
	}

}
