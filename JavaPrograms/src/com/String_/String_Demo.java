package com.String_;

public class String_Demo {

	public static void main(String[] args) {
		String str= "java";
		String str1="programming";
		String str2 = new String("java");
		String str3 ="java";
		System.out.println(str2.hashCode());
		System.out.println(str.hashCode());
		
		String Str4=str.concat(str1);
		System.out.println(Str4);
		
//		Write a Java program to find length of a string.
		System.out.println(str3.length());
		//Compare string using == when we create without new see same reference is there
		System.out.println(str==str2);
	  //Compare string using new operator when new is present see different reference is there
		System.out.println(str.equals(str2));
	}

}
