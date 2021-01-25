import java.util.Arrays;
import java.util.Scanner;

class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for (int test_case = 1; test_case <= T; test_case++) {
			int N = sc.nextInt();
			double[] score = new double[N+1];
			int cnt = sc.nextInt();
			for (int i = 1; i <= N; i++) {
				int mid = sc.nextInt();
				int fin = sc.nextInt();
				int hw = sc.nextInt();
				score[i] = (mid*0.35)+(fin*0.45)+(hw*0.2);
			}
			
			
			double[] sortScore = Arrays.copyOfRange(score, 0, score.length);
			Arrays.sort(sortScore);
			int[] rank = new int[sortScore.length];
			for (int i = 1; i < sortScore.length; i++) {
				for (int j = 1; j < score.length; j++) {
					if(score[j]==sortScore[i]){
						rank[j] = N-i+1;
					}
				}
			}
			
			
			double val = rank[cnt]*1.0/N*1.0;

			if(val >=0 && val <= 0.1)
				System.out.printf("#%d %s\n",test_case, "A+");
			else if(val > 0.1 && val <= 0.2 )
				System.out.printf("#%d %s\n",test_case, "A0");
			else if(val > 0.2 && val <= 0.3 )
				System.out.printf("#%d %s\n",test_case, "A-");
			else if(val > 0.3 && val <= 0.4 )
				System.out.printf("#%d %s\n",test_case, "B+");
			else if(val > 0.4 && val <= 0.5 )
				System.out.printf("#%d %s\n",test_case, "B0");
			else if(val > 0.5 && val <= 0.6 )
				System.out.printf("#%d %s\n",test_case, "B-");
			else if(val > 0.6 && val <= 0.7 )
				System.out.printf("#%d %s\n",test_case, "C+");
			else if(val > 0.7 && val <= 0.8 )
				System.out.printf("#%d %s\n",test_case, "C0");
			else if(val > 0.8 && val <= 0.9 )
				System.out.printf("#%d %s\n",test_case, "C-");
			else
				System.out.printf("#%d %s\n",test_case, "D0");
			
		}
		
		
		
	}

}
