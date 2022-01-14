package main.tools;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

public class ListTools {
	public static int sumOfInts(List<Integer> integers) {
		return integers.stream().mapToInt(i -> i).sum();
	}

	public static int sumOfInts(int[] input) {
		return Arrays.stream(input).sum();
	}

	public static int minOfInts(int[] input) {
		return Arrays.stream(input).min().getAsInt();
	}

	public static int minOfInts(List<Integer> integers) {
		return Collections.min(integers);
	}

	public static int maxOfInts(int[] input) {
		return Arrays.stream(input).min().getAsInt();
	}

	public static int maxOfInts(List<Integer> integers) {
		return Collections.max(integers);
	}

	public static int partialSumOfIntegerList(List<Integer> integers, int idxStart, int idxEnd) {
		return IntStream.range(idxStart, idxEnd).map(integers::get).sum();
	}

	public static List<Integer> defaultIntegerList(int listSize, Object defaultValue) {
		Integer[] data = new Integer[listSize];
		Arrays.fill(data, defaultValue);
		return Arrays.asList(data);
	}
}
