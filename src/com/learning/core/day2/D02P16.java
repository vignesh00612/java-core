package com.learning.core.day02;
import java.util.Scanner;



public class D02P16 {

	public static void main(String[] args) {
		

		        Scanner scanner = new Scanner(System.in);

		        System.out.print("Enter the value of n to find the n-th Fibonacci number: ");
		        int n = scanner.nextInt();

		        if (n < 0) {
		            System.out.println("Please enter a non-negative integer.");
		        } else {
		            long result = calculateFibonacci(n);
		            System.out.println("The " + n + "-th Fibonacci number is: " + result);
		        }

		        scanner.close();
		    }

		   
		    private static long calculateFibonacci(int n) {
		        if (n == 0) {
		            return 0;
		        } else if (n == 1) {
		            return 1;
		        } else {
		            return calculateFibonacci(n - 1) + calculateFibonacci(n - 2);
		        }
		    }
		



		
	}


