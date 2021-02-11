import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class SWEA_1228 {
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	public static void main(String[] args) throws NumberFormatException, IOException {
		int T = 10;
		for (int tc = 1; tc <= T; tc++) {
			int N = Integer.parseInt(in.readLine());
			ArrayList<Integer> arr = new ArrayList<>();
			st = new StringTokenizer(in.readLine()," ");
			for (int i = 0; i < N; i++) {
				arr.add(Integer.parseInt(st.nextToken()));
			}
			in.readLine();
			String[] input = in.readLine().split("I");
			for (int i = 1; i < input.length; i++) {
				st = new StringTokenizer(input[i]," ");
				int idx = Integer.parseInt(st.nextToken());
				int len = Integer.parseInt(st.nextToken());
				for (int j = 0; j < len; j++) {
					arr.add(idx++, Integer.parseInt(st.nextToken()));
				}
			}
			System.out.print("#"+tc+" ");
			for (int i = 0; i < 10; i++) {
				System.out.print(arr.get(i)+" ");
			}
			System.out.println();
		}
	}
	
}
