package main.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Parenthesis_9012 {
	private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	private static Stack<String> stack = new Stack<>();
	public static void main(String[] args) throws IOException {
		int N = Integer.parseInt(br.readLine());
		for (int i = 0; i < N; i++) {
			validParenthesis(br.readLine());
		}
	}

	private static void validParenthesis(String input) {
		for (String parent : input.split("")) {
			if (parent.equals("(")) {
				stack.push(parent);
			} else if (parent.equals(")")) {
				if (stack.empty() || stack.peek().equals(")")) {
					stack.push(parent);
				} else {
					stack.pop();
				}
			}
		}
		if (stack.empty()) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
		stack.removeAllElements();
	}
}
