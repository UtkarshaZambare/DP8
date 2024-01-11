package com.String_;

import java.util.Arrays;

public class StringConcat {

	public static void main(String[] args) {
		String s1 = "Utkarsha";
		String s2 = "Zambare";
		String s3 = s1.concat(s2);
		System.out.println(s3);

		char[] ch = s1.toCharArray();
		char[] ch1 = s2.toCharArray();
		char[] ch3 = new char[ch.length + ch1.length];

		int a = 0;
		int cnt = 0;

		for (int i = 0; i < ch3.length; i++) {
			if (i <= ch.length - 1) {
				ch3[i] = ch[i];
			} else if (i >= ch.length) {
				ch3[i]=ch1[cnt];
				cnt++;
				System.out.println(Arrays.toString(ch3));

			}
		}

	}

}
