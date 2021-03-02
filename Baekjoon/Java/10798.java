import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BOJ_10798 {
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws Exception {
		char arr[][] = new char[5][15];
		int len = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			String tmp = in.readLine().trim();
			len = Math.max(len, tmp.length());
			for (int j = 0; j < tmp.length(); j++) {
				arr[i][j] = tmp.charAt(j);
			}
		}
		
		String res = "";
		for (int i = 0; i < len; i++) {
			for (int j = 0; j < arr.length; j++) {
				if(arr[j][i] == '\0') continue;
				res += arr[j][i];
			}
		}
		System.out.println(res);

	}

}
