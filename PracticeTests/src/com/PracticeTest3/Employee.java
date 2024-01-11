package com.PracticeTest3;

public class Employee extends Member {

	String specialization;

	public Employee(String name, int age, long phoneNumber, String address, double salary, String department) {
		super(name, age, phoneNumber, address, salary);
		this.specialization = department;
	}

	@Override
	public String toString() {
		return super.toString()+ "Employee [department=" + specialization + "]";
	}
	
	public static void main(String[] args) {
		

	}

	

}
