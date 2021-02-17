public import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class BOJ_17298 {
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static int[] result;
	public static void main(String[] args) throws Exception {
		StringBuilder sb = new StringBuilder("");
		int N = Integer.parseInt(in.readLine());
		result = new int[N];
		Stack<int[]> stack = new Stack<>();
		StringTokenizer st = new StringTokenizer(in.readLine(), " ");
		for (int i = 0; i < N; i++) {
			if(stack.isEmpty())  {
				stack.add(new int[] {i, Integer.parseInt(st.nextToken())});
				continue;
			}
			int tmp = Integer.parseInt(st.nextToken());
			while(!stack.isEmpty() && stack.peek()[1] < tmp) {
				result[stack.pop()[0]] = tmp;
			}
			stack.add(new int[] {i, tmp});
			
		}
		while(!stack.isEmpty()) {
			int tmp[] = stack.pop();
			result[tmp[0]] = -1;
		}
		for (int tmp : result) {
			sb.append(tmp).append(" ");
		}
		sb.setLength(sb.length()-1);
		System.out.println(sb);
	}

}
class 17298 {
    
}
