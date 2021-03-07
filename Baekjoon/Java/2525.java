import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	static int hour, min;

	public static void main(String[] args) throws Exception {
		st = new StringTokenizer(in.readLine(), " ");
		hour = Integer.parseInt(st.nextToken());
		min = Integer.parseInt(st.nextToken());
		min += Integer.parseInt(in.readLine());

		setClock();
		System.out.println(hour + " " + min);
	}

	private static void setClock() {
		if(min > 59) {
			hour += min/60;
			min %= 60;
		}
		if(hour > 23) {
			hour -= 24;
		}
	}

}