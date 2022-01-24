package main.tools;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.List;

public class Output {
	private static void printIntegerListByLine(List<Integer> integers) {
		integers.forEach(System.out::println);
	}
	private static void printStringListByLine(List<String> strings) { strings.forEach(System.out::println);
	}

	private static void printListByLine(List<String> strings) throws IOException {
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
