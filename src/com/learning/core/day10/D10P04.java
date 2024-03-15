package com.learning.core.day10;

import java.io.IOException;
import java.nio.file.*;

public class D10P04 {

	public static void main(String[] args) {

		// Define source and target paths

		Path sourcePath = Paths.get("E:\\for.txt");

		Path targetPath = Paths.get("E:\\tar.txt");

		// Copy the file with REPLACE_EXISTING option

		try {

			Files.copy(sourcePath, targetPath, StandardCopyOption.REPLACE_EXISTING);

			System.out.println("File copied successfully!");

		} catch (IOException e) {

			System.err.println("Error occurred while copying file: " + e.getMessage());

		}

	}

}
