package com.array;

public class DemoEnhance {

	int arr[];

	DemoEnhance() {
		arr = new int[5];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i;
		}
	}

	DemoEnhance(int abc[]) {
		arr = abc;
	}

	public int addArray() {
		int sum = 0;
		for (int i : arr)
			sum = sum + i;
		return sum;

	}
	

	public static void main(String[] args) {

	}

}
