package com.learning.core.day2;

import java.util.Scanner;

public class D02P12 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the number of rows for the reverse pyramid: ");
		int rows = scanner.nextInt();

		System.out.println("Reverse Pyramid Star Pattern:");

		for (int i = rows; i >= 1; i--) {

			for (int j = rows - i; j > 0; j--) {
				System.out.print(" ");
			}

			for (int k = 1; k <= i * 2 - 1; k++) {
				System.out.print("*");
			}

			System.out.println();
		}

		scanner.close();
	}

}
