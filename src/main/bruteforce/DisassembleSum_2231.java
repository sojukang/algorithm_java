package main.bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.stream.IntStream;

public class DisassembleSum_2231 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());

		int result = 0;
		for (int i = 0; i < N; i++) {

			int sum = intToStringList(i).sum();
			if (sum + i == N) {
				result = i;
				break;
			}
		}
		System.out.println(result);
	}

	private static IntStream intToStringList(int i) {
		return Arrays.asList(Integer.toString(i).split("")).stream().mapToInt(Integer::parseInt);
	}
}
