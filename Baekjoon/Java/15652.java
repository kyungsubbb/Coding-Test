import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_15652 {
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder("");
	static int[] input;
	static int[] output;
	static int N;
	static int cnt;
	static void combination(int cnt1, int start) {
		if(cnt1 == cnt) {
			for (int i = 0; i < output.length; i++) {
				sb.append(output[i]).append(" ");
			}
			sb.append("\n");
			return;
		}
		for (int i = start; i < input.length; i++) {
			output[cnt1] = input[i];
			combination(cnt1+1, i);
		}
	}
	public static void main(String[] args) throws IOException {
		StringTokenizer st = new StringTokenizer(in.readLine(), " ");
		N = Integer.parseInt(st.nextToken());
		cnt = Integer.parseInt(st.nextToken());
		input = new int[N];
		for (int i = 0; i < input.length; i++) {
			input[i] = i+1;
		}
		output = new int[cnt];
		combination(0,0);
		System.out.println(sb);
	}

}
