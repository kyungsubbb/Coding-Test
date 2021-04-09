import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws Exception{
		int N = Integer.parseInt(in.readLine());
		int input[] = new int[N + 1];
		int step[] = new int[N + 1];
		for(int i=1; i<=N; i++) {
			input[i] = Integer.parseInt(in.readLine());
		}
		step[1] = input[1];
		if(N >= 2) {
			step[2] = input[1]+input[2];
		}
		for(int i=3; i<=N; i++) {
			step[i] = Math.max(step[i-2], step[i-3]+input[i-1])+ input[i];
		}
		System.out.println(step[N]);
		
	}

}