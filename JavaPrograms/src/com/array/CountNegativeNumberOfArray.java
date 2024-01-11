package com.array;

import java.util.Scanner;

public class CountNegativeNumberOfArray {

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

	public static int countNegativeNumbers(int[] num) {
		int count = 0;

		for (int number : num) {
			if (number < 0) {
				count++;
			}
		}

		return count;

	}

	public static void main(String[] args) {
		int n[] = createArray();
		countNegativeNumbers(n);
		int count = countNegativeNumbers(n);

        System.out.println("The number of negative numbers in the array is: " + count);
    }

	}


