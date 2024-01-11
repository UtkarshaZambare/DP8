package com.array;

import java.util.Scanner;

public class SumOfArrayElements {

	public static void showElements(int num[]) {
		System.out.println("Array elements are...");
		for (int e : num) {
			System.out.println(e + "");
		}
	}
    public static int[] createArray() 
    {
    	int num[];
    	System.out.println("Enter the size of array=");
    	Scanner sc = new Scanner(System.in);
    	int size = sc.nextInt();
    	num=new int[size];
    	for (int i =0;i<num.length;i++) 
    	{
    		System.out.println("Plese enter the elements=");
    		num[i]=sc.nextInt();
    	}
		sc.close();
    	return num;
    }
    
    public static void printSum(int num[]) 
    {
    	int sum =0;
    	for(int i=0; i<num.length;i++) 
    	{
    		sum = sum + num[i];
    		
    	}
    	System.out.println("Sum="+sum);
    		
    }
	public static void main(String[] args) {
		int[]s = createArray();
		printSum(s);

	}

}
