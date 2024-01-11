//WAP to find all pairs of elements in an 
//integer array whose sum is equal to a given number
package com.weeklytest3;

public class SumofGivenNumber {

	public static void main(String[] args) {
		int arr[]= {4,6,5,-10,8,5,20};
		int sum =0;
		for(int i=0; i<arr.length; i++) 
		{
			for(int j=0; j<arr.length; j++) 
			{
				sum= arr[i]+arr[j];
				if(arr[i]+arr[j]==10) 
				{
					System.out.println(arr[i]+" + "+arr[j]+ " = " + sum);
				} 
			}
			
			
		}

	}

}
