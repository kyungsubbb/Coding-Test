import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Stack;
import java.util.StringTokenizer;

public class BOJ_2606 {
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
//	static HashMap<Integer, Integer> map = new HashMap<>();
	static ArrayList<int[]> list = new ArrayList<>();

	public static void main(String[] args) throws NumberFormatException, IOException {
		int T = Integer.parseInt(in.readLine()); // 컴퓨터의 수
		int N = Integer.parseInt(in.readLine());
		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(in.readLine(), " ");
			list.add(new int[] { Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()) });
		}

		boolean flag[] = new boolean[T + 1];
		Stack<Integer> stack = new Stack<>();
		stack.push(1);
		while (!stack.isEmpty()) {
			Integer tmp = stack.pop();
			for (int i = 0; i < list.size(); i++) {
				if (list.get(i)[0] == tmp && !flag[list.get(i)[1]]) {
					stack.push(list.get(i)[1]);
					flag[list.get(i)[1]] = true;
				}
				if (list.get(i)[1] == tmp && !flag[list.get(i)[0]]) {
					stack.push(list.get(i)[0]);
					flag[list.get(i)[0]] = true;
				}
			}

		}
		int cnt = 0;
		for (int i = 2; i < flag.length; i++) {
			if (flag[i])
				cnt++;
		}
		System.out.println(cnt);
	}

}
