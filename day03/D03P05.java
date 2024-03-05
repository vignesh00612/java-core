package com.learning.core.day03;

import java.util.Scanner;

public class D03P05 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the size of the array: ");
		int n = scanner.nextInt();

		int[] arr = new int[n];

		System.out.println("Enter the elements of the array:");

		for (int i = 0; i < n; i++) {
			System.out.print("Element " + (i + 1) + ": ");
			arr[i] = scanner.nextInt();
		}

		System.out.print("Enter the value of k: ");
		int k = scanner.nextInt();

		scanner.close();

		findCombinations(arr, k);
	}

	private static void findCombinations(int[] arr, int k) {
		int n = arr.length;

		if (k <= 0 || k > n) {
			System.out.println("Invalid value of k.");
			return;
		}

		int[] combination = new int[k];

		for (int i = 0; i < k; i++) {
			combination[i] = i;
		}

		while (combination[0] <= n - k) {

			for (int index : combination) {
				System.out.print(arr[index] + " ");
			}
			System.out.println();

			int i = k - 1;
			while (i >= 0 && combination[i] == n - k + i) {
				i--;
			}

			if (i >= 0) {
				combination[i]++;
				for (int j = i + 1; j < k; j++) {
					combination[j] = combination[j - 1] + 1;
				}
			} else {
				break;
			}
		}
	}

}
