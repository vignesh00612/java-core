package com.learning.core.day10;

import java.io.*;
import java.util.Scanner;

class Student implements Serializable {

	private int rollNumber;

	private String name;

	private int age;

	private String address;

	public Student(int rollNumber, String name, int age, String address) {

		this.rollNumber = rollNumber;

		this.name = name;

		this.age = age;

		this.address = address;

	}

	// Getters and setters

	public int getRollNumber() {

		return rollNumber;

	}

	public void setRollNumber(int rollNumber) {

		this.rollNumber = rollNumber;

	}

	public String getName() {

		return name;

	}

	public void setName(String name) {

		this.name = name;

	}

	public int getAge() {

		return age;

	}

	public void setAge(int age) {

		this.age = age;

	}

	public String getAddress() {

		return address;

	}

	public void setAddress(String address) {

		this.address = address;

	}

}

class CustomException extends Exception {

	public CustomException(String message) {

		super(message);

	}

}

public class D10P02 {

	public static void main(String[] args) {

		try {

			Scanner scanner = new Scanner(System.in);

			System.out.println("Enter Roll Number:");

			int rollNumber = Integer.parseInt(scanner.nextLine());

			System.out.println("Enter Name:");

			String name = scanner.nextLine();

			System.out.println("Enter Age:");

			int age = Integer.parseInt(scanner.nextLine());

			System.out.println("Enter Address:");

			String address = scanner.nextLine();

			if (rollNumber == 0 || name.isEmpty() || age == 0 || address.isEmpty()) {

				throw new CustomException("None of the fields should be blank");

			}

			Student student = new Student(rollNumber, name, age, address);

			System.out.println("Do you want to write data to file? (yes/no)");

			String answer = scanner.nextLine();

			if (answer.equalsIgnoreCase("yes")) {

				writeToFile(student);

			} else {

				System.out.println("Program terminated.");

			}

		} catch (NumberFormatException e) {

			System.out.println("Age and Roll Number should be numeric.");

		} catch (CustomException e) {

			System.out.println(e.getMessage());

		} catch (IOException e) {

			e.printStackTrace();

		}

	}

	private static void writeToFile(Student student) throws IOException {

		FileOutputStream fileOutputStream = new FileOutputStream("E:\sec.txt");

		ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

		objectOutputStream.writeObject(student);

		objectOutputStream.close();

		fileOutputStream.close();

		System.out.println("Data written to file successfully.");

	}

}
