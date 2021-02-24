package solving;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class BOJ_10163 {
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	static int idx=1, arr[][] = new int[101][101];
	public static void main(String[] args) throws Exception{
		int N = Integer.parseInt(in.readLine());
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(in.readLine(), " ");
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			int width = Integer.parseInt(st.nextToken());
			int height = Integer.parseInt(st.nextToken());
			for (int j = x; j < x+width; j++) {
				for (int k = y; k < y+height; k++) {
					arr[j][k] = idx;
				}
			}
			idx++;
		}
		
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if(!map.containsKey(arr[i][j])) {
					map.put(arr[i][j], 1);
				}
				else {
					map.put(arr[i][j], map.get(arr[i][j])+1);
				}
			}
		}
		int index = 1;
		for (int i = 1; i <= N; i++) {
			if(map.containsKey(i))
				System.out.println(map.get(i));
			else
				System.out.println(0);
		}
		
	}

}
public class 10163 {
    
}
