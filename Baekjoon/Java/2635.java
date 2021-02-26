import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class BOJ_2635 {
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static int res = 0, N, arr[];
	public static void main(String[] args) throws Exception {
		N = Integer.parseInt(in.readLine());
		int num = N;
		while(num >= 1) {
			checkNum(num--);
		}
		System.out.println(arr.length);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	private static void checkNum(int num) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(N);
		list.add(num);
		int tmp = 0;
		while(true) {
			tmp = list.get(list.size()-2) - list.get(list.size()-1); 
			if(tmp < 0) {
				break;
			}
			else {
				list.add(tmp);
			}
		}
		if(res < list.size()) {
			res = list.size();
			arr = new int[list.size()];
			for (int i = 0; i < arr.length; i++) {
				arr[i] = list.get(i);
			}
		}
	}

}
