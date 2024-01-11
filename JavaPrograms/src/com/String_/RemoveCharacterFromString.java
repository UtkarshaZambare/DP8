package com.String_;

public class RemoveCharacterFromString {
	public static String removeFirstChar(String str, char target) {
		int index = str.indexOf(target);

		if (index != -1) {
			String before =str.substring(0, index);
			String after = str.substring(index + 1);
			return before + after;
		}

		return str; // Character not found in the string
	}

	public static void main(String[] args) {
		String str = "Hello, World!";
		char ch= 'o';
		String result = removeFirstChar(str, ch);
		System.out.println("Original String: " + str);
		System.out.println("String after removing first occurrence of '" + ch + "': " + result);

	}

}
