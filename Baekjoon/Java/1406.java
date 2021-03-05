package solving;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class BOJ_1406 {
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	static Stack<Character> one = new Stack<>();
	static Stack<Character> two = new Stack<>();
	static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) throws Exception {
		String input = in.readLine();
		for (int i = 0; i < input.length(); i++) {
			one.push(input.charAt(i));
		}
		int N = Integer.parseInt(in.readLine());
		for (int i = 0; i < N; i++) {
			char[] tmp = in.readLine().toCharArray();
			if (tmp[0] == 'L') {
				left();
			} else if (tmp[0] == 'D') {
				right();
			} else if (tmp[0] == 'B') {
				delete();
			} else if (tmp[0] == 'P') {
				plus(tmp[2]);
			}
		}
		for (int i = 0; i < one.size(); i++) {
			sb.append(one.get(i));
		}
		while(!two.isEmpty())
			sb.append(two.pop());
		System.out.println(sb);
	}

	static void left() {
		if (!one.isEmpty()) {
			two.push(one.pop());
		}
	}

	static void right() {
		if (!two.isEmpty()) {
			one.push(two.pop());
		}
	}

	static void delete() {
		if (!one.isEmpty()) {
			one.pop();
		}
	}

	static void plus(char a) {
		one.push(a);
	}

}
