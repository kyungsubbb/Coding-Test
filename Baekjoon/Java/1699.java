import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(in.readLine());
		
		int t = 1;
		int arr[] = new int[N+1];
		Arrays.fill(arr, Integer.MAX_VALUE);
		arr[1] = 1;
		for (int i = 2; i <= N; i++) {
			if((t+1)*(t+1) == i) {
				arr[i] = 1;
				t++;
			}
			else {
				for (int j = t; j > t/2; j--) {
					arr[i] = Math.min(arr[i-(j*j)]+1, arr[i]);
				}
			}
		}
		System.out.println(arr[N]);
	}

}