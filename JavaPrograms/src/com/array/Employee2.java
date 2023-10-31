package com.array;

public class Employee2 {

	int id;
	String name;
	double salary;
	Department department;

	public Employee2(int id, String name, double salary, Department department) {
		this.id = id;
		this.name = name;
		this.salary = salary;

		this.department = department;
	}

	public String toString() {
		return "id=" + id + ", name=" + name + ", salary=" + salary + "Department=" + department;
	}

	public static void main(String[] args) {

		 Employee2[] employees = new  Employee2[4];

		employees[0] = new  Employee2(1, "John", 50000, new Department(23, "Science"));
		employees[1] = new  Employee2(2, "Alice", 60000, new Department(34, "Arts"));
		employees[2] = new  Employee2(3, "Bob", 50000, new Department(89, "Commerce"));
		employees[3] = new  Employee2(4, "Eve", 55000, new Department(90, "Science"));

		for (int i = 0; i < employees.length; i++) {
			for (int j = 0; j < employees.length; j++) {
				if (j != i) {
					if (employees[i].department.compareDepartment(employees[j].department)) {
						System.out.println("Same department emp=" + employees[i]);
						break;
					}
				}
			}
		}

	}
}
