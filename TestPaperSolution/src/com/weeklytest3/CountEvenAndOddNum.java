package com.weeklytest3;

public class CountEvenAndOddNum {

	public static void printEvemAndOddNumber(int arr[]) 
	{
		int even =0;
		int odd=0;
		for(int i=0; i<arr.length; i++) 
		{
			if(arr[i]%2==0) 
			{
				even++;
			}
			else if(arr[i]%2!=0)
			{
				odd++;
			}
		}
	  System.out.println("Even elements :"+even);
	  System.out.println("Odd elements :"+odd);
	  
	}
	
	
	
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6,7,8,9};
		printEvemAndOddNumber(arr);

	}

}
