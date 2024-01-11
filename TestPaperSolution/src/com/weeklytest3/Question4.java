package com.weeklytest3;

public class Question4 {

	public static void array() {
		int arr[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 } };
		for (int i = 0; i < arr.length; i++) {
			for (int j = arr[i].length - 1; j >= 0; j--) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println(); // Print a newline after each row
		}
	}

	public static void main(String[] args) {
		array();

	}

}
