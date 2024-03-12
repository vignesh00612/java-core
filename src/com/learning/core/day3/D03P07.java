package com.learning.core.day03;

import java.util.Scanner;

public class D03P07 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String input = scanner.nextLine();
		System.out.println("All subsequences of the string:");
		printSubsequences(input);

	}

	public static void printSubsequences(String str) {
		printSubsequencesHelper(str, "");
	}

	public static void printSubsequencesHelper(String remaining, String current) {

		if (remaining.isEmpty()) {
			if (!current.isEmpty()) {
				System.out.println(current);
			}
			return;
		}
		printSubsequencesHelper(remaining.substring(1), current + remaining.charAt(0));
		printSubsequencesHelper(remaining.substring(1), current);
	}

}
