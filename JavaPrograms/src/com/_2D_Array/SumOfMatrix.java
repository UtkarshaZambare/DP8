package com._2D_Array;

import java.util.Scanner;

public class SumOfMatrix {

	public  static int [][] createArrayFromUser() {
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
		return arr;
		

	}

	public static void printArray(int p[][]) {
		// iterating rows
		for (int i = 0; i < p.length; i++) {
			// iterating column
			for (int j = 0; j < p[i].length; j++) {
				System.out.print(p[i][j] + "\t");
			}
			System.out.println();
		}

	}

//	public static void sumOfMatrixElements() {
//		int a[][] = { { 1, 2, 3 }, { 4, 5, 6, } };
//		int b[][] = { { 4, 5, 3 }, { 1, 2, 3, } };
//
//		int c[][] = new int[2][3];
//		for (int i = 0; i < 2; i++) {
//			for (int j = 0; j < 3; j++) {
//				c[i][j] = a[i][j] + b[i][j];
//				System.out.print(c[i][j]+" ");
//
//			}
//			System.out.println();
//		}
//	}
	
	public static void sumOfRowsOfMatrix(int num[][]) 
	{
		
		for(int i=0; i<num.length; i++) 
		{
			int sum=0;
			for(int j=0; j<num.length; j++) 
			{
				sum=sum+num[i][j];
            }
            System.out.println("The addition of "+(i+1)+" row is : "+sum);
		}
		
		
	}

	public static void main(String[] args) {
		
				int arr [][];
		 		arr=createArrayFromUser();
		 		sumOfRowsOfMatrix(arr);
		

	}

}
