package com.array;

import java.util.Scanner;

public class EmployeeSearch {

	

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		
		Employee[] employees = new Employee[5];
		employees[0] = new Employee(1, "John", 50000);
		employees[1] = new Employee(2, "Alice", 60000);
		employees[2] = new Employee(3, "Bob", 50000);
		employees[3] = new Employee(4, "Eve", 55000);
		employees[4] = new Employee(5, "Mike", 60000);

		
		System.out.print("Enter an ID to search for employees with the same salary: ");
		int searchId = scanner.nextInt();
		boolean found = false;

		
		for (Employee employee : employees) {
			if (employee.id == searchId) {
				found = true;
				double searchSalary = employee.salary;
				System.out.println("Employees with the same salary as ID " + searchId + ":");
				for (Employee emp : employees) {
					if (emp.salary == searchSalary) {
						System.out.println("ID: " + emp.id + ", Name: " + emp.name + ", Salary: " + emp.salary);
					}
				}
				break;
			}
		}

		if (!found) {
			System.out.println("No employee found with ID " + searchId);
		}

		

	}

}
