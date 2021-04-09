import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ_10815 {
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws Exception {
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(in.readLine());
		String arr[] = in.readLine().split(" ");
		int M = Integer.parseInt(in.readLine());
		StringTokenizer st = new StringTokenizer(in.readLine(), " ");
		Arrays.sort(arr);

		for (int i = 0; i < M; i++) {
			int res = Arrays.binarySearch(arr, st.nextToken());
			if(res >= 0) sb.append(1);
			else		sb.append(0);
			sb.append(" ");
		}
		System.out.println(sb.toString());
	}

}
