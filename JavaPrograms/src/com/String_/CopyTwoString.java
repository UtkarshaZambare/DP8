// Write a Java program to copy one string to another string.
package com.String_;

public class CopyTwoString {

public static void main(String[] args) {
		
        String str = "Hello, World!";
        
        // Create an empty string to copy into
        String copiedStr = "";
        
        // Use a loop to copy each character from the original to the copied string
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            copiedStr= copiedStr + ch;
        }
        
        // Print the copied string
        System.out.println("Copied String: " + copiedStr);
    }
 

	}
