import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ_2902 {
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) throws Exception {
		String[] input = in.readLine().split("-");
		for (int i = 0; i < input.length; i++) {
			sb.append(input[i].charAt(0));
		}
		System.out.println(sb);
	}

}
