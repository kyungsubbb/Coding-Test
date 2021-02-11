import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SWEA_1285 {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(in.readLine());
		for (int tc = 1; tc <= T; tc++) {
			int n = Integer.parseInt(in.readLine());
			int arr[] = new int[n];
			StringTokenizer st = new StringTokenizer(in.readLine(), " ");
			for (int i = 0; i < arr.length; i++) {
				arr[i] = Math.abs(Integer.parseInt(st.nextToken()));
			}
			int min = Integer.MAX_VALUE;
			for (int i = 0; i < arr.length; i++) {
				if (arr[i] < min) {
					min = arr[i];
				}
			}
			int cnt = 0;
			for (int i = 0; i < arr.length; i++) {
				if (min == arr[i])
					cnt++;
			}
			System.out.println("#" + tc + " " + min + " " + cnt);
		}
	}

}
