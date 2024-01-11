package com.array;

public class ReverseArrayInPlace {

	public static void reverseArray(int arr[]) {
	for (int i = 0; i < arr.length; i++) {
		

		int start = 0;
		int end = arr.length - 1;

		while (start < end) {
			// Swap the elements at the start and end positions
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;

			start++;
			end--;
			System.out.println(arr[i] + " ");
		}
		
	}

	}
	
	
	

	public static void main(String[] args) {
     int arr[] = {1,2,3,4,5};
     reverseArray(arr);
	}

}
