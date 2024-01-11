package com.array;

import java.util.Scanner;

public class EvenNumberOfArray {
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

	public static void getEvenNumber(int[] num) {
		for (int i = 0; i < num.length; i++) {
			if (num[i] % 2 == 0) {
				System.out.print("Even numbr=" + num[i]);

			}

		}

	}

	public static void getOddNumber(int[] num) {
		for (int i = 0; i < num.length; i++) {
			if (num[i] % 2 != 0) {
				System.out.print("odd numbr=" + num[i]);
			}
		}
	}

	public static void main(String[] args) {
		int[] p = createArray();
		getEvenNumber(p);
		getOddNumber(p);

	}

}
