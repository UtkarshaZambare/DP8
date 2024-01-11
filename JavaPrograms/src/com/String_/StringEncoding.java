package com.String_;

import java.util.Arrays;

public class StringEncoding {

	public static void main(String[] args) {
		
		String str = "ABC";
		System.out.println(str);
		char ch []=str.toCharArray();
		for (int i=0;i<=ch.length-1;i++) {
			ch[i]=(char) (ch[i]+3);
		}
		System.out.println(Arrays.toString(ch));
	}

}
