package com.learning.core.day02;

import java.util.Scanner;

public class D02P14 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the base number: ");
		double base = scanner.nextDouble();

		System.out.print("Enter the exponent power: ");
		double exponent = scanner.nextDouble();

		double result = calculatePower(base, exponent);

		System.out.println(base + " raised to the power " + exponent + " is: " + result);

		scanner.close();
	}

	private static double calculatePower(double base, double exponent) {
		return Math.pow(base, exponent);
	}

}
