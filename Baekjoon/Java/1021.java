package solving;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class BOJ_1021 {
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	static int N, M, count;
	static ArrayList<Integer> list;

	public static void main(String[] args) throws Exception {
		st = new StringTokenizer(in.readLine(), " ");
		N = Integer.parseInt(st.nextToken()); // 큐의 크기
		M = Integer.parseInt(st.nextToken()); // 뽑아내야 하는 수의 개수
		ArrayList<Integer> out = new ArrayList<>();
		st = new StringTokenizer(in.readLine(), " ");
		for (int i = 0; i < M; i++) {
			out.add(Integer.parseInt(st.nextToken()));
		}
		list = new ArrayList<>();
		for (int i = 1; i <= N; i++) {
			list.add(i);
		}

		for (int i = 0; i < out.size(); i++) {
			int tmp = out.get(i);
			int idx = list.indexOf(tmp);
			if (idx == 0) {
				list.remove(0);
			} else if (idx > list.size() / 2) { // 절반 이후의 인덱스를 갖는 경우
				for (int j = 0; j < list.size() - idx; j++) {
					shiftRight();
					count++;
				}
				list.remove(0);
			} else if (idx <= list.size() / 2) { // 절반 이전의 인덱스를 갖는 경우
				for (int j = 0; j < idx; j++) {
					shiftLeft();
					count++;
				}
				list.remove(0);
			}
		}
		System.out.println(count);

	}

	private static void shiftLeft() {
		int tmp = list.get(0);
		for (int i = 0; i < list.size() - 1; i++) {
			list.set(i, list.get(i + 1));
		}
		list.set(list.size() - 1, tmp);

	}

	private static void shiftRight() {
		int tmp = list.get(list.size() - 1);
		for (int i = list.size() - 1; i > 0; i--) {
			list.set(i, list.get(i - 1));
		}
		list.set(0, tmp);

	}

}
