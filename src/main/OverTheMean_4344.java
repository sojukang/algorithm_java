package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class OverTheMean_4344 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		for (int i = 0; i < N; i++) {
			printOverTheMean(br);
		}
	}

	private static void printOverTheMean(BufferedReader br) throws IOException {
		List<Integer> integers = getIntegersBySpace(br);
		int count = 0;
		int sum = IntStream.range(1, integers.size()).map(integers::get).sum();
		double mean = (double) sum / integers.get(0);
		for (int i = 1; i < integers.size(); i++) {
			if (integers.get(i) > mean) {
				count++;
			}
		}
		double result = (double) count / (integers.size() - 1) * 100;
		System.out.println(String.format("%.3f", result) + "%");
	}

	private static List<Integer> getIntegersBySpace(BufferedReader br) throws IOException {
		List<String> strings = Arrays.asList(br.readLine().split(" "));
		List<Integer> integers = strings.stream().map(Integer::parseInt).collect(Collectors.toList());
		return integers;
	}
}
