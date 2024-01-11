package com.PracticeTest3;

public class Manager extends Member {
	
	 String department;

	public Manager(String name, int age, long phoneNumber, String address, double salary, String department){
		super(name, age, phoneNumber, address, salary);
		this.department= department;
	}

	@Override
	public String toString() {
		return super.toString()+"Manager [department=" + department + "]";
	}

	public static void main(String[] args) {
		 Employee employee = new Employee("Utkarsha", 24, 90226678, "Pune", 45000, "Human Resources");
	        employee.printSalary();

	        // Creating an instance of Manager
	        Manager manager = new Manager("Jane Smith", 30,90435465, "456 Oak St", 80000,"SoftwareDevelopment" );

	        // Printing details using toString method
	        System.out.println("Employee Details:\n" + employee.toString());
	        System.out.println("\nManager Details:\n" + manager.toString());

	}

}
