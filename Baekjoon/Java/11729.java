import java.util.Scanner;

public class Main {
	public static StringBuilder sb = new StringBuilder();
	
	public static void hanoi(int n, int a, int b, int c) {
		
		
		if(n==1)
			sb.append(a).append(" ").append(c).append("\n");
		else {
			hanoi(n-1, a, c, b);
			sb.append(a).append(" ").append(c).append("\n");
			hanoi(n-1, b, a, c);
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sb.append((int)Math.pow(2, n)-1).append("\n");
		
		hanoi(n,1,2,3);
		System.out.println(sb);
	}

}
