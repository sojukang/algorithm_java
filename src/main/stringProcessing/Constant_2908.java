package main.stringProcessing;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Constant_2908 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		List<String> strings1 = Arrays.asList(st.nextToken().split(""));
		List<String> strings2 = Arrays.asList(st.nextToken().split(""));

		getReversedList(strings1);
		getReversedList(strings2);

		int num1 = Integer.parseInt(listToString(strings1));
		int num2 = Integer.parseInt(listToString(strings2));
		System.out.println(Math.max(num1, num2));
	}

	private static void getReversedList(List<String> list) {
		Collections.reverse(list);
	}

	private static String listToString(List<String> list) {
		return String.join("", list);
		// return list.stream().collect(Collectors.joining());
	}
}
