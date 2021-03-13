import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ_1373 {
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws Exception{
		String input = in.readLine();
		solution(input);
	}
	private static void solution(String res) {
		int len = res.length() - (res.length()/3)*3;
		String result = res;
		if(len != 0) {
			for (int i = 0; i < 3-len; i++) {
				result = "0" + result;
			}
		}
		for (int i = 0; i < result.length()/3; i++) {
			int start = i*3;
			String tmp = (start+3 < result.length()) ? result.substring(start, start + 3) : result.substring(start);
			toOcx(tmp);
		}
		
 	}
	private static void toOcx(String string) {
		int bin = 1;
		int res = 0;
		for (int i = string.length()-1; i >= 0; i--) {
			res += (string.charAt(i)-'0')*bin;
			bin *= 2;
		}
		System.out.print(res);
	}
	

}
