import java.io.IOException;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) throws NumberFormatException, IOException{
		int n = 10;
		int dx[] = {-1, 1};
		Scanner in = new Scanner(System.in);
		int arr[][] ;
		for (int i = 1; i <= n; i++) {
			int x = 0;
			int y = 99;
			arr = new int[100][100];
			int cnt = in.nextInt();
			for (int j = 0; j < arr.length; j++) {
				for (int k = 0; k < arr.length; k++) {
					arr[j][k] = in.nextInt();
				}
			}
			for (int j = 0; j < arr.length; j++) {
				if(arr[99][j] == 2)
					x = j;
			}
			while(y>=0) {
				int nx;
				boolean flag = false;
				arr[y][x] = 9;
				for (int j = 0; j < 2; j++) {
					nx = x + dx[j];
					if(nx >= 0 && nx < 100 && arr[y][nx]==1) {
						x = nx;
						flag = true;
						break;
					}
				}
				if(!flag) y--;
			}
			System.out.println("#"+i + " " + x);
		}
		in.close();
	}
	

}