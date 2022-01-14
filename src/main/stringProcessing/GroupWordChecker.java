package main.stringProcessing;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GroupWordChecker {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int result = 0;
		for (int i = 0; i < N; i++) {
			if (validGroupWord(br)) {
				result++;
			}
		}
		System.out.println(result);
	}

	private static boolean validGroupWord(BufferedReader br) throws IOException {
		String input = br.readLine();
		if (input.isEmpty()) {
			return false;
		} else if (input.length() == 1) {
			return true;
		}

		List<String> list = Arrays.asList(input.split(""));
		List<String> groupChrList = new ArrayList<>();
		for (int i = 0; i < list.size(); i++) {
			if (groupChrList.contains(list.get(i))) {
				return false;
			}
			if (i + 1 < list.size() && list.get(i).equals(list.get(i + 1))) {
				continue;
			}
			groupChrList.add(list.get(i));
		}
		return true;
	}
}
