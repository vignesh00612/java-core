package com.learning.core.day2;

import java.util.Scanner;

public class D02P17 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the value of n to find prime numbers up to n: ");
		int n = scanner.nextInt();

		System.out.println("Prime numbers up to " + n + ":");

		for (int i = 2; i <= n; i++) {
			if (isPrime(i)) {
				System.out.print(i + " ");
			}
		}

		scanner.close();
	}

	private static boolean isPrime(int number) {
		if (number <= 1) {
			return false;
		}

		for (int i = 2; i <= Math.sqrt(number); i++) {
			if (number % i == 0) {
				return false;
			}
		}

		return true;
	}

}
