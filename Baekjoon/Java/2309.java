import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ_2309 {
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));	
	static StringTokenizer st;
	static int arr[] = new int[9];
	static int[] output = new int[7];
	static void combination(int cnt, int start) {
		if(cnt == 7) {
			int sum =0;
			for (int i = 0; i < output.length; i++) {
				sum += output[i];
			}
			if(sum == 100) {
				for (int i = 0; i < output.length; i++) {
					Arrays.sort(output);
					System.out.println(output[i]);
				}
				return;
			}
			return ;
		}
		for (int i = start; i < arr.length; i++) {
			output[cnt] = arr[i]; 
			combination(cnt+1, i+1);
		}
	}
	public static void main(String[] args) throws IOException {
		for (int i = 0; i < 9; i++) {
			arr[i] = Integer.parseInt(in.readLine());
		}
		combination(0,0);
	}

}
