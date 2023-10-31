package com.constructor;

public class MethodOverloading {
	public void add(int i,int j) 
	{
		System.out.println("Addition(int,int)is"+(i+j));
	}
	public void add(double i,double j) 
	{
		System.out.println("Addition(double,double)is"+(i+j));
	}
	public void add(float i,float j) 
	{
		System.out.println("Addition(float,float)is"+(i+j));
	}
	

	
	public static void main(String[] args) {
		MethodOverloading obj = new MethodOverloading();
		obj.add(10, 20);
		obj.add(20.8,30.9);
		

	}

}
