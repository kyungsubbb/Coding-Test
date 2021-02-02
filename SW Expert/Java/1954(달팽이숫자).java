import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(in.readLine());
		for (int i = 1; i <= n; i++) {
			int len = Integer.parseInt(in.readLine());
			int arr[][] = new int[len][len];
			int x=0, y=0;
			int cnt=1;
			arr[x][y] = cnt++;
			int nx = x;
			int ny = y;
			while(cnt <= Math.pow(len, 2)) {
				while(ny+1 < len  && arr[nx][ny+1] == 0) {
					ny++;
					arr[nx][ny] = cnt++;
					
				}
				while(nx+1 < len && arr[nx+1][ny] == 0) {
					nx++;
					arr[nx][ny] = cnt++;
					
				}
				while(ny-1 >= 0 && arr[nx][ny-1] == 0) {
					ny--;
					arr[nx][ny] = cnt++;
				}

				while(nx-1 >= 0 && arr[nx-1][ny] == 0) {
					nx--;
					arr[nx][ny] = cnt++;
				}
				
			}
			System.out.println("#"+i);
			for (int j = 0; j < arr.length; j++) {
				for (int k = 0; k < arr.length; k++) {
					System.out.print(arr[j][k] + " ");
				}
				System.out.println();
			}
		}
	}
}