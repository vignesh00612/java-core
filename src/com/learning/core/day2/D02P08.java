package com.learning.core.day2;

import java.util.Scanner;

public class D02P08 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the number of elements (n): ");
		int n = scanner.nextInt();

		if (n < 0) {
			System.out.println("Invalid input. Please enter a non-negative number.");
			return;
		}

		int[] elements = new int[n];

		System.out.println("Enter the elements:");

		for (int i = 0; i < n; i++) {
			System.out.print("Element " + (i + 1) + ": ");
			elements[i] = scanner.nextInt();
		}

		System.out.print("Enter the range [L, R] where 0 <= L <= R <= n-1:\n");

		System.out.print("Enter L: ");
		int L = scanner.nextInt();

		System.out.print("Enter R: ");
		int R = scanner.nextInt();

		scanner.close();

		if (L < 0 || R < L || R >= n) {
			System.out.println("Invalid range. Please enter a valid range [L, R] where 0 <= L <= R <= n-1.");
		} else {

			int sumInRange = calculateSumInRange(elements, L, R);
			System.out.println("Sum of elements in the range [" + L + ", " + R + "]: " + sumInRange);
		}
	}

	private static int calculateSumInRange(int[] elements, int L, int R) {
		int sum = 0;

		for (int i = L; i <= R; i++) {
			sum += elements[i];
		}

		return sum;
	}

}
