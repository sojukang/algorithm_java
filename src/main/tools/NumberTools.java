package main.tools;

public class NumberTools {
	private static boolean validIntContains(int num, int NoToFind) {
		if (Integer.toString(num).contains(Integer.toString(NoToFind))) {
			return true;
		}
		return false;
	}
}
