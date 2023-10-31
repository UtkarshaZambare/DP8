package com.array;

public class SumofEvenNoInArray {
	static int arr []= {1,2,3,4,5};
	
	
	SumofEvenNoInArray()
	{
		
		for(int i=0; i<arr.length; i++)
			arr[i]=i;
	}
	public int addArrayElements(int obj[]) 
	{
		int sum=0;
		for(int i : arr ) 
		{
			if(i%2==0)
			sum=sum+i;
			
	}
		return sum;
	}
	
	public static void main(String[] args) {
		SumofEvenNoInArray obj = new SumofEvenNoInArray();
		int res=obj.addArrayElements(arr);
		System.out.println(res);
		
		

		
	}

}
