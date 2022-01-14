package main.InputOutputArray;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Mean_1546 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());

		List<Integer> integers = getIntegersBySpace(br);

		int max = Collections.max(integers);
		int sum = getSum(integers);
		double newAvg = (double) sum / (max * N) * 100;
		System.out.println(newAvg);
	}

	private static int getSum(List<Integer> integers) {
		return integers.stream().mapToInt(i -> i).sum();
	}

	private static List<Integer> getIntegersBySpace(BufferedReader br) throws IOException {
		List<String> strings = Arrays.asList(br.readLine().split(" "));
		return strings.stream().map(Integer::parseInt).collect(Collectors.toList());
	}
}
