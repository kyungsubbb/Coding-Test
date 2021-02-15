import java.util.*;
import java.io.*;
public class BOJ_1182 {
	
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	static int result;
	static int count = 0;
	static boolean[] isSelected;
	static int[] input;
	public static void subset(int idx) {
		if(idx == input.length) {
			int tmp = 0;
			boolean flag = false;
			for (int i = 0; i < isSelected.length; i++) {
				if(isSelected[i]) {
					tmp += input[i];
					flag = true;
				}
			}
			if(tmp == result && flag) {
				count++;
			}
			return;
		}
		isSelected[idx] = true;
		subset(idx+1);
		isSelected[idx] = false;
		subset(idx+1);
	}
	public static void main(String[] args) throws Exception{
		st = new StringTokenizer(in.readLine(), " ");
		int N = Integer.parseInt(st.nextToken());
		result = Integer.parseInt(st.nextToken());
		input = new int[N];
		isSelected = new boolean[N];
		st = new StringTokenizer(in.readLine(), " ");
		for (int i = 0; i < input.length; i++) {
			input[i] = Integer.parseInt(st.nextToken());
		}
		subset(0);
		System.out.println(count);
	}

}
