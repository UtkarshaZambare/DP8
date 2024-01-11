package com.String_;
//Write a Java program to find first occurrence of a character in a 
//given string.
public class FirstOccurenceOfCharacter {

	public static void main(String[] args) {
		String str = "bananana";
		char ch[] = str.toCharArray();	
		char s = 'a';
		for(int i=0; i<ch.length;i++) 
		{
			if(ch[i]==s) 
			{
				System.out.println(i);
				break;
			}
		}
       int count=0;
       for(int i=0; i<ch.length; i++) 
       {
    	   if(ch[i]==s) 
    	   {
    		   count++;
    	   }
       }
       System.out.println("Count is : "+count);
	}

}
