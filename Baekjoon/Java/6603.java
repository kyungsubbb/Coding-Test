import java.util.*;
import java.io.*;
public class BOJ_6603 {
	private static int[] input;
	private static int[] output;
	private static int number;
	private static void combinations(int k, int start) {
		if(k == 6) {
			for (int i = 0; i < output.length; i++) {
				System.out.print(output[i] + " ");
			}
			System.out.println();
			return ;
		}
		for (int i = start; i < input.length; i++) {
			output[k] = input[i]; 
			combinations(k+1, i+1);
		}
	}
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		while(true) {
			StringTokenizer st = new StringTokenizer(in.readLine(), " ");
			number = Integer.parseInt(st.nextToken());
			if(number == 0) break;
			input = new int[number];
			output = new int[6];
			
			for (int i = 0; i < input.length; i++) {
				input[i] = Integer.parseInt(st.nextToken());
			}
			combinations(0,0);
			System.out.println();
		}
	}

}
