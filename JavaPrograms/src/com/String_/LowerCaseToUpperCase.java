package com.String_;

public class LowerCaseToUpperCase {

	public static void main(String[] args) {
		String s1 = "utkarsha";
		// using method
		String s2 = s1.toUpperCase();

		System.out.println(s2);
		// using logic

		char ch[] = s1.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] >= 'a' && ch[i] <= 'z') {
				ch[i] = (char) (ch[i] - 32);
			}
		}
		for (char x : ch) {
			System.out.print(x);
		}

	

//upper to lower

//by using method
	String s3 = "ZAMBARE";
	String s4 = s3.toLowerCase();
	System.out.println(s4);
	
	//using logic 
	
	//convert string  to array
	char ch1[] = s3.toCharArray();
	for (int i = 0; i < ch1.length; i++) {
		if (ch1[i] >= 'A' && ch1[i] <= 'Z') {
			ch1[i] = (char) (ch1[i] + 32);
		}
	}
	for (char x : ch1) {
		System.out.print(x);
	}
	

	}

}