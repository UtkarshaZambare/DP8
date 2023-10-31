//. Create an abstract class Machine with an implemented / concrete method
//rotate and an abstract method crush. Create a class Juicer which extends this
//abstract class Machine and implements method crush. Now, add another
//method filter in the class Juicer. In main method,
//a. Create an object of type Juicer and calls its crush, rotate and filter
//methods.
//b. Create an object of type Juicer with reference variable of Machine
//(Machine m = new Juicer). Check the methods available to m.

package com.abstractinterfacedemo;

public abstract class Machine {

	public Machine() {
		
	}
	
	public void rotate() 
	{
		System.out.println("Machine is rotating");
	}
	
	public abstract void crush();

	public static void main(String[] args) {
		

	}

}
