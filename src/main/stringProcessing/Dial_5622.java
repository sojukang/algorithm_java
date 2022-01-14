package main.stringProcessing;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Dial_5622 {
	public static void main(String[] args) throws IOException {
		HashMap<List<String>, Integer> map = getListIntegerHashMapInitiated();
		int result;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		List<String> strings = Arrays.asList(br.readLine().split(""));
		result = sumIfKeyContainsInput(map, strings);
		System.out.println(result);
	}

	public static int sumIfKeyContainsInput(HashMap<List<String>, Integer> map, List<String> objects) {
		return objects.stream()
			.mapToInt(str -> map.keySet().stream().filter(list -> list.contains(str)).mapToInt(map::get).sum())
			.sum();
	}

	private static HashMap<List<String>, Integer> getListIntegerHashMapInitiated() {
		HashMap<List<String>, Integer> map = new HashMap<>();
		map.put(Arrays.asList("1"), 2);
		map.put(Arrays.asList("A", "B", "C"), 3);
		map.put(Arrays.asList("D", "E", "F"), 4);
		map.put(Arrays.asList("G", "H", "I"), 5);
		map.put(Arrays.asList("J", "K", "L"), 6);
		map.put(Arrays.asList("M", "N", "O"), 7);
		map.put(Arrays.asList("P", "Q", "R", "S"), 8);
		map.put(Arrays.asList("T", "U", "V"), 9);
		map.put(Arrays.asList("W", "X", "Y", "Z"), 10);
		map.put(Arrays.asList("0"), 11);
		return map;
	}
}
