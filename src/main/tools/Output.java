package main.tools;

import java.util.List;

public class Output {
	private static void printListByLine(List<Integer> integers) {
		integers.forEach(System.out::println);
	}
}
