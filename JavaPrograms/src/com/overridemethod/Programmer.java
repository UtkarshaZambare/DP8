//WAP to create class Programmer with Method workingHours().create class Employee which extends 
//Programmer implement workingHours()differently in child.

package com.overridemethod;

public class Programmer {

	public Programmer() {

	}
	
	public void workingHours() 
	{
		System.out.println("programmer working 8 hrs in a day");
	}
	
	

	public static void main(String[] args) {
		Programmer obj = new Programmer();
		obj.workingHours();
	}

}
