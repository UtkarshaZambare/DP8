package com._2D_Array;

public class MaxInArray {

	public static void maxElementOfRow() {
		int arr[][] = { { 22, 31, 9 }, { 12, 25, 16 } };

		for (int i = 0; i < arr.length; i++) {
			int max = arr[i][0];
			for (int j = 0; j < arr[i].length; j++) {
				if (arr[i][j] > max) {
					max = arr[i][j];
				}
			}
			System.out.println("Maximum in row " + (i + 1) + ": " + max);
		}
		
       
	}
	public static void maxnArrayOfColumn() 
	{
		int arr[][]= {{22, 31, 9}, {12, 5, 16}, {34, 42, 2}};
		
		for (int i = 0; i < arr.length; i++) {
			int max = arr[0][i];
			for (int j = 0; j < arr[i].length; j++) {
				if (arr[j][i] >max) {
					max = arr[j][i];
				}
			}
			System.out.println("Minimum in column "  + max);
		}
		
       
	}
	

	public static void main(String[] args) {
		//maxElementOfRow();
		maxnArrayOfColumn();

	}

}
