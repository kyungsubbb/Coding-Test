<<<<<<< HEAD
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T=Integer.parseInt(sc.nextLine());
		for(int test_case = 1; test_case <= T; test_case++){
			String data = sc.next();
			if(data.length() != 8) {
				System.out.printf("#%d %d\n",test_case, -1);
			}
			else {
				String year="", month = "", day = "";
				for (int i = 0; i < data.length(); i++) {
					if(i>=0 && i<4) 
						year += data.charAt(i);
					else if(i<6 && i>=4)
						month += data.charAt(i);
					else
						day += data.charAt(i);
				}
				if(Integer.parseInt(month)==1 || Integer.parseInt(month)==3 || Integer.parseInt(month)==5 || Integer.parseInt(month)==7 ||
						Integer.parseInt(month)==8 || Integer.parseInt(month)==10 || Integer.parseInt(month)==12) {
					if(Integer.parseInt(day) <= 31) {
						System.out.printf("#%d %s/%s/%s\n",test_case, year, month, day);
					}
					else {
						System.out.printf("#%d %d\n",test_case, -1);
					}
				}
				else if(Integer.parseInt(month)==4 || Integer.parseInt(month)==6 || Integer.parseInt(month)==9 || Integer.parseInt(month)==11) {
					if(Integer.parseInt(day) <= 30) {
						System.out.printf("#%d %s/%s/%s\n",test_case, year, month, day);
					}
					else {
						System.out.printf("#%d %d\n",test_case, -1);
					}
				}
				else if(Integer.parseInt(month)==2) {
					if(Integer.parseInt(day) <= 28) {
						System.out.printf("#%d %s/%s/%s\n",test_case, year, month, day);
					}
					else {
						System.out.printf("#%d %d\n",test_case, -1);
					}
				}
				else {
					System.out.printf("#%d %d\n",test_case, -1);
				}
					
			}
		}
		sc.close();
	}
}
=======
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T=Integer.parseInt(sc.nextLine());
		for(int test_case = 1; test_case <= T; test_case++){
			String data = sc.next();
			if(data.length() != 8) {
				System.out.printf("#%d %d\n",test_case, -1);
			}
			else {
				String year="", month = "", day = "";
				for (int i = 0; i < data.length(); i++) {
					if(i>=0 && i<4) 
						year += data.charAt(i);
					else if(i<6 && i>=4)
						month += data.charAt(i);
					else
						day += data.charAt(i);
				}
				if(Integer.parseInt(month)==1 || Integer.parseInt(month)==3 || Integer.parseInt(month)==5 || Integer.parseInt(month)==7 ||
						Integer.parseInt(month)==8 || Integer.parseInt(month)==10 || Integer.parseInt(month)==12) {
					if(Integer.parseInt(day) <= 31) {
						System.out.printf("#%d %s/%s/%s\n",test_case, year, month, day);
					}
					else {
						System.out.printf("#%d %d\n",test_case, -1);
					}
				}
				else if(Integer.parseInt(month)==4 || Integer.parseInt(month)==6 || Integer.parseInt(month)==9 || Integer.parseInt(month)==11) {
					if(Integer.parseInt(day) <= 30) {
						System.out.printf("#%d %s/%s/%s\n",test_case, year, month, day);
					}
					else {
						System.out.printf("#%d %d\n",test_case, -1);
					}
				}
				else if(Integer.parseInt(month)==2) {
					if(Integer.parseInt(day) <= 28) {
						System.out.printf("#%d %s/%s/%s\n",test_case, year, month, day);
					}
					else {
						System.out.printf("#%d %d\n",test_case, -1);
					}
				}
				else {
					System.out.printf("#%d %d\n",test_case, -1);
				}
					
			}
		}
		sc.close();
	}
}
>>>>>>> 67321b42d057ae46e6ef576567d6363424070fc3
