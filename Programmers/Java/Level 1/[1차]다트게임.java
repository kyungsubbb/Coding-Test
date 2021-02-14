import java.util.*;

class Solution {
	public int solution(String dartResult) {
		int answer = 0;
		String ans = "";
		Stack<Integer> stack = new Stack<>();
		for (int i = 0; i < dartResult.length(); i++) {
			if (dartResult.charAt(i) - '0' >= 0 && dartResult.charAt(i) - '0' <= 9) {
				ans += dartResult.charAt(i);
			} else {
				int tmp = Integer.parseInt(ans);
				char tmp2 = dartResult.charAt(i);
				switch (tmp2) {
				case 'S':
					tmp = (int) Math.pow(tmp, 1);
					break;
				case 'D':
					tmp = (int) Math.pow(tmp, 2);
					break;
				case 'T':
					tmp = (int) Math.pow(tmp, 3);
					break;
				}
				char tmp3;
				if (i + 1 < dartResult.length()
						&& (dartResult.charAt(i + 1) == '*' || dartResult.charAt(i + 1) == '#')) {
					tmp3 = dartResult.charAt(++i);
					switch (tmp3) {
					case '#':
						tmp *= -1;
						break;
					case '*':
						if (stack.size() >= 1)
							stack.push(stack.pop() * 2);
						tmp *= 2;
						break;

					}
				}

				stack.push(tmp);
				ans = "";
			}

		}
		for (int j = 0; j < stack.size(); j++) {
			answer += stack.get(j);
		}
		return answer;
	}
}