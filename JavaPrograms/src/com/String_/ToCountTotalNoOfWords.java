// Write a Java program to count total number of words in a string.

package com.String_;

public class ToCountTotalNoOfWords {

	public static void main(String[] args) {
		 String name = " My name is utkarsha ";
		    int count = 0;
		        name=name.trim();
		    for (int i = 0; i < name.length(); i++) {
		      if (name.charAt(i) == ' ') {
		        count++;
		      }
		    }
		    
		    System.out.println("total no of words in a given string id =" + (count+1));

		  }
		}
