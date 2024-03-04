package com.learning.core.day02;

import java.util.Scanner;

public class D02P10 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter an integer: ");
		int number = scanner.nextInt();

		int reversedNumber = reverseDigits(number);

		System.out.println("reversed number : " + reversedNumber);

		scanner.close();
	}

	private static int reverseDigits(int num) {
		int reversed = 0;

		while (num != 0) {
			int digit = num % 10;
			reversed = reversed * 10 + digit;
			num /= 10;
		}

		return reversed;
	}

}
