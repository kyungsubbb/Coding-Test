import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
			int N = sc.nextInt();
			System.out.print(fibo(N+1));
	}
	private static int fibo(int N) {
		if(N==1){
			return 0;
		}
		else if(N==2) {
			return 1;
		}
		else {
			return fibo(N-1)+fibo(N-2);
		}
		
	}
}
