package com.learning.core.day3;

import java.util.Scanner;

public class D03P02 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int[] numberArray = { 7, 25, 5, 19, 30 };

		System.out.print("Enter the first number range from 1 to 40: ");
		int num1 = scanner.nextInt();

		System.out.print("Enter the second number range from 1 to 40: ");
		int num2 = scanner.nextInt();

		scanner.close();

		if (isPresentInArray(num1, numberArray) && isPresentInArray(num2, numberArray)) {
			System.out.println("Bingo");
		} else {
			System.out.println("The numbers are not both present in the array.");
		}
	}

	static boolean isPresentInArray(int number, int[] array) {
		for (int element : array) {
			if (element == number) {
				return true;
			}
		}
		return false;
	}

}
