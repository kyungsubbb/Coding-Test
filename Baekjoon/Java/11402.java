import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
// 페르마 소정리
public class BOJ_11402 {
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	static long N, R;
	static int P;
	static long factorial[];

	public static void main(String[] args) throws Exception {
		st = new StringTokenizer(in.readLine());
		N = Long.parseLong(st.nextToken());
		R = Long.parseLong(st.nextToken());
		P = Integer.parseInt(st.nextToken());

		System.out.println(nCr(N, R, P));
	}

	private static long nCr(long n, long r, int p) {
		if (r == 0 || n == r)
			return 1L;
		else if (r == 1 || r == n - 1)
			return n % p;

		factorial = new long[(int) P];
		makeFactorial();
		if (n < p) { // n이 p보다 작은 경우 -> 원래대로 페르마의 소정리 적용
			long re = 1L;
			re *= factorial[(int) n];
			re %= p;

			re *= power(factorial[(int) n - (int) r], p - 2);
			re %= p;

			re *= power(factorial[(int) r], p - 2);
			re %= p;

			return re;
		} else {
			long re = 1L;
			while (n > 0 || r > 0) {
				long a = n % p;
				long b = r % p;
				if (a < b) {
					re = 0;
					break;
				}

//				a >= b -> 페르마 소정리 적용
				re *= factorial[(int) a];
				re %= p;

				re *= power(factorial[(int) a - (int) b], p - 2);
				re %= p;

				re *= power(factorial[(int) b], p - 2);
				re %= p;

				n = n / p;
				r = r / p;

			}

			return re;
		}

	}

	private static void makeFactorial() {
		factorial[0] = 1;
		for (int i = 1; i < P; i++) {
			factorial[i] = (factorial[i - 1] * i) % P;
		}
	}

	private static long power(long a, long b) {
		if (b == 0)
			return 1;
		else if (b == 1)
			return a;

		if (b % 2 == 0) {
			long tmp = power(a, b / 2);
			return ((tmp * tmp) % P);
		}
		long tmp = power(a, b - 1) % P;
		return (tmp * a) % P;
	}

}
