package main.stringProcessing;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class CroatiaAlphabet_2941 {
	private static final int LENGTH_2 = 2;
	private static final int LENGTH_3 = 3;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		int result = 0;
		List<String> strings = Arrays.asList(input.split(""));
		if (!input.isEmpty()) {
			result = strings.size();
		}
		HashMap<String, List<String>> map = getStringListHashMapInitiated();

		int i = 0;
		while (i < strings.size()) {
			List<String> propositionList = map.get(strings.get(i));
			if (propositionList != null) {
				if (validCroatianAlphabet(strings, i, propositionList, LENGTH_2)) {
					i += (LENGTH_2 - 1);
					result -= (LENGTH_2 - 1);
				} else if (validCroatianAlphabet(strings, i, propositionList, LENGTH_3)) {
					i += (LENGTH_3 - 1);
					result -= (LENGTH_3 - 1);
				}
			}
			i++;
		}
		System.out.println(result);
	}

	private static boolean validCroatianAlphabet(List<String> strings, int idx, List<String> propositionList,
		int length) {
		return idx + length <= strings.size() && propositionList.contains(subListToString(strings, idx, idx + length));
	}

	private static HashMap<String, List<String>> getStringListHashMapInitiated() {
		HashMap<String, List<String>> map = new HashMap<>();
		map.put("c", Arrays.asList("c=", "c-"));
		map.put("d", Arrays.asList("d-", "dz="));
		map.put("l", Arrays.asList("lj"));
		map.put("n", Arrays.asList("nj"));
		map.put("s", Arrays.asList("s="));
		map.put("z", Arrays.asList("z="));
		return map;
	}

	private static String subListToString(List<String> list, int idxStart, int idxEnd) {
		return list.subList(idxStart, idxEnd).stream().collect(Collectors.joining());
	}
}