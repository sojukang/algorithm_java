package main.bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RedrawChessPlate_1018 {
	private static List<List<String>> plateList = new ArrayList<>();
	private static int gridToFix = Integer.MAX_VALUE;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		List<Integer> integers = getIntegersBySplitter(br, " ");
		int N = integers.get(0);
		int M = integers.get(1);

		for (int i = 0; i < N; i++) {
			plateList.add(Arrays.asList(br.readLine().split("")));
		}
		for (int i = 0; i <= N - 8; i++) {
			for (int j = 0; j <= M - 8; j++) {
				gridToFix = Math.min(gridToFix, Math.min(getNoOfFix("B", i, j), getNoOfFix("W", i, j)));
			}
		}

		System.out.println(gridToFix);
	}

	private static int getNoOfFix(String startColor, int row, int col) {
		// System.out.println("startColor: " + startColor);
		int gridToFix = 0;
		for (int i = row; i < row + 8; i++) {
			for (int j = col; j < col + 8; j++) {
				if (i % 2 == 0 && j % 2 == 0 || i % 2 == 1 && j % 2 == 1) {
					if (!plateList.get(i).get(j).equals(startColor)) {
						// System.out.println(1);
						gridToFix++;
					}
				} else if (i % 2 == 0 && j % 2 == 1 || i % 2 == 1 && j % 2 == 0) {
					if (plateList.get(i).get(j).equals(startColor)) {
						// System.out.println(2);
						gridToFix++;
					}
				}
			}
		}
		return gridToFix;
	}

	public static List<Integer> getIntegersBySplitter(BufferedReader br, String splitter) throws IOException {
		List<String> strings = Arrays.asList(br.readLine().split(splitter));
		return strings.stream().map(Integer::parseInt).collect(Collectors.toList());
	}
}
