package com._2D_Array;

public class MinArray {

	public static void minArray() 
	{
		int arr[][]= {{22, 31, 9}, {12, 5, 16}, {34, 42, 2}};
		
		for (int i = 0; i < arr.length; i++) {
			int min = arr[i][0];
			for (int j = 0; j < arr[i].length; j++) {
				if (arr[i][j] <min) {
					min = arr[i][j];
				}
			}
			System.out.println("Minimum in row " + (i + 1) + ": " + min);
		}
		
       
	}
	public static void minArrayOfColumn() 
	{
		int arr[][]= {{22, 31, 9}, {12, 5, 16}, {34, 42, 2}};
		
		for (int i = 0; i < arr.length; i++) {
			int min = arr[0][i];
			for (int j = 0; j < arr[i].length; j++) {
				if (arr[j][i] <min) {
					min = arr[j][i];
				}
			}
			System.out.println("Minimum in column "  + min);
		}
		
       
	}
	
	
	
	
	public static void main(String[] args) {
		//minArray();
		minArrayOfColumn();

	}

}
