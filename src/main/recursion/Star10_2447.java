package main.recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Star10_2447 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		printListByLine(star10(N));
	}

	private static List<String> star10(int n) {
		if (n == 1) {
			return Arrays.asList("*");
		}

		List<String> stars = star10(n / 3);
		List<String> list = new ArrayList<>();

		for (String star : stars) {
			list.add(star.repeat(3));
		}

		for (String star : stars) {
			list.add(star + " ".repeat(n / 3) + star);
		}

		for (String star : stars) {
			list.add(star.repeat(3));
		}
		return list;
	}

	private static void printListByLine(List<String> strings) { strings.forEach(System.out::println);
	}
}
