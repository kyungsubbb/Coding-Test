import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SWEA_1940 {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(in.readLine());
		for (int tc = 1; tc <= T; tc++) {
			int n = Integer.parseInt(in.readLine());
			String input[];
			int speed = 0;
			int distance = 0;
			for (int i = 0; i < n; i++) {
				input = in.readLine().split(" ");
				if (input[0].equals("1")) {
					speed += Integer.parseInt(input[1]);
					distance += speed;
				} else if (input[0].equals("2")) {
					speed -= Integer.parseInt(input[1]);
					if (speed < 0)
						speed = 0;
					distance += speed;
				} else if (input[0].equals("0")) {
					distance += speed;
				}

			}
			System.out.println("#" + tc + " " + distance);
		}
	}

}
