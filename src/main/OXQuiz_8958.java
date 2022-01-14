package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;

public class OXQuiz_8958 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		for (int i = 0; i < N; i++) {
			List<String> list = Arrays.asList(br.readLine().split("X"));
			printScore(list);
		}
	}

	private static void printScore(List<String> list) {
		int score = list.stream().mapToInt(os -> sum(os.length())).sum();
		System.out.println(score);
	}

	private static int sum(int num) {
		return num * (num + 1) / 2;
	}
}
