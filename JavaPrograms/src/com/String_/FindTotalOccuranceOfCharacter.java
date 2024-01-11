package com.String_;

//Write a Java program to count occurrences of a character in given string.

public class FindTotalOccuranceOfCharacter {

	public static void main(String[] args) {
		String str = "Java Programming";
		char ch[]= str.toCharArray();
		char s= 'a';
		int count=0;
		for(int i=0; i<ch.length;i++) 
		{
			if(ch[i]==s) 
			{
				count++;
			}
		}
		System.out.println("the character:"+ s + "appears:" +count);
	}

}
