package main.recursion;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Hanoi_11729 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		List<String> result = hanoi(N, 1, 2, 3);
		System.out.println(result.size());
		printListByLine(result);
	}

	private static List<String> hanoi(int N, int start, int middle, int end) {
		if (N == 1) {
			return Arrays.asList(start + " " + end);
		}
		List<String> list = new ArrayList<>(hanoi(N - 1, start, end, middle));
		list.addAll(hanoi(1, start, middle, end));
		list.addAll(hanoi(N - 1, middle, start, end));

		return list;
	}

	private static void printListByLine(List<String> strings) throws IOException {
		// strings.forEach(System.out::println);
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		for (String string : strings) {
			bufferedPrint(bw, string);
		}
		bw.flush();
		bw.close();
	}

	private static void bufferedPrint(BufferedWriter bw, String string) throws IOException {
		bw.write(string);
		bw.newLine();
	}
}
