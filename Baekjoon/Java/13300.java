
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	static ArrayList<int[]> list = new ArrayList<>();
	static int res;

	public static void main(String[] args) throws Exception {
		st = new StringTokenizer(in.readLine(), " ");
		int N = Integer.parseInt(st.nextToken()); // 학생수
		int K = Integer.parseInt(st.nextToken()); // 방의 최대인원
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(in.readLine(), " ");
			int S = Integer.parseInt(st.nextToken());
			int Y = Integer.parseInt(st.nextToken());
			int tmp[] = new int[3];
			tmp[0] = Y;
			tmp[1] = S;
			tmp[2] = 1;
			if (list.isEmpty()) {
				list.add(tmp);
			} else {
				boolean flag = false;
				for (int j = 0; j < list.size(); j++) {
					if (list.get(j)[0] == Y && list.get(j)[1] == S) {
						list.get(j)[2]++;
						flag = true;
					}
				}
				if (!flag)
					list.add(tmp);
			}
		}
		for (int[] tmp : list) {
			int person = tmp[2];
			res += person % K == 0 ? person / K : person / K + 1;
		}
		System.out.println(res);
	}

}
