package com.weeklytest1;

public class CheckNonRepeatingChar {

	public void checkNonRepeating(String str) {
		char ch[] = str.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			int count = 0;
			for (int j = i+1; j < ch.length; j++) {
				if (ch[i] == ch[j]) {
					count++;

				}
			}
			if (count == 0) {
				System.out.println("First repeating character:" + ch[i]);
				break;
			}
		}
	}

	public static void main(String[] args) {
		String str ="Peter Pan";
		CheckNonRepeatingChar obj = new CheckNonRepeatingChar();
		obj.checkNonRepeating(str);
	}

}
