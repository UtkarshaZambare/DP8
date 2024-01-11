package com.MasterAssignment;

import java.util.ArrayList;
import java.util.Iterator;

public class EmployeeArrayList {

	public static void main(String[] args) {

		ArrayList<Employee> arr = new ArrayList<Employee> ();
		
		arr.add(new Employee(10, "Tina"));
		arr.add(new Employee(11, "Sneha"));
		arr.add(new Employee(12, "Tanuja"));
		arr.add(new Employee(13, "Ajit"));
		arr.add(new Employee(14, "Rahul"));
		
		Iterator<Employee> itr = arr.iterator();
		while(itr.hasNext()) 
		{
			System.out.println(itr.next());
		}
		
	
	
	
	
	
	}

}
