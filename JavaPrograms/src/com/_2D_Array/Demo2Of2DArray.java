package com._2D_Array;

public class Demo2Of2DArray {

	public static void printArray() {
		
		int arr[][] = {{10,20,30},{40,50,60},{70,80,90}};
		for(int i =0; i<arr.length; i++) 
		{
			for(int j= 0; j<arr[i].length; j++) 
			
				System.out.print(arr[i][j]+"\t");
				System.out.println();
			
		}
		
	}
	
	
	public static void main(String[] args) {
		printArray();

	}

}
