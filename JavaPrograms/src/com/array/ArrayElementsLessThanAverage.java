package com.array;

import java.util.Scanner;

public class ArrayElementsLessThanAverage {

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

	public static double getAverage(int[] num) {
		int sum = 0;
		for (int i = 0; i < num.length; i++) {
			sum = sum + num[i];
		}
		double average = sum / num.length;

		return average;

	}




	public static void main(String[] args) {
		int[] num = createArray();
        showElements(num);
        double average = getAverage(num);
        System.out.println("Average of the array elements: " + average);

	
		
		System.out.println("Array elements less than the average:");
        for (int element : num) {
            if (element < average) {
                System.out.print(element + " ");
		

	}

}
	}
}
