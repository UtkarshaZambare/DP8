package com.array;
//by using while loop
public class ArrayDemo2 {
	public void arrayCreation() 
	{
		int arr[]= new int[5];
		arr[0]=1;
		arr[1]=2;
		arr[2]=3;
		arr[3]=4;
		arr[4]=5;
		this.showArrayElement(arr);
		int arr1[]= {10,20,30,40,50};
		this.showArrayElement(arr1);
		
	}
	public void showArrayElement(int obj[]) 
	{
		 int i =0;
		while(i<obj.length)
			System.out.println(obj[i]);
		    System.out.println("*********");
			
	}

	public static void main(String[] args) {
		ArrayDemo obj = new ArrayDemo();
		obj.arrayCreation();
		

	}

}


	
