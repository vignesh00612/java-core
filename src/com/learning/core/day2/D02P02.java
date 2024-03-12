package com.learning.core.day02;

import java.util.Scanner;

public class D02P02 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter a number: ");

		int n = scanner.nextInt();

		scanner.close();

		System.out.println("Even numbers less than or equal to number n " + n + ":");
		listEvenNumbers(n);
	}

	static void listEvenNumbers(int n) {
		for (int i = 2; i <= n; i += 2) {
			System.out.print(i + " ");
		}
		System.out.println();

	}

}
