import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] A = new int[N];
		for (int i = 0; i < A.length; i++) {
			A[i] = sc.nextInt();
		}
		int B = sc.nextInt();
		int C = sc.nextInt();
		
		long cnt = 0;
		
		for (int i = 0; i < A.length; i++) {
			A[i] -= B;
			cnt++;
		}
		for(int i : A) {
			if(i>0) {
				if(i%C != 0)
					cnt += (i/C) + 1;
				else
					cnt += (i/C);
			}
		}
		System.out.println(cnt);
		sc.close();
	}

}