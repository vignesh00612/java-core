package com.learning.core.day3;

import java.util.Scanner;

public class D03P06 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter a string: ");
		String inputString = scanner.nextLine();

		System.out.print("Enter the value of n: ");
		int n = scanner.nextInt();

		scanner.close();

		int vowelCount = countLastNVowels(inputString, n);

		if (vowelCount >= 0) {
			System.out.println("Count of last " + n + " vowels: " + vowelCount);
		} else {
			System.out.println("Mismatch in Vowel count ");
		}
	}

	private static int countLastNVowels(String str, int n) {
		int count = 0;
		int length = str.length();

		for (int i = length - 1; i >= 0 && n > 0; i--) {
			char ch = Character.toLowerCase(str.charAt(i));

			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				count++;
				n--;
			}
		}

		return n == 0 ? count : -1;
	}

}
