package com.general;

public class NumberSmallestDigits {

	public static void main(String[] arg0) {
		findTheSmallest(100);
	}

	public static void findTheSmallest(int n) {

		if (n < 10) {
			System.out.println("The smallest number is: " + n + 10);
			return;
		}

		int index = 0;
		int[] result = new int[10];

		for (int i = 9; i > 1; i--) {

			while (n % i == 0) {
				n = n / i;
				result[index] = i;
				index++;
			}
		}

		if (n > 10) {
			System.out.println("Not possible");
			return;
		}

		
		String resultStr = "";
		for (int i = index - 1; i >= 0; i--) {
			resultStr += result[i];
		}
		
		System.out.println("The result is: " + resultStr);

	}
}
