package main.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class BalancedWorld_4949 {
	private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	private static Stack<String> stack = new Stack<>();
	public static void main(String[] args) throws IOException {
		String input = new String();
		while (true) {
			input = br.readLine();
			if (input.equals(".")) {
				break;
			}
			validParenthesis(input);
		}
	}

	private static void validParenthesis(String input) {
		for (String parent : input.split("")) {
			if (parent.equals("(") || parent.equals("[")) {
				stack.push(parent);
			}
			// else if (parent.equals(")") || parent.equals("]")) {
			// 	if (stack.empty() || stack.peek().equals(")") || stack.peek().equals("]")) {
			// 		stack.push(parent);
			// 	} else if (stack.peek().equals("(") && parent.equals(")")){
			// 		stack.pop();
			// 	} else if (stack.peek().equals("[") && parent.equals("]")) {
			// 		stack.pop();
			// 	}
			// }
			else if (parent.equals(")")) {
				if (stack.empty()) {
					stack.push(parent);
					break;
				}
				else if (stack.peek().equals("(")) {
					stack.pop();
				} else if (stack.peek().equals("[")) {
					break;
				}
			} else if (parent.equals("]")) {
				if (stack.empty()) {
					stack.push(parent);
					break;
				}
				else if (stack.peek().equals("[")) {
					stack.pop();
				} else if (stack.peek().equals("(")) {
					break;
				}
			}
		}
		if (stack.empty()) {
			System.out.println("yes");
		} else {
			System.out.println("no");
		}
		stack.removeAllElements();
	}
}
