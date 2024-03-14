package com.learning.core.day2;

import java.util.Scanner;

public class D02P13 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter a number to calculate its factorial: ");
		int number = scanner.nextInt();

		long factorial = calculateFactorial(number);

		System.out.println("Factorial of " + number + " is: " + factorial);

		scanner.close();
	}

	private static long calculateFactorial(int n) {
		if (n < 0) {
			System.out.println("Factorial is not defined");
			return -1;
		}

		long result = 1;
		for (int i = 1; i <= n; i++) {
			result *= i;
		}

		return result;
	}

}
