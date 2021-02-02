import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class SWEX_Flatten {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		Scanner sc = new Scanner(System.in);
		int n = 10;
		for (int i = 1; i <= n; i++) {
			int cnt = Integer.parseInt(in.readLine());
			
			StringTokenizer st = new StringTokenizer(in.readLine(), " ");
			int arr[] = new int[100];
			for (int j = 0; j < arr.length; j++) {
				arr[j] = Integer.parseInt(st.nextToken());
			}
			int result = 0;
			int count = 0;
			while(true) {
				Arrays.sort(arr);
				if(arr[99]-arr[0] == 0 || arr[99]-arr[0] == 1 || count ==cnt) {
					result = arr[99]-arr[0];
					break;
				}
				else {
					result = arr[99]-arr[0];
					arr[0]++;
					arr[99]--;
					count ++;
				}
			}
			System.out.println("#"+i + " " + result);
		}
	}
}
