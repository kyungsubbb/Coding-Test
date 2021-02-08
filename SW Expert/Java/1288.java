import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SWEA_1288 {
	private static boolean[] isSelected;

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(in.readLine());
		for (int tc = 1; tc <= T; tc++) {
			isSelected = new boolean[10];
			int input = Integer.parseInt(in.readLine());
			int num = 0;

			while (true) {
				boolean flag = false;
				int val = input * ++num;
				while (val > 0) {
					isSelected[val % 10] = true;
					val /= 10;
				}
				for (int i = 0; i < isSelected.length; i++) {
					if (!isSelected[i]) {
						flag = true;
						break;
					}
				}
				if (!flag)
					break;
			}
			System.out.println("#"+tc+ " "+num * input);
		}
	}

}
