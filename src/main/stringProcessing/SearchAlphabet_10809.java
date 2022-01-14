package main.stringProcessing;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;

public class SearchAlphabet_10809 {
	private static final int DEFAULT_VALUE = -1;
	private static final int NO_OF_ALPHABETS = 26;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		List<String> strings = Arrays.asList(br.readLine().split(""));
		List<Integer> defaultIntegerList = defaultIntegerList(NO_OF_ALPHABETS, DEFAULT_VALUE);

		for (int i = 0; i < strings.size(); i++) {
			int idx = stringToAscii(strings.get(i)) - stringToAscii("a");
			if (defaultIntegerList.get(idx) == DEFAULT_VALUE) {
				defaultIntegerList.set(idx, i);
			}
		}
		String result = joinByDelimiter(defaultIntegerList, " ");
		System.out.println(result);
	}

	private static String joinByDelimiter(List<Integer> defaultIntegerList, CharSequence delimiter) {
		StringJoiner joiner = new StringJoiner(delimiter);
		defaultIntegerList.stream().map(integer -> Integer.toString(integer)).forEach(joiner::add);
		return joiner.toString();
	}

	public static List<Integer> defaultIntegerList(int listSize, Object defaultValue) {
		Integer[] data = new Integer[listSize];
		Arrays.fill(data, defaultValue);
		return Arrays.asList(data);
	}

	public static int stringToAscii(String input) {
		return input.toCharArray()[0];
	}
}
