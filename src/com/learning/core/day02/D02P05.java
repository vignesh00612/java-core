package com.learning.core.day02;
import java.util.Scanner;


public class D02P05 {

	public static void main(String[] args) {
		
		
		        Scanner scanner = new Scanner(System.in);

		      
		        System.out.print("Enter a number: ");
		        int number = scanner.nextInt();

		       
		        scanner.close();

		        
		        if (number % 5 == 0) {
		            System.out.println(number + " is divisible by 5 ");
		        } else {
		            System.out.println(number + " is not divisible by 5 ");
		        }
		    }
		

	

	}


