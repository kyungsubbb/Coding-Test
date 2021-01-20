import java.util.*;

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T=Integer.parseInt(sc.nextLine());
		
		String[] input = sc.nextLine().split(" ");
		int[] input_Int = Arrays.stream(input).mapToInt(Integer::parseInt).toArray();
		Arrays.sort(input_Int);
		System.out.println(input_Int[input_Int.length/2]);
		
		sc.close();
	}
}