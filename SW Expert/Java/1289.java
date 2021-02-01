import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {

	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(in.readLine());
		
		for (int i = 1; i <= n; i++) {
			String input = in.readLine();
			char a = '0';
			int num = 0;
			for (int j = 0; j < input.length(); j++) {
				if(input.charAt(j) != a) {
					num++;
					a = input.charAt(j);
				}
			}
			System.out.printf("#%d %d\n",i, num);
		}

	}

}