package com.array;

import java.util.Arrays;

public class MergeArray {

	public static void merge(int num1[],int num2[]) 
	{
		int a=num1.length;
		int b=num2.length;
		int arr[]=new int[num1.length + num2.length];
		 for(int i= 0;i<a; i++) 
		 {
			 arr[i]= num1[i];
		 }
		 for(int i=0; i<b; i++) 
		 {
			 
			 arr[a+i]=num2[i];
		 }
		
		System.out.println("The merge array is:" +Arrays.toString(arr));
		
	}
	
	
	public static void main(String[] args) {
		int num1[]= {10,20,30,40};
		int num2[]= {40,20,50,60};
		merge(num1, num2); 
		
		

	}

}
