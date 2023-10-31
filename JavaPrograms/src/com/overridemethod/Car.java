package com.overridemethod;

public class Car extends Vehicle {

	public Car() {
		
	}
	
	public void accelerate(long mph) 
	{
		super.accelerate(200);
		
	}

	public static void main(String[] args) {
		Vehicle obj = new Car();
		obj.accelerate(100);
		System.out.println(obj);

	}

}
