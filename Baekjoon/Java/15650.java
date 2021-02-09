import java.util.Scanner;

public class BOJ_15650 {
	static Scanner sc = new Scanner(System.in);
	static int[] input;
	static int[] output;
	static int N;
	static int cnt;
	static void combination(int cnt1, int start) {
		if(cnt1 == cnt) {
			for (int i = 0; i < output.length; i++) {
				System.out.print(output[i]+" ");
			}
			System.out.println();
			return;
		}
		for (int i = start; i < input.length; i++) {
			output[cnt1] = input[i];
			combination(cnt1+1, i+1);
		}
	}
	public static void main(String[] args) {
		N = sc.nextInt();
		cnt = sc.nextInt();
		input = new int[N];
		for (int i = 0; i < input.length; i++) {
			input[i] = i+1;
		}
		output = new int[cnt];
		combination(0,0);
	}

}
