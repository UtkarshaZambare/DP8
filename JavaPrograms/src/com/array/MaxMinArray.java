package com.array;

public class MaxMinArray {

	public int max(int arr[]) {
		int max = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		return max;

	}

	public int min(int arr[]) {
		int min = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];

			}
		}
		return min;

	}

	public static void main(String[] args) {
		int[] myArray = { 23, 92, 56, 39, 93 };
		MaxMinArray m = new MaxMinArray();
		System.out.println("Maximum value in the array is::" + m.max(myArray));
		System.out.println("Minimum value in the array is::" + m.min(myArray));

	}

}
