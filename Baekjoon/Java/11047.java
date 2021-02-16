import java.util.*;
import java.io.*;
public class BOJ_11047 {
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static int[] money;
	public static void main(String[] args) throws Exception {
		StringTokenizer st = new StringTokenizer(in.readLine(), " ");
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		money = new int[N];
		for (int i = 0; i < money.length; i++) {
			money[i] = Integer.parseInt(in.readLine());
		}
		int result = 0;
		for (int i = money.length-1; i >= 0 ; i--) {
			if(K >= money[i]) {
				int tmp = K/money[i];
				result += tmp;
				K -= tmp * money[i];
			}
		}
		System.out.println(result);
	}

}
