package com.array;

import java.util.Scanner;

public class ReverseArray {

	public static void showElement(int num[]) {
		System.out.println("Array elements are...");
		for (int e : num) {
			System.out.print(e + "");
		}

	}

	public static int[] createArray() {
		int num[];
		System.out.println("Enter the size of array =>");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		num = new int[size];
		for (int i = 0; i < num.length; i++) {

			System.out.println("please enter elements= ");
			num[i] = sc.nextInt();
		}

		sc.close();
		return num;

	}

	public static void printReverse(int num[]) {
		System.out.println("Array in reverse order");
		for (int i = num.length - 1; i >= 0; i--) {
			System.out.println(num[i] + "");
		}
	}

	public static void printArray(int num[]) {
		System.out.println("Array elements are");
		for (int e : num) {
			System.out.println(e + "");
		}
	}

	public static void main(String[] args) {
		int p[] = createArray();
		printArray(p);
		printReverse(p);
		printArray(p);
	}

}
