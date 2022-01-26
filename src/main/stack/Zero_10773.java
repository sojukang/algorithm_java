package main.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.stream.IntStream;

public class Zero_10773 {
	private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	private static Stack<Integer> stack = new Stack<>();
	public static void main(String[] args) throws IOException {
		int K = getIntByLine();
		for (int i = 0; i < K; i++) {
			zero(getIntByLine());
		}
		System.out.println(sumOfStack());
	}

	private static void zero(int input) {
		if (input == 0) {
			stack.pop();
		} else {
			stack.push(input);
		}
	}

	private static int sumOfStack() {
		return IntStream.range(0, stack.size()).map(i -> stack.pop()).sum();
	}

	private static int getIntByLine() throws IOException {
		return Integer.parseInt(br.readLine());
	}
}
