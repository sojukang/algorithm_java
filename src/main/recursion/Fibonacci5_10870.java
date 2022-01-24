package main.recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Fibonacci5_10870 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		System.out.println(vanillaFibonacci(N));
	}

	private static long vanillaFibonacci(int n) {
		if (n == 0) {
			return 0;
		} else if (n <= 2) {
			return 1;
		}

		return vanillaFibonacci(n - 1) + vanillaFibonacci(n - 2);
	}
}
