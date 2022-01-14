package main.InputOutputArray;

import java.util.Arrays;
import java.util.Scanner;

public class AplusB_1000 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] input = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		int sum = Arrays.stream(input).sum();
		System.out.print(sum);
	}
}
