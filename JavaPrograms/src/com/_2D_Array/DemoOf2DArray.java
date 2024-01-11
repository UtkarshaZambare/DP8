package com._2D_Array;

import java.util.Scanner;

public class DemoOf2DArray {

//	public void createArray() {
//		int arr[][] = new int[3][3];
//
//		arr[0][0] = 1;
//		arr[0][1] = 2;
//		arr[0][2] = 3;
//
//		arr[1][0] = 4;
//		arr[1][1] = 5;
//		arr[1][2] = 6;
//
//		arr[2][0] = 7;
//		arr[2][1] = 8;
//		arr[2][2] = 9;
//		printArray(arr);
//
//	}

	public void createArrayFromUser() {
		int arr[][];
		System.out.println("Please enter the size of rows");
		Scanner sc = new Scanner(System.in);
		int rows = sc.nextInt();
		arr = new int[rows][];
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter the size of " + (i + 1) + " column");
			int col = sc.nextInt();
			arr[i] = new int[col];
			for (int j = 0; j < arr[i].length; j++) {
				System.out.println("Enter the element ");
				int ele = sc.nextInt();
				arr[i][j] = ele;
				
			}
			
		}
		sc.close();
		printArray(arr);

	}

	public void printArray(int p[][]) {
        //	iterating rows
		for (int i = 0; i < p.length; i++) {
			// iterating column
			for (int j = 0; j < p[i].length; j++) {
				System.out.print(p[i][j] + "\t");
			}
			System.out.println();
		}

	}

	public static void main(String[] args) {
		DemoOf2DArray obj = new DemoOf2DArray();
//		obj.createArray();
		obj.createArrayFromUser();
	}

}
