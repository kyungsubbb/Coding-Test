import java.util.*;
import java.io.*;

public class BOJ_2447 {
	private static char map[][];

	private static void star(int x, int y, int n) {
		if (n == 3) {
			for (int i = x; i < x + 3; i++) {
				for (int j = y; j < y + 3; j++) {
					if (i == x + 1 && j == y + 1)
						continue;
					map[i][j] = '*';
				}
			}
			return;
		}

		int num = n / 3;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (i == 1 && j == 1)
					continue;
				star(x + num * i, y + num * j, num);
			}
		}

	}

	public static void main(String[] args) throws IOException{
		BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder("");
		int n = Integer.parseInt(sc.readLine());
		map = new char[n][n];
		star(0, 0, n);
		for (int i = 0; i < map.length; i++) {
			for (int j = 0; j < map.length; j++) {
				if(map[i][j] == '*') sb.append('*');
				else sb.append(" ");
			}
			sb.append("\n");
		}
		System.out.println(sb);
	}

}
