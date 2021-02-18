
import java.util.*;
import java.io.*;

public class JUNG_1828 {
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;

	public static void main(String[] args) throws Exception {
		int N = Integer.parseInt(in.readLine());
		ArrayList<int[]> time = new ArrayList<int[]>();
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(in.readLine(), " ");
			time.add(new int[] { Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()) });
		}
		Collections.sort(time, new Comparator<int[]>() {

			@Override
			public int compare(int[] o1, int[] o2) {
				if (o1[1] == o2[1]) {
					return o1[0] - o2[0];
				}
				if (o1[1] >= 0 && o2[1] >= 0) {
					return o1[1] - o2[1];
				} else if (o1[1] >= 0 && o2[1] < 0) {
					return 1;
				} else if (o1[1] < 0 && o2[1] >= 0) {
					return -1;
				} else {
					return -1 * (o1[1] - o2[1]);
				}
			}
		});

		int temper = time.get(0)[1];
		int cnt = 1;
		for (int i = 1; i < time.size(); i++) {
			if (temper < time.get(i)[0]) {
				++cnt;
				temper = time.get(i)[1];
			}
		}
		System.out.println(cnt);
	}

}
