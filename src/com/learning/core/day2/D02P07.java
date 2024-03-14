package com.learning.core.day2;

import java.util.Scanner;

public class D02P07 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter marks obtained: ");
		int percentage = scanner.nextInt();

		scanner.close();

		if (percentage >= 0 && percentage <= 100) {
			char grade = getGrade(percentage);
			System.out.println("Grade based on marks " + percentage + ": " + grade);
		} else {
			System.out.println("Invalid input. Please enter marks between 0 and 100.");
		}
	}

	private static char getGrade(int percentage) {
		if (percentage >= 60) {
			return 'A';

		} else if (percentage >= 45) {
			return 'B';
		} else if (percentage >= 35) {
			return 'C';
		}

		else {
			return 'F';
		}
	}

}
