package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class MaxAndMin_10818 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String N = br.readLine();
		int[] inputs = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		// System.out.println("inputs = " + Arrays.toString(inputs));
		System.out.println(Arrays.stream(inputs).min().getAsInt());
		System.out.println(Arrays.stream(inputs).max().getAsInt());
	}
}
