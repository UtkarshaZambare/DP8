//WAP to print maximum in row wise in 2D array

package com.weeklytest3;

public class Quetion5 {

	public static void main(String[] args) {
		int[][] arr = { { 22, 31, 9 }, { 12, 25, 16 } };
		int max = arr[0][0];
		for (int i = 0; i < arr.length; i++) {
			for(int j=0; j<arr.length; j++) 
			{
				if(arr[i][j]==max) 
				{
					max=arr[i][j];
					
				}
				
			}
			System.out.println("maxmimum number:" + max);
			
		}
		
	}

}
