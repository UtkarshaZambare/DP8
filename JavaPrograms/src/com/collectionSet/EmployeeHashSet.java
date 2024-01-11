package com.collectionSet;

import java.util.HashSet;
import java.util.Iterator;

public class EmployeeHashSet {

	public static void main(String[] args) {
		
		HashSet<Employee> hset = new HashSet<>();
		 hset.add(new Employee(1, "Ram", 100000));
		 hset.add(new Employee(2, "Snehal", 70000));
		 hset.add(new Employee(3, "Shubhangi", 67000));
		 hset.add(new Employee(4, "Abhishek", 95000));
		 hset.add(new Employee(5, "Yogesh", 45000));
		 
		 Iterator<Employee> itr = hset.iterator();
		 while(itr.hasNext()) {
			 System.out.println(itr.next());
		 }
	 System.out.println("After adding same object");
	 hset.add(new Employee(1, "Ram", 100000));
	 for(Employee e: hset) 
	 {
		 System.out.println(e);
	 }
	
	
	
	
	
	}

}
