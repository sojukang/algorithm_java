package main.tools;

import java.util.Stack;
import java.util.stream.IntStream;

public class DataStructureTools {
	private static Stack<Integer> stack = new Stack<>();

	private static int sumOfStack() {
		return IntStream.range(0, stack.size()).map(i -> stack.pop()).sum();
	}
}
