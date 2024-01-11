package com.logicaLProgram;

public class ArrayInreverseOrder {
	
	
	public void creationOfArray() 
	{
		int arr[] = {1,2,3,4,5,6};
		System.out.println("original array");
		for(int i =0; i<arr.length; i++) 
		{
			System.out.println(arr[i]);
		}
		this.reverseArray(arr);
	}
	
	public void reverseArray(int obj[]) 
	{
		for(int i=obj.length-1; i>=0; i--) { 
	
			System.out.println(obj[i]);
		}
	}

	public static void main(String[] args) {
		ArrayInreverseOrder a= new  ArrayInreverseOrder();
		a.creationOfArray();
		

	}

}
