import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Main {
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static int N, map[], count;

	public static void main(String[] args) throws Exception {
		N = Integer.parseInt(in.readLine());
		map = new int[N+1];
		setQueen(0);
		System.out.println(count);
		
	}
	
	static void setQueen(int rowNum) {
		if(!isAvail(rowNum)) {
			return;
		}
		if(rowNum == N) {
			count++;
			return;
		}
		for (int i = 1; i <= N; i++) {
			map[rowNum+1] = i;
			setQueen(rowNum+1);
		}
	}

	private static boolean isAvail(int no) {
		for (int i = 1; i < no; i++) {
			if(map[no] == map[i] || Math.abs(map[no]-map[i]) == Math.abs(no - i)) {
				return false;
			}
		}
		return true;
	}
}