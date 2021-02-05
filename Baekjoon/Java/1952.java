import java.io.IOException;
import java.util.Scanner;

public class BOJ_Snail1952 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		Scanner sc = new Scanner(System.in);
		int len = sc.nextInt();
		int height = sc.nextInt();
		int arr[][] = new int[len][height];
		int x = 0, y = 0;
		int cnt = 1;
		arr[x][y] = cnt++;
		int nx = x;
		int ny = y;
		int count = 0;
		while (cnt < len * height) {
			// System.out.println(cnt);
			while (ny + 1 < height && arr[nx][ny + 1] == 0) {
				ny++;
				arr[nx][ny] = cnt++;

			}
			if (cnt <= len * height)
				count++;
			//System.out.println(nx + " " + ny);
			while (nx + 1 < len && arr[nx + 1][ny] == 0) {
				nx++;
				arr[nx][ny] = cnt++;

			}
			if (cnt <= len * height)
				count++;
			//System.out.println(nx + " " + ny);
			while (ny - 1 >= 0 && arr[nx][ny - 1] == 0) {
				ny--;
				arr[nx][ny] = cnt++;
			}
			if (cnt <= len * height)
				count++;
			//System.out.println(nx + " " + ny);
			while (nx - 1 >= 0 && arr[nx - 1][ny] == 0) {
				nx--;
				arr[nx][ny] = cnt++;
			}
			if (cnt <= len * height)
				count++;
			//System.out.println(nx + " " + ny);
		}
//			for (int i = 0; i < len; i++) {
//				for (int j = 0; j < height; j++) {
//					System.out.print(arr[i][j] + "\t");
//				} 
//				System.out.println();
//			}
		System.out.println(count);
	}
}
