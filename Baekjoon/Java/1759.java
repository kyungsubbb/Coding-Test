import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ_1759 {
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	static int L, C;
	static String[] output, arr;
	static boolean[] isSelected;
	public static void main(String[] args) throws Exception{
		st = new StringTokenizer(in.readLine(), " ");
		L = Integer.parseInt(st.nextToken());
		C = Integer.parseInt(st.nextToken());
		output = new String[L];
		arr = new String[C];
		isSelected = new boolean[C];
		st = new StringTokenizer(in.readLine(), " ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = st.nextToken();
		}
		Arrays.sort(arr);
		subSet(0, 0);
	}
	private static void subSet(int idx, int start) {
		if(idx == L) {
			boolean flag = false;
			int mo = 0;
			int ja = 0;
			for (int i = 0; i < output.length; i++) {
				if(output[i].equals("a") || output[i].equals("e") || output[i].equals("i") || output[i].equals("o") || output[i].equals("u")) {
					mo ++;
				}else {
					ja ++;
				}
			}
			if(mo >= 1 && ja >= 2) {
				flag = true;
			
			}
			if(flag) {
				String res = "";
				for (int i = 0; i < output.length; i++) {
					res += output[i];
				}
				System.out.println(res);
			}
			return;
		}
		for (int i = start; i < arr.length; i++) {
			if(!isSelected[i]) {
				output[idx] = arr[i];
				isSelected[i] = true;
				subSet(idx+1, i+1);
				isSelected[i] = false;
			}
		}
	}

}
