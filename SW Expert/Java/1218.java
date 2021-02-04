package com.algo03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class SWEX_1218 {
	private static boolean check(char a, char b) {
		if ((a == '(' && b == ')') || (a == '{' && b == '}') || (a == '[' && b == ']') || (a == '<' && b == '>')) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int T = 10;
		for (int i = 1; i <= T; i++) {
			int result = 0;
			Stack<Character> st = new Stack<>();
			int n = Integer.parseInt(in.readLine());
			String str = in.readLine();
			for (int j = 0; j < n; j++) {

				if (str.charAt(j) == '(' || str.charAt(j) == '{' || str.charAt(j) == '[' || str.charAt(j) == '<') {
					st.push(str.charAt(j));
				} else {
					if (st.isEmpty()) {
						break;
					}
					char tmp = st.peek();
					if (check(tmp, str.charAt(j))) {
						st.pop();
					} else {
						break;
					}

				}
			}
			if (st.isEmpty()) {
				result = 1;
			}
			System.out.println("#" + i + " " + result);
		}

	}

}
