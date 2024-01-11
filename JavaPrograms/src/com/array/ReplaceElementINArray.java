package com.array;

public class ReplaceElementINArray {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };
		int pos = 2;
		int val = 10;
		int newArrayLength = arr.length + 1;
		int[] newArray = new int[newArrayLength];
		// step1
		for (int i = 0; i < pos; i++) {
			newArray[i] = arr[i];
		}
		// step2 assign value to that index
		newArray[pos] = val;

		// step3
		for (int i = pos; i < arr.length; i++) {
			newArray[i + 1] = arr[i];
		}

		// print the updated array
		for (int i = 0; i < newArray.length; i++) {
			System.out.print(newArray[i] + "");
		}
	}

}
