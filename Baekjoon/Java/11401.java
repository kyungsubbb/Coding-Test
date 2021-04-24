import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_11401 {
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st = null;
	static final long P = 1000000007;
	public static void main(String[] args) throws Exception {
		st = new StringTokenizer(in.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		long factorial[] = new long[N+1];
		makeFactorial(factorial);
		
		long bottom = (factorial[N-M] * factorial[M]) % P;
		bottom = power(bottom, P-2);
		System.out.println((factorial[N] * bottom)%P);
		
	}
	
	private static long power(long a, long b) {
		if(b == 0) return 1L;
		else if(b == 1) return a;
		
		if(b%2 == 0) {
			long tmp = power(a, b/2);
			return (tmp * tmp) % P;
		}else {
			long tmp = power(a, b-1);
			return (tmp * a) % P;
		}
	}
	private static void makeFactorial(long[] factorial) {
		factorial[0] = 1;
		for (int i = 1; i < factorial.length; i++) {
			factorial[i] = (factorial[i-1] * i) % P;
		}
	}

}
