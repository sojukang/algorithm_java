package main.tools;

import java.util.HashMap;
import java.util.List;

public class hashTools {
	public static int sumIfKeyContainsInput(HashMap<List<String>, Integer> map, List<String> objects) {
		return objects.stream()
			.mapToInt(str -> map.keySet().stream().filter(list -> list.contains(str)).mapToInt(map::get).sum())
			.sum();
	}
}
