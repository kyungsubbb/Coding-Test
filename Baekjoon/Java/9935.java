import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder("");
	public static void main(String[] args) throws Exception {
		String input = in.readLine();
		String bomb = in.readLine();
		Stack<Character> stack = new Stack<>();
		for (int i = 0; i < input.length(); i++) {
			stack.push(input.charAt(i));
			if (stack.peek() == bomb.charAt(bomb.length() - 1) && stack.size() >= bomb.length()) {
				boolean flag = true;
				int num = 1;
				for (int j = 0; j < bomb.length(); j++) {
					if (stack.get(stack.size() - num) != bomb.charAt(bomb.length() - num))
						flag = false;
					num++;
				}

				if (flag) {
					for (int j = 0; j < bomb.length(); j++) {
						stack.pop();
					}
				}
			}
		}
		if (stack.size() == 0)
			sb.append("FRULA");
		else {
			for (int i = 0; i < stack.size(); i++) {
				sb.append(stack.get(i));
			}
		}
		System.out.println(sb);

	}
}