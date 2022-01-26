package main.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Stack_10828 {
	private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	private static Stack<Integer> stack = new Stack<>();

	public static void main(String[] args) throws IOException {
		int N = Integer.parseInt(br.readLine());
		for (int i = 0; i < N; i++) {
			stackCommand(br.readLine());
		}
	}

	private static void stackCommand(String command) {
		if (command.contains("push")) {
			stack.push(Integer.parseInt(command.split(" ")[1]));
		} else if (command.contains("pop")) {
			pop();
		} else if (command.contains("size")) {
			System.out.println(stack.size());
		} else if (command.contains("empty")) {
			empty();
		} else if (command.contains("top")) {
			top();
		}
	}

	private static void top() {
		if (stack.empty()) {
			System.out.println(-1);
		} else {
			System.out.println(stack.peek());
		}
	}

	private static void empty() {
		if (stack.empty()) {
			System.out.println(1);
		} else {
			System.out.println(0);
		}
	}

	private static void pop() {
		if (stack.empty()) {
			System.out.println(-1);
		} else {
			System.out.println(stack.pop());
		}
	}
}
