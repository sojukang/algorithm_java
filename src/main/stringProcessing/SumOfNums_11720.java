package main.stringProcessing;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SumOfNums_11720 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		List<Integer> integers = getIntegersBySplitter(br, "");
		int result = sumOfInts(integers);
		System.out.println(result);
	}

	public static List<Integer> getIntegersBySplitter(BufferedReader br, String splitter) throws IOException {
		List<String> strings = Arrays.asList(br.readLine().split(splitter));
		return strings.stream().map(Integer::parseInt).collect(Collectors.toList());
	}

	public static int sumOfInts(List<Integer> integers) {
		return integers.stream().mapToInt(i -> i).sum();
	}
}
