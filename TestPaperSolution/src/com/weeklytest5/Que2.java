//WAP to convert array to arraylist and vice versa

package com.weeklytest5;

import java.util.ArrayList;
import java.util.Arrays;

public class Que2 {

	public static void main(String[] args) {
		// array to arraylist
		String[] arr = { "apple", "banana", "orange" };
		ArrayList<String> arrList = new ArrayList<>(Arrays.asList(arr));
		System.out.println("Array converted to ArrayList: " + arrList);

		// arraylist to array
		ArrayList<String> arrayList = new ArrayList<>(Arrays.asList("apple", "banana", "orange"));
		String[] array = arrayList.toArray(new String[0]);
		System.out.println("ArrayList converted to Array: " + Arrays.toString(array));
	}

}
