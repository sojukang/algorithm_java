package main.bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FilmDirectorShom_1436 {
	private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws IOException {
		int N = Integer.parseInt(br.readLine());
		int cnt = 0;
		int num = 666;
		while (cnt < N) {
			if (validNo(num)) {
				cnt++;
			}
			num++;
		}
		System.out.println(num - 1);
	}

	private static boolean validNo(int num) {
		if (Integer.toString(num).contains("666")) {
			return true;
		}
		return false;
	}
}
