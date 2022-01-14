package main.InputOutputArray;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Remains_3052 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int iteration = 10;
		int divisor = 42;
		int result = noOfRemains(iteration, divisor, br);

		System.out.println(result);
	}

	private static int noOfRemains(int iteration, int divisor, BufferedReader br) throws IOException {
		int numToDivide;
		int remain;
		HashSet<Integer> set = new HashSet<>();
		for (int i = 0; i < 10; i++) {
			numToDivide = Integer.parseInt(br.readLine());
			remain = numToDivide % 42;
			set.add(remain);
		}

		return set.size();
	}
}
