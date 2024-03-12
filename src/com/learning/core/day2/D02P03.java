package com.learning.core.day02;

import java.util.Scanner;

public class D02P03 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the first number: ");
		double num1 = scanner.nextDouble();

		System.out.print("Enter the second number: ");
		double num2 = scanner.nextDouble();

		System.out.print("Enter a mathematical operator (+, -, *, /): ");
		char operator = scanner.next().charAt(0);

		scanner.close();

		double result = calculateResult(num1, num2, operator);
		System.out.println("Result: " + result);
	}

	static double calculateResult(double num1, double num2, char operator) {
		switch (operator) {
		case '+':
			return num1 + num2;
		case '-':
			return num1 - num2;
		case '*':
			return num1 * num2;
		case '/':
			if (num2 != 0) {
				return num1 / num2;
			} else {
				System.out.println("Cannot divide by zero.");
				return -1;
			}
		default:
			System.out.println("Invalid operator.");
			return -1;

		
		}
	}


}
