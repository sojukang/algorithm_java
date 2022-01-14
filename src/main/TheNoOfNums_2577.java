package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;

public class TheNoOfNums_2577 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int num = 1;
		for (int i = 0; i < 3; i++) {
			num *= Integer.parseInt(br.readLine());
		}
		List<Integer> integers = calculateFreqByNum(num);
		printListByLine(integers);
	}

	private static List<Integer> calculateFreqByNum(int num) {
		Integer[] data = new Integer[10];
		Arrays.fill(data, 0);
		List<Integer> list = Arrays.asList(data);
		String[] numStr = Integer.toString(num).split("");
		for (String s : numStr) {
			int no = Integer.parseInt(s);
			list.set(no, list.get(no) + 1);
		}

		return list;
	}

	private static void printListByLine(List<Integer> integers) {
		integers.forEach(System.out::println);
	}
}
