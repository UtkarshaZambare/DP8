package com.overridemethod;

public class Employee extends Programmer {

	public Employee() {
		// TODO Auto-generated constructor stub
	}
	
	 public void workingHours() {
	        System.out.println("An employee typically works 9 hours a day.");
	    }
	

	
	    public static void main(String[] args) {
	        Programmer programmer = new Programmer();
	        Employee employee = new Employee();

	        System.out.println("Programmer's Working Hours:");
	        programmer.workingHours();

	        System.out.println("\nEmployee's Working Hours:");
	        employee.workingHours();
	    }
}

	






	
