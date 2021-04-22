import java.math.BigInteger;
import java.util.Scanner;

public class BOJ_2407 {
	static Scanner sc = new Scanner(System.in);
	static BigInteger map[][];
	public static void main(String[] args) 	{
		
		makeDP();
		int n = sc.nextInt();
		int m = sc.nextInt();
		System.out.println(map[n][m]);

	}
	private static void makeDP() {
		
		map = new BigInteger[101][101];
		
		
		for (int i = 0; i <= 100; i++) {
			for (int j = 0; j <= i; j++) {
				if(j == 0 || i == j)
					map[i][j] = new BigInteger("1");
				else
					map[i][j] = map[i-1][j-1].add(map[i-1][j]);
			}
		} 
	}

}
