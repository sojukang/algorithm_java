package main.tools;

import java.util.Collections;
import java.util.List;
import java.util.StringJoiner;
import java.util.stream.Collectors;

public class StringTools {
	public static int stringToAscii(String input) {
		return input.toCharArray()[0];
	}

	public static String joinByDelimiter(List<Integer> integers, CharSequence delimiter) {
		StringJoiner joiner = new StringJoiner(delimiter);
		integers.stream().map(integer -> Integer.toString(integer)).forEach(joiner::add);
		return joiner.toString();
	}

	public static String listToString(List<String> list) {
		// return list.stream().collect(Collectors.joining());
		return String.join("", list);
	}

	public static String listToString(List<String> list, int idxStart, int idxEnd) {
		// return list.subList(idxStart, idxEnd).stream().collect(Collectors.joining());
		return String.join("", list.subList(idxStart, idxEnd));
	}

	public static void getReversedList(List<String> list) {
		Collections.reverse(list);
	}
}
