package com.logicaLProgram;

import java.util.Scanner;

public class SeperateEvenAndOddDigit {
	 public static void countEvenOddNumbers(long number) {
	        int evenCount = 0;
	        int oddCount = 0;

	        for (long i = 0; i <= number; i++) {
	            if (i % 2 == 0) {
	                System.out.print(i + " ");
	                evenCount++;
	            } else {
	                oddCount++;
	            }
	        }

	        System.out.println("\nNumber of even numbers: " + evenCount);
	        System.out.println("Number of odd numbers: " + oddCount);
	    }
	
       public static void main(String[] args) {
	        // Create a Scanner object to take input from the user
	        Scanner scanner = new Scanner(System.in);

	        // Prompt the user to enter a number
	        System.out.print("Enter a number: ");
	        long number = scanner.nextLong();

	        // Close the scanner to avoid resource leak
	        scanner.close();

	        // Count and display even and odd numbers
	        countEvenOddNumbers(number);
	    }

} 