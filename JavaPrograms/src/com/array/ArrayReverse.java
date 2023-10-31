package com.array;

public class ArrayReverse {

	public void arrayCreation() {
		int arr[] = { 1, 2, 3, 4, 5 };
		System.out.println("Orignal array");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		this.reverseArray(arr);
	}

	public void reverseArray(int obj[]) {
		System.out.println("Array in reverse order");
		for (int i = obj.length - 1; i >= 0; i--) {
			System.out.println(obj[i]);
		}
	}

	public static void main(String[] args) {
		ArrayReverse obj = new ArrayReverse();
		obj.arrayCreation();
//		obj.reverseArray(obj);

	}

}
