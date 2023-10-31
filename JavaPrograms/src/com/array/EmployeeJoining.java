//WAP to print the employees from Employee[] array who has same joining date.
//You have Employee class which has 4 attributes id, name, salary, date 
//(date is another object which has 3 attributes day, month, year) and add 
//employee objects to your array
package com.array;

import java.util.Scanner;

public class EmployeeJoining {

	int id;
	String name;
	double salary;
	DateOfJoining joinDate;
	Department department;

	public EmployeeJoining(int id, String name, double salary, DateOfJoining joinDate,Department department) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.joinDate = joinDate;
		this.department = department;
	}

	public String toString() {
		return "id=" + id + ", name=" + name + ", salary=" + salary + ", joinDate=" + joinDate;
	}

	public static void main(String[] args) {

		EmployeeJoining[] employees = new EmployeeJoining[4];

		employees[0] = new EmployeeJoining(1, "John", 50000, new DateOfJoining(12, 3, 2020),new Department(23,"Science"));
		employees[1] = new EmployeeJoining(2, "Alice", 60000, new DateOfJoining(8, 7, 2020),new Department(23,"Science"));
		employees[2] = new EmployeeJoining(3, "Bob", 50000, new DateOfJoining(12, 3, 2020),new Department(23,"Science"));
		employees[3] = new EmployeeJoining(4, "Eve", 55000, new DateOfJoining(12, 3, 2020),new Department(23,"Science"));

		for (int i = 0; i < employees.length; i++) {
			for (int j = 0; j < employees.length; j++) {
				if (j != i) {
					if (employees[i].joinDate.compareDate(employees[j].joinDate)) {
						System.out.println("Same joinDate emp=" + employees[i]);
						break;
					}
				}
			}
		}

	}
}
