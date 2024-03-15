package com.learning.core.day10;
import java.io.*;

public class D10P05 {


    public static void main(String[] args) {
        // Accept input string from user
        String input = "Hello, world!";
        
        // Write the input string to the file in.txt
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("in.txt"))) {
            writer.write(input);
            System.out.println("Input string written to the file.");
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
        
        // Show size of the file
        File file = new File("in.txt");
        long fileSize = file.length();
        System.out.println("Size of the file: " + fileSize + " bytes");
        
        // Read contents from the file and display them on console
        try (BufferedReader reader = new BufferedReader(new FileReader("in.txt"))) {
            String line;
            System.out.println("Contents of the file:");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error reading from file: " + e.getMessage());
        }
        
        // Delete the file io.txt using File class
        boolean deleted = file.delete();
        if (deleted) {
            System.out.println("File deleted successfully.");
        } else {
            System.out.println("Error deleting file.");
        }
    }
}



