package com.weeklytest1;

import java.util.Arrays;

public class SortStringArray {

	public static void main(String[] args) {
		String[] str = { "Utkarsha", "Suraj", "Ishwar", "Jayashree","Jay","Om" };

		for (int i = 0; i < str.length; i++) {
			String temp = "";
			for (int j = 0; j < str.length; j++) {
				if (str[i].length() < str[j].length()) {
					temp = str[i];
					str[i] = str[j];
					str[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(str));
	}

}
