package main.InputOutputArray;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Max_2562 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int max = Integer.MIN_VALUE;
		int idx = 0;
		int num;
		for (int i = 1; i <= 9; i++) {
			num = Integer.parseInt(br.readLine());
			if (num > max) {
				max = num;
				idx = i;
			}
		}
		System.out.print(max + "\n" + idx);
	}
}
