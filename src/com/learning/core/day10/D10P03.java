package com.learning.core.day10;

import java.io.*;

import java.io.FileInputStream;

import java.io.IOException;

import java.io.ObjectInputStream;

public class D10P03 {

	public static void main(String[] args) {

		try {

			FileInputStream fileInputStream = new FileInputStream("E:\sec.txt");

			ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

			while (true) {

				try {

					Student student = (Student) objectInputStream.readObject();

					System.out.println("Roll Number: " + student.getRollNumber());

					System.out.println("Name: " + student.getName());

					System.out.println("Age: " + student.getAge());

					System.out.println("Address: " + student.getAddress());

					System.out.println("-----------------------");

				} catch (ClassNotFoundException e) {

					e.printStackTrace();

				} catch (IOException e) {

					break; // End of file

				}

			}

			objectInputStream.close();

			fileInputStream.close();

		} catch (IOException e) {

			e.printStackTrace();

		}

	}

}
