package com.learning.core.day02;
import java.util.Scanner;

public class D02P01 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter a number between 1 and 12: ");

		int monthNumber = scanner.nextInt();

		scanner.close();

		if (monthNumber >= 1 && monthNumber <= 12) {

			String monthName = getMonthNameSwitch(monthNumber);

			System.out.println("The month corresponding to " + monthNumber + " is: " + monthName);
		} else {
			System.out.println("Invalid input. Please enter a number between 1 and 12.");
		}
	}

	private static String getMonthNameSwitch(int monthNumber) {
		switch (monthNumber) {
		case 1:
			return "January";
		case 2:
			return "February";
		case 3:
			return "March";
		case 4:
			return "April";
		case 5:
			return "May";
		case 6:
			return "June";
		case 7:
			return "July";
		case 8:
			return "August";
		case 9:
			return "September";
		case 10:
			return "October";
		case 11:
			return "November";
		case 12:
			return "December";
		default:
			return "Invalid month";
		}
	}

}
