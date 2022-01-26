package main.tools;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class UserInput {
	private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static List<Integer> getIntegersBySplitter(String splitter) throws IOException {
		List<String> strings = Arrays.asList(br.readLine().split(splitter));
		return strings.stream().map(Integer::parseInt).collect(Collectors.toList());
	}

	public static int[] getIntsBySplitter(String splitter) throws IOException {
		return Arrays.stream(br.readLine().split(splitter)).mapToInt(Integer::parseInt).toArray();
	}

	private static int getIntByLine() throws IOException {
		return Integer.parseInt(br.readLine());
	}
}
