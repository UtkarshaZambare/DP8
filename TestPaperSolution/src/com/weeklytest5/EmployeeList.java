package com.weeklytest5;

import java.util.Iterator;
import java.util.LinkedList;

public class EmployeeList {

	public static void main(String[] args) {
		
		LinkedList<Employee> empList = new LinkedList<>();
		
		Department obj1 = new Department(10, "IT");
		
        empList.add(new Employee(1, "John", obj1));
		empList.add(new Employee(2, "Jane", obj1));
		
		Department obj2 = new Department(20, "Testing");
		
		empList.add(new Employee(3, "Bob", obj2));
		empList.add(new Employee(4, "Alice", obj2));
		
		System.out.println(empList);
		
		int searchId = 10;
        Iterator<Employee> iterator = empList.iterator();
        while (iterator.hasNext()) {
            Employee employee = iterator.next();
            if (employee.getEid() == searchId) {
                // Delete all records with the same department ID
                int departmentIdToDelete = employee.d.did;
                iterator = empList.iterator(); // Reset iterator
                while (iterator.hasNext()) {
                    Employee emp = iterator.next();
                    if (emp.d.did == departmentIdToDelete) {
                        iterator.remove();
                    }
                }
                break; // Break out of the loop once the deletion is done
            }
        }

        // Print the updated employee list
        System.out.println("Updated Employee List:");
        for (Employee employee : empList) {
            System.out.println("ID: " + employee.eid + ", Name: " + employee.name + ", Department ID: " + employee.d.did);
        }
		

	}

}
