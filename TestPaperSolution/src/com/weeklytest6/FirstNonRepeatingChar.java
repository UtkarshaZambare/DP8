package com.weeklytest6;

public class FirstNonRepeatingChar {

	public static void main(String[] args) {
		String str = "Vector is thread safe";
		char[] ch = str.toCharArray();

		for (int i = 0; i < ch.length; i++) {
			int count = 0;
			for (int j = i + 1; j < ch.length - 1; j++) {
				if (ch[i] == ch[j]) {
					count++;
				}
			}
			if (count == 0)
				System.out.println(ch[i]);
			    break;

		}
	}

}
