import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_Snail1913 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder("");
		int len = Integer.parseInt(in.readLine());
		int n = Integer.parseInt(in.readLine());
		int arr[][] = new int[len][len];
		int x = 0, y = 0;
		int cnt = (int) Math.pow(len, 2);
		arr[x][y] = cnt--;
		int nx = x;
		int ny = y;

		while (cnt > 0) {
			while (nx + 1 < len && arr[nx + 1][ny] == 0) {
				nx++;
				arr[nx][ny] = cnt--;

			}
			while (ny + 1 < len && arr[nx][ny + 1] == 0) {
				ny++;
				arr[nx][ny] = cnt--;

			}
			while (nx - 1 >= 0 && arr[nx - 1][ny] == 0) {
				nx--;
				arr[nx][ny] = cnt--;
			}

			while (ny - 1 >= 0 && arr[nx][ny - 1] == 0) {
				ny--;
				arr[nx][ny] = cnt--;
			}

		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (arr[i][j] == n) {
					x = i + 1;
					y = j + 1;
				}
				sb.append(arr[i][j]).append(" ");
			}
			sb.append("\n");
		}
		sb.append(x).append(" ").append(y);
		System.out.println(sb);

	}
}
