import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_2506 {
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	static int[] arr;
	public static void main(String[] args) throws Exception {
		int n = Integer.parseInt(in.readLine());
		arr = new int[n];
		st = new StringTokenizer(in.readLine(), " ");
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		int sum = 0;
		int count = 1;
		if(arr[0] == 1) {
			sum += count ++;
		}
		if(n>1) {
			for (int i = 1; i < arr.length; i++) {
				if(arr[i] == 1) {
					sum += count++;
				}
				else {
					count = 1;
				}
			}
		}
		System.out.println(sum);
	}

}
