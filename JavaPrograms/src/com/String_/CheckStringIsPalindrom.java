package com.String_;

public class CheckStringIsPalindrom {
	 public static boolean isPalindrome(String str) {
//	        // Remove spaces and convert to lowercase for case-insensitive comparison
        str = str.replaceAll("\\s", "").toLowerCase();
	        
	        // Reverse the string
	        StringBuilder reversed = new StringBuilder(str).reverse();
	        
	        // Compare the original string with the reversed string
	        return str.equals(reversed.toString());
	    }

	    public static void main(String[] args) {
	        String input = "A man a plan a canal Panama"; // Change this to your input string

	        if (isPalindrome(input)) {
	            System.out.println("The string is a palindrome.");
	        } else {
	            System.out.println("The string is not a palindrome.");
	        }
	    }
}