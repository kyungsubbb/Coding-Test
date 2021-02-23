package solving;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ_1904 {
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static int count(int N) {
		int arr[] = new int[1000001];
		arr[1] = 1;
		arr[2] = 2;
		for (int i = 3; i < arr.length; i++) {
			arr[i] = (arr[i - 1] + arr[i - 2]) % 15746;
		}
		return arr[N];
	}
	public static void main(String[] args) throws Exception {
		int N = Integer.parseInt(in.readLine());
		System.out.println(count(N));
	}
}
