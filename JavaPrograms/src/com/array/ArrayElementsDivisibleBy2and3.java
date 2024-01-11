package com.array;

import java.util.Scanner;

public class ArrayElementsDivisibleBy2and3 {

	public static void showElements(int num[]) {
		System.out.println("Array elements are...");
		for (int e : num) {
			System.out.println(e + "");
		}
	}

	public static int[] createArray() {
		int num[];
		System.out.println("Enter the size of array=");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		num = new int[size];
		for (int i = 0; i < num.length; i++) {
			System.out.println("Plese enter the elements=");
			num[i] = sc.nextInt();
		}
		sc.close();
		return num;
	}

	public static void numDivisibleBy(int[] num) {
		for (int i = 0; i < num.length; i++) {
			if (num[i] % 2 == 0 && num[i] % 3 == 0) {
				System.out.println(num[i]);

			}
		}

	}

	public static void main(String[] args) {
		int[] arr = createArray();
		numDivisibleBy(arr);
	}

}
