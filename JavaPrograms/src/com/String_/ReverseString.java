package com.String_;

public class ReverseString {

	public static void main(String[] args) {
		 String str = "Utkarsha";    
	        //Stores the reverse of given string    
	        String reversedStr = "";    
	            
	        //Iterate through the string from last and add each character to variable reversedStr    
	        for(int i = str.length()-1; i >= 0; i--){    
	            reversedStr = reversedStr + str.charAt(i);    
	        }    
	            
	        System.out.println("Original string: " + str);    
	        //Displays the reverse of given string    
	        System.out.println("Reverse of given string: " + reversedStr);    
	    }    
	   

	}


