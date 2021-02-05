import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class BOJ10867 {

	public static void main(String[] args) {
		Set<Integer> input = new HashSet<>();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			input.add(sc.nextInt());
		}
		int arr[] = new int[input.size()];
		Iterator<Integer> it = input.iterator();
		int k = 0;
		while(it.hasNext()) {
			arr[k++] = it.next();
		}
		Arrays.sort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	sc.close();
	}

}
