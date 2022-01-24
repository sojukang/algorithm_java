package main.recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Factorial_10872 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		Long beforeTime = System.currentTimeMillis();
		int vanillaResult = vanillaFactorial(N);
		long afterTime = System.currentTimeMillis();
		long timeDiff = afterTime - beforeTime;
		System.out.println(vanillaResult);
		System.out.println(timeDiff);

		beforeTime = System.currentTimeMillis();
		int tabulationResult = tabulationFactorial(N);
		afterTime = System.currentTimeMillis();
		timeDiff = afterTime - beforeTime;
		System.out.println(tabulationResult);
		System.out.println(timeDiff);
	}

	private static int vanillaFactorial(int n) {
		if (n < 2) {
			return 1;
		}
		return n * vanillaFactorial(n - 1);
	}

	private static int tabulationFactorial(int n) {
		if (n < 2) {
			return 1;
		}

		int result = 1;
		for (int i = 1; i <= n; i++) {
			result *= i;
		}
		return result;
	}
}
