import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static StringBuilder sb = new StringBuilder();
	static int won[] = {50000, 10000, 5000, 1000, 500, 100, 50, 10};
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(in.readLine());
		int[] arr;
		for (int i = 1; i <= n; i++) {
			arr= new int[won.length];
			int val = Integer.parseInt(in.readLine());
			for (int j = 0; j < won.length; j++) {
				if(val/won[j] > 0) {
					arr[j] = val/won[j];
					val -= arr[j]*won[j];
				}
					
			}
			System.out.println("#"+i);
			for (int j = 0; j < arr.length; j++) {
				System.out.print(arr[j]+" ");
			}
			System.out.println();
		}
	}

}
