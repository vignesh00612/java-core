package com.learning.core.day02;
import java.util.Scanner;

public class D02P04 {
	

	    public static void main(String[] args) {
	        
	        Scanner scanner = new Scanner(System.in);

	       
	        System.out.print("Enter the first number: ");
	        int num1 = scanner.nextInt();

	        System.out.print("Enter the second number: ");
	        int num2 = scanner.nextInt();

	        System.out.print("Enter the third number: ");
	        int num3 = scanner.nextInt();

	        
	        scanner.close();

	      
	        int max = findMax(num1, num2, num3);
	        System.out.println("The maximum number among " + num1 + ", " + num2 + ", and " + num3 + " is: " + max);
	    }

	     static int findMax(int a, int b, int c) {
	        int max = a;

	        if (b > max) {
	            max = b;
	        }

	        if (c > max) {
	            max = c;
	        }

	        return max;
	    }
	}



