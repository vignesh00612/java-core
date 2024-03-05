package com.learning.core.day03;

import java.util.Scanner;

public class D03P01 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter a string: ");
		String inputString = scanner.nextLine();

		scanner.close();

		int length = inputString.length();
		System.out.println("Length of the string: " + length);

		String uppercaseString = inputString.toUpperCase();
		System.out.println("Uppercase string: " + uppercaseString);

		if (isPalindrome(inputString)) {
			System.out.println("string is a palindrome ");
		} else {
			System.out.println("string is not a palindrome ");
		}
	}

	static boolean isPalindrome(String str) {
		str = str.replaceAll("\\s", "").toLowerCase();
		int length = str.length();

		for (int i = 0; i < length / 2; i++) {
			if (str.charAt(i) != str.charAt(length - 1 - i)) {
				return false;
			}
		}
		return true;
	}

}
