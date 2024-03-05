package com.learning.core.day03;

import java.util.Scanner;

public class D03P13 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter a string: ");
		String inputString = scanner.nextLine();

		scanner.close();

		String resultString = replaceSpaces(inputString);

		System.out.println("String with spaces replaced: " + resultString);
	}

	private static String replaceSpaces(String str) {

		return str.replaceAll(" ", "%20");
	}

}
