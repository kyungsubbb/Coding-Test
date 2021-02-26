import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_14696 {
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	public static void main(String[] args) throws Exception {
		int N = Integer.parseInt(in.readLine());
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(in.readLine(), " ");
			int ac = Integer.parseInt(st.nextToken());
			int a[] = new int[5];
			for (int j = 0; j < ac; j++) {
				a[Integer.parseInt(st.nextToken())] += 1;
			}
			
			st = new StringTokenizer(in.readLine(), " ");
			int bc = Integer.parseInt(st.nextToken());
			int b[] = new int[5];
			for (int j = 0; j < bc; j++) {
				b[Integer.parseInt(st.nextToken())] += 1;
			}
			boolean flag = false;
			for (int j = 4; j >= 0; j--) {
				if(a[j] > b[j]) {
					System.out.println("A");
					flag = true;
					break;
				}else if(a[j]<b[j]) {
					System.out.println("B");
					flag = true;
					break;
				}
			}
			if(!flag) System.out.println("D");
		}
	}

}
