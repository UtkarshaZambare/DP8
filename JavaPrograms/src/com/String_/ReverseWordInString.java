package com.String_;

public class ReverseWordInString {

	public static void main(String[] args) {
//		String str = "This is java session";
//		System.out.println(str);
//
//		String[] str1 = str.split("");
//		String output = "";
//
//		for (int i = 0; i < str.length(); i++) {
//			for (int k = str1[i].length() - 1; k >= 0; k--) {
//			}
//		 output+= ' ';
//		}
//      System.out.println(output);
//	}
//
//}
String input = "Hello World Java Program";

// Split the input string into words based on whitespace
String[] words = input.split("\\s+");

// Create a new string to store the reversed words
String reversedString = "";

// Iterate through the words in reverse order and concatenate them
for (int i = words.length - 1; i >= 0; i--) {
    reversedString += words[i];
    if (i > 0) {
        reversedString += " "; // Add a space between words
    }
}

System.out.println("Original String: " + input);
System.out.println("Reversed String: " + reversedString);
}
}


