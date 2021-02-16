import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class BOJ_1038 {
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static int[] num = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
	static ArrayList<Long> data = new ArrayList<>();
	static int count = 0;
	static boolean[] isSelected = new boolean[10];

	static void subset(int idx) {
		if (idx == 10) {
			String res = "";
			for (int i = isSelected.length - 1; i >= 0; i--) {
				if (isSelected[i])
					res += num[i];
			}
			if (res.length() == 0)
				return;
			data.add(Long.parseLong(res));
			count++;
			return;
		}
		isSelected[idx] = true;
		subset(idx + 1);
		isSelected[idx] = false;
		subset(idx + 1);

	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		int n = Integer.parseInt(in.readLine());
		subset(0);
		Collections.sort(data);
		if (n > 1022)
			System.out.println(-1);
		else
			System.out.println(data.get(n));
	}

}
