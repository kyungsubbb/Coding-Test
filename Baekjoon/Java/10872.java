import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
			int N = sc.nextInt();
			System.out.print(factorial(N));
	}
	private static int factorial(int N) {
		if(N<2){
			return 1;
		}
		else {
			return N*factorial(N-1);
		}
		
	}
}
