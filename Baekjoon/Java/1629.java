import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_1629 {
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st ;
	static long A,B,C;
	public static void main(String[] args) throws Exception {
		
		st = new StringTokenizer(in.readLine());
		
		A = Integer.parseInt(st.nextToken());
		B = Integer.parseInt(st.nextToken());
		C = Integer.parseInt(st.nextToken());
		
        // Integer.MAX_VALUE일 경우 곱하는 과정에서 음수로 변환되니까 Long형으로 !
		System.out.println(solve(A%C, B, C));
	}
	private static long solve(long a, long b, long c) {
		if(b == 1) {
			return a;
		}
		
		
		long k = solve(a, b/2, c)%c;
		if(b%2 == 0) {
			return (k * k)%c;
		}else {
			return ((k * k)%c * a)%c;
		}
	}
}
