import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SWEA_5607 {
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	static final int mod = 1234567891;
	static long[] factorial = new long[1000001];
	public static void main(String[] args) throws Exception{
		int T = Integer.parseInt(in.readLine());
		factorial[0] = 1;
		makeFactorial();
		for (int tc = 1; tc <= T; tc++) {
			st = new StringTokenizer(in.readLine(), " ");
			int N = Integer.parseInt(st.nextToken());
			int R = Integer.parseInt(st.nextToken());
			
			long bottom = (factorial[R] * factorial[N-R])%mod;
			bottom = power(bottom, mod-2);
			long res = (factorial[N] * bottom) % mod;
			System.out.println("#"+tc+" "+res);
		}
	}
	private static long power(long a, int b) {
		if(b==0) return 1;
		if(b==1) return a;
		long tmp;
		if(b%2 == 0) {
			tmp = power(a, b/2)%mod;
			return (tmp * tmp)%mod;
		}else {
			tmp = power(a, b-1) % mod;
			return (tmp * a)%mod;
		}
	}
	private static void makeFactorial() {
		for (int i = 1; i <= 1000000; i++) {
			factorial[i] = (factorial[i-1]*i)%mod;
		}
	}
	

}
