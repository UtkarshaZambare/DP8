package com.String_;

public class FirstOccurenceOfWord {
	
	public static void main(String[]args) {
		 String str = "She is as beautiful as godess";
	        String targetWord = "as";

	        int index = str.indexOf(targetWord);

	        if (index != 0) {
	            System.out.println("The first occurrence of the word '" + targetWord + "' starts at index " + index);
	        } else {
	            System.out.println("The word '" + targetWord + "' was not found in the string.");
	        }
	    }
	
}
