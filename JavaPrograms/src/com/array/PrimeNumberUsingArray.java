package com.array;

import java.util.Scanner;

public class PrimeNumberUsingArray {

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

	public static void isPrime(int[] num) {
		for (int i = 0; i <= num.length-1; i++) {
			boolean isPrime = true;
			for (int j = 2; j < num[i]; j++) {

				if (num[i] % j == 0) {
					isPrime = false;
					break;
				}
			}
			if (isPrime) {
				System.out.println(num[i] + " are the prime numbers in the array ");
			}
		}

	}

	public static void main(String[] args) {
      int[] p = createArray();
      isPrime(p);
	}

}
