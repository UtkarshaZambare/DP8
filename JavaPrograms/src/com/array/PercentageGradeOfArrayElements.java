package com.array;

import java.util.Scanner;

public class PercentageGradeOfArrayElements {

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

	public static int  getTotal(int num[]) {
		int total = 0;
		for (int i = 0; i < num.length; i++) {
			total = total + num[i];
		}
		int ave = total / num.length;
		return total / num.length;

	}

	public static void getPercentGread(int percent) {
		if(percent>90)
			System.out.println("gread A");
		else if(percent>80)
			System.out.println("gread B");
		else if(percent>70)
			System.out.println("gread C");
		else if(percent>60)
			System.out.println("gread D");
		

	}

	public static void main(String[] args) {
		int k[]=createArray();
		System.out.println("Percent" + getTotal(k));
		int perc = getTotal(k);
		getPercentGread(perc);

	}

}
