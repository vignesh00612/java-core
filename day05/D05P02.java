package com.learning.day05;

import java.util.ArrayList;
import java.util.Scanner;

public class D05P02 {
	public static void main(String[] args) {

		ArrayList<String> studentList = new ArrayList<>();

		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the list of student names separated by space: ");
		String inputNames = scanner.nextLine();

		String[] namesArray = inputNames.split("\\s+");

		for (String name : namesArray) {
			studentList.add(name);
		}

		System.out.print("Enter the name to search: ");
		String searchName = scanner.nextLine();

		if (studentList.contains(searchName)) {
			System.out.println("Found");
		} else {
			System.out.println("Not Found");
		}

		scanner.close();
	}
}
