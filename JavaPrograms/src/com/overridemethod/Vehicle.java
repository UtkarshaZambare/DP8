//3)WAP to create class Vehicle with methods accelerate(long mph) with long type parameter ,
//stop(),run() all method return string type of value. Create class car which extends 
//Vehicle implement accelerate(long mph)differently in car class.

package com.overridemethod;

public class Vehicle {

	long mph;

	public Vehicle() {

	}

	public Vehicle(long mph) {
		this.mph = mph;
	}
	
	public void  accelerate(long mph) 
	{
		this.mph = mph;
		
	}
	 public void Compare() 
	 {
		 if (mph==0) 
		 {
			 System.out.println("Stop");
		 }
		 else {
			 System.out.println("Run");
		 }
	 
	 }
	

	public String Stop() {
		return "Stop";
	}
	
	public String Run() 
	{
		return "Run";
		
	}

	@Override
	public String toString() {
		return "Vehicle [mph=" + mph + "]";
	}

	public static void main(String[] args) {
		Vehicle obj = new Vehicle();
		obj.accelerate(200);
		System.out.println(obj);
		obj.Compare();

	}

}
