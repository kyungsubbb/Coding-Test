package solving;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class BOJ_2477 {
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	static int max_width, min_width, max_height, min_height;
	public static void main(String[] args) throws Exception {
		int K = Integer.parseInt(in.readLine());
		max_height = Integer.MIN_VALUE;
		max_width = Integer.MIN_VALUE;
		min_width = Integer.MAX_VALUE;
		min_height = Integer.MAX_VALUE;
		
		ArrayList<int[]> line = new ArrayList<>();
		for (int i = 0; i < 6; i++) {
			st = new StringTokenizer(in.readLine(), " ");
			int dir = Integer.parseInt(st.nextToken());
			int len = Integer.parseInt(st.nextToken());
			line.add(new int[] {dir, len});
			if(dir==3 || dir == 4) {					// 세로
				max_height = Math.max(max_height, len);
				min_height = Math.min(min_height, len);
				
			}
			else if(dir == 1 || dir == 2) {				// 가로
				max_width = Math.max(max_width, len);
				min_width = Math.min(min_width, len);
			}
		}
		int res_h = 0;
		int res_w = 0;
		
		for (int i = 0; i < line.size(); i++) {
			if(line.get(i)[0] >= 3 && line.get(i)[1] == max_height) {
				if(i == 5) {
					res_h = Math.abs(line.get(0)[1] - line.get(4)[1]);
				}else if(i == 0) {
					res_h = Math.abs(line.get(5)[1] - line.get(1)[1]);
				}else {
					res_h = Math.abs(line.get(i-1)[1] - line.get(i+1)[1]);
				}
			}
			else if(line.get(i)[0] < 3 && line.get(i)[1] == max_width) {
				if(i == 5) {
					res_w = Math.abs(line.get(0)[1] - line.get(4)[1]);
				}else if(i == 0) {
					res_w = Math.abs(line.get(5)[1] - line.get(1)[1]);
				}else {
					res_w = Math.abs(line.get(i-1)[1] - line.get(i+1)[1]);
				}
			}
		}
		
		int result = ((max_height * max_width) - (res_h * res_w)) * K;
		System.out.println(result);
	}

}
