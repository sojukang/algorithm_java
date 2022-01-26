package main.bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class blackjack_2798 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		List<Integer> NandM = getIntegersBySplitter(br, " ");
		List<Integer> cards = getIntegersBySplitter(br, " ");

		int M = NandM.get(1);
		int result = 0;
		int sumOfCards = 0;
		for (int i = 0; i < cards.size(); i++) {
			for (int j = i + 1; j < cards.size(); j++) {
				for (int k = j + 1; k < cards.size(); k++) {
					sumOfCards = cards.get(i) + cards.get(j) + cards.get(k);
					if (sumOfCards <= M && (M - result > M - sumOfCards)) {
						result = sumOfCards;
					}
				}
			}
		}
		System.out.println(result);
	}

	public static List<Integer> getIntegersBySplitter(BufferedReader br, String splitter) throws IOException {
		List<String> strings = Arrays.asList(br.readLine().split(splitter));
		return strings.stream().map(Integer::parseInt).collect(Collectors.toList());
	}
}
