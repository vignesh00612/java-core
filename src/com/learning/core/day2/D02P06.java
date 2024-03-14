package com.learning.core.day2;

import java.util.Scanner;

public class D02P06 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter a number representing a day of the week: ");
		int dayNumber = scanner.nextInt();

		scanner.close();

		if (dayNumber >= 1 && dayNumber <= 7) {
			String weekday = getWeekday(dayNumber);
			System.out.println("The weekday corresponding to " + dayNumber + " is: " + weekday);
		} else {
			System.out.println("Invalid input. Please enter a number between 1 and 7.");
		}
	}

	private static String getWeekday(int dayNumber) {
		switch (dayNumber) {
		case 1:
			return "Monday";
		case 2:
			return "Tuesday";
		case 3:
			return "Wednesday";
		case 4:
			return "Thursday";
		case 5:
			return "Friday";
		case 6:
			return "Saturday";
		case 7:
			return "Sunday";
		default:
			return "Invalid day number";
		}
	}

}
