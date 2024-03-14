package com.learning.core.day2;

import java.util.Scanner;

public class D02P04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the first number: ");
		int num1 = sc.nextInt();
		System.out.print("Enter the second number: ");
		int num2 = sc.nextInt();
		System.out.print("Enter the third number: ");
		int num3 = sc.nextInt();

		int max;
		if (num1 >= num2 && num1 >= num3) {
			max = num1;
		} else if (num2 >= num1 && num2 >= num3) {
			max = num2;
		} else {
			max = num3;
		}
		System.out.println("The maximum among three number is: " + max);
	}
}
