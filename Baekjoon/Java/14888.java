import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ_14888 {
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	static int min = Integer.MAX_VALUE;
	static int max = Integer.MIN_VALUE;

	private static boolean nextPermutation(char[] arr) { // 순열
		int i = arr.length - 1; 
		while (i > 0 && arr[i] <= arr[i - 1])
			--i;

		if (i == 0)
			return false;

		int j = arr.length - 1; 
		while (arr[i - 1] >= arr[j])
			--j;

		swap(arr, i - 1, j);

		int k = arr.length - 1; 
		while (i < k)
			swap(arr, i++, k--);
		return true;

	}

	private static void swap(char[] arr, int i, int j) {
		char tmp = arr[i];
		arr[i] = arr[j];
		arr[j] = tmp;
	}

	public static void main(String[] args) throws Exception {
		int N = Integer.parseInt(in.readLine());
		int input[] = new int[N];
		st = new StringTokenizer(in.readLine(), " ");

		for (int i = 0; i < input.length; i++) {
			input[i] = Integer.parseInt(st.nextToken());
		}

		String operator = "";
		st = new StringTokenizer(in.readLine(), " ");
		for (int i = 0; i < 4; i++) {
			int tmp = Integer.parseInt(st.nextToken());
			switch (i) {
			case 0:
				for (int j = 0; j < tmp; j++) {
					operator += "+";
				}
				break;
			case 1:
				for (int j = 0; j < tmp; j++) {
					operator += "-";
				}
				break;
			case 2:
				for (int j = 0; j < tmp; j++) {
					operator += "*";
				}
				break;
			case 3:
				for (int j = 0; j < tmp; j++) {
					operator += "/";
				}
				break;
			}
		}
		char oper[] = operator.toCharArray();
		Arrays.sort(oper);
		int result = 0;
		do {
			Queue<String> q = new LinkedList<>();
			for (int i = 0; i < input.length; i++) {
				q.offer(Integer.toString(input[i]));
				if (i < N - 1)
					q.offer(Character.toString(oper[i]));
			}
			result = Integer.parseInt(q.poll());
			while (!q.isEmpty()) {
				String tmp = q.poll();
				switch (tmp) {
				case "+":
					result += Integer.parseInt(q.poll());
					break;
				case "-":
					result -= Integer.parseInt(q.poll());
					break;
				case "*":
					result *= Integer.parseInt(q.poll());
					break;
				case "/":
					result /= Integer.parseInt(q.poll());
					break;
				}
			}
			min = Math.min(min, result);
			max = Math.max(max, result);
		} while (nextPermutation(oper));

		System.out.println(max);
		System.out.println(min);
	}

}
