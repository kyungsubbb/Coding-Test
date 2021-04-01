import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class SWEA_1238 {
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	static Queue<Integer> q;
	static Queue<Integer> p;
	public static void main(String[] args) throws Exception{
		for (int tc = 1; tc <= 10; tc++) {
			q = new LinkedList<Integer>();
			p = new LinkedList<Integer>();
			st = new StringTokenizer(in.readLine(), " ");	// 첫번째줄 입력받음
			int count = Integer.parseInt(st.nextToken());
			int start_point = Integer.parseInt(st.nextToken());
			st = new StringTokenizer(in.readLine(), " ");	// 데이터 입력 받음
			int map[][] = new int[101][101];
			boolean isSeleceted[] = new boolean[101];
			for (int i = 0; i < count/2; i++) {
				int from = Integer.parseInt(st.nextToken());
				int to = Integer.parseInt(st.nextToken());
				map[from][to] = 1;
			}
			q.offer(start_point);
			isSeleceted[start_point] = true;
			LinkedList<Integer> tmp_a;
			while(true) {
				tmp_a = new LinkedList<>();
				for (int k : q) {
					tmp_a.offer(k);
				}
				while(!q.isEmpty()) {
					int tmp = q.poll();
					for (int i = 1; i < map[tmp].length; i++) {
						if(map[tmp][i] == 1 && !isSeleceted[i]) {
							isSeleceted[i] = true;
							p.offer(i);
						}
					}
				}
				if(p.isEmpty()) break;
				q = p;
				p = new LinkedList<>();
			}
			Collections.sort(tmp_a, Collections.reverseOrder());
			System.out.println("#"+tc+" "+tmp_a.peek());
		}
	}

}
