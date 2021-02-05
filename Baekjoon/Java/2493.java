import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class BOJ_2493 {

	public static void main(String[] args) throws IOException {
		BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(sc.readLine());
		StringTokenizer st = new StringTokenizer(sc.readLine(), " ");
		Stack<int[]> front = new Stack<>();
		for (int i = 1; i <= n; i++) {
			int a[] = { i, Integer.parseInt(st.nextToken()) };
			while (!front.isEmpty()) {
				if (front.peek()[1] > a[1]) {
					System.out.print(front.peek()[0] + " ");
					break;
				}
				front.pop();
			}
			if (front.isEmpty())
				System.out.print("0 ");
			front.push(a);
		}
		sc.close();
	}

}
