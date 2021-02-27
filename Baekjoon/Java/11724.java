import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	static int count = 0;

	public static void main(String[] args) throws Exception {
		st = new StringTokenizer(in.readLine(), " ");
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		boolean flag[] = new boolean[N+1];
		boolean map[][] = new boolean[N+1][N+1];
		for (int i = 0; i < M; i++) {
			st = new StringTokenizer(in.readLine(), " ");
			int tmp1 = Integer.parseInt(st.nextToken());
			int tmp2 = Integer.parseInt(st.nextToken());
			map[tmp1][tmp2] = true;							// 연결 표시
			map[tmp2][tmp1] = true;
		}
		Stack<Integer> stack = new Stack<Integer>();		//dfs를 위한 스택 생성
		for (int i = 1; i < map.length; i++) {
			for (int j = 1; j < map[i].length; j++) {
				boolean check = false;
				if(i==j) continue;
				if(map[i][j] && !flag[i]) {
					stack.push(i);
					flag[i] = true;
					while(!stack.isEmpty()) {
						int tmp = stack.pop();
						for (int k = 1; k < map[tmp].length; k++) {
							if(map[tmp][k] && !flag[k]) {
								stack.push(k);
								flag[k] = true;
							}
						}
						if(stack.isEmpty()) check = true;
					}
					count++;
				}
			}
		}
		for (int i = 1; i < flag.length; i++) {				// 간선으로 연결되지 않은 정점도 갯수를 세야함!
			if(!flag[i]) count++;
		}
		System.out.println(count);
	}

}