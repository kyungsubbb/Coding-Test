import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ_11655 {
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws Exception {
		String input = in.readLine();
		for (int i = 0; i < input.length(); i++) {
			char tmp;
			if (input.charAt(i) >= 65 && input.charAt(i) <= 90) { // 대문자의 경우
				tmp = (char) (input.charAt(i) + 13);
				if (tmp > 90)
					tmp -= 26;
				System.out.print(tmp);
			} else if (input.charAt(i) >= 97 && input.charAt(i) <= 122) { // 소문자의 경우
				tmp = (char) (input.charAt(i) + 13);
				if (tmp > 122)
					tmp -= 26;
				System.out.print(tmp);
			} else
				System.out.print(input.charAt(i));
		}
	}

}
