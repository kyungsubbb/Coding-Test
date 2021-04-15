import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;

public class BOJ_18870 {
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static HashMap<Integer, Integer> map;
	static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) throws Exception {
		int N = Integer.parseInt(in.readLine());
		int input[] = new int[N];
		int check[] = new int[N];
		String[] tmp = in.readLine().split(" ");
		for (int i = 0; i < N; i++) {
			input[i] = Integer.parseInt(tmp[i]);
			check[i] = Integer.parseInt(tmp[i]);
		}
		Arrays.sort(check);

		map = new HashMap<>();
		int count = 0;
		for (int i = 0; i < N; i++) {
			if (!map.containsKey(check[i])) {
				map.put(check[i], count);
				count++;
			}
		}

		for (int i = 0; i < N; i++) {
			sb.append(map.get(input[i])).append(" ");
		}
		System.out.println(sb);
	}
}
