package main.bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;
import java.util.stream.Collectors;

public class body_7568 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		List<List<Integer>> list = new ArrayList<>();
		for (int i = 0; i < N; i++) {
			List<Integer> integers = getIntegersBySplitter(br, " ");
			integers.add(1);
			list.add(integers);
		}

		for (List<Integer> integers : list) {
			for (List<Integer> integersToCompare : list) {
				if (integers == integersToCompare) {
					continue;
				}

				if (integers.get(0) < integersToCompare.get(0) && integers.get(1) < integersToCompare.get(1)) {
					integers.set(2, integers.get(2) + 1);
				}
			}
			System.out.print(integers.get(2) + " ");
		}

		// System.out.println(joinByDelimiter(list, " "));
	}

	public static List<Integer> getIntegersBySplitter(BufferedReader br, String splitter) throws IOException {
		List<String> strings = Arrays.asList(br.readLine().split(splitter));
		return strings.stream().map(Integer::parseInt).collect(Collectors.toList());
	}

	public static String joinByDelimiter(List<List<Integer>> list, CharSequence delimiter) {
		StringJoiner joiner = new StringJoiner(delimiter);
		for (List<Integer> integers : list) {
			joiner.add(integers.get(2).toString());
		}
		return joiner.toString();
	}
}
