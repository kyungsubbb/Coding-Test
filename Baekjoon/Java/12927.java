import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ_12927 {
	static boolean list[];
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws Exception {
		String input = in.readLine();
		int count = 0;
		list = new boolean[input.length()+1];
		for (int i = 0; i < input.length(); i++) {
			if(input.charAt(i) == 'Y') list[i+1] = true;
			else list[i+1] = false;
		}
		for (int i = 1; i < list.length; i++) {
			if(checkLight()) {
				break;
			}
			if(list[i]) {
				toggleSwitch(i);
				count++;
			}
		}
		if(checkLight())
			System.out.println(count);
		else
			System.out.println(-1);
	}
	private static void toggleSwitch(int i) {
		int num = i;
		while(num < list.length) {
			list[num] = !list[num];
			num += i;
		}
	}
	private static boolean checkLight() {
		for (int i = 1; i < list.length; i++) {
			if(list[i]) return false;
		}
		return true;
	}

}
