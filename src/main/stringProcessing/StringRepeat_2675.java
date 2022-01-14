package main.stringProcessing;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;

public class StringRepeat_2675 {
	private static final int INDEX_REPEAT_COUNT = 0;
	private static final int INDEX_STRING_START = 2;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());

		for (int i = 0; i < N; i++) {
			printRepeatedString(br);
		}
	}

	private static void printRepeatedString(BufferedReader br) throws IOException {
		List<String> strings = Arrays.asList(br.readLine().split(""));
		int repeatCount = Integer.parseInt(strings.get(INDEX_REPEAT_COUNT));
		for (int i = INDEX_STRING_START; i < strings.size(); i++) {
			System.out.print(strings.get(i).repeat(repeatCount));
		}
		System.out.println();
	}
}
