package main.tools;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class UserInput {
	public static List<Integer> getIntegersBySplitter(BufferedReader br, String splitter) throws IOException {
		List<String> strings = Arrays.asList(br.readLine().split(splitter));
		return strings.stream().map(Integer::parseInt).collect(Collectors.toList());
	}

	public static int[] getIntsBySplitter(BufferedReader br, String splitter) throws IOException {
		return Arrays.stream(br.readLine().split(splitter)).mapToInt(Integer::parseInt).toArray();
	}
}
