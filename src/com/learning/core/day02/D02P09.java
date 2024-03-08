package com.learning.core.day02;
import java.util.Scanner;

public class D02P09 {

	public static void main(String[] args) {
		

		        Scanner scanner = new Scanner(System.in);
		        System.out.print("Enter an integer: ");
		        int n = scanner.nextInt();
		        
		        System.out.println("Cube of numbers upto giver integer " + n + ":");
		        for (int i = 1; i <= n; i++) {
		            int cube = i * i * i;
		            System.out.println("Cube of " + i + " = " + cube);
		        }
		        scanner.close();
		    }
		


	}


