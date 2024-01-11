package com.collectionTreeSet;

import java.util.Iterator;
import java.util.TreeSet;

public class EmployeeTreeSet {

	public static void main(String[] args) {

		TreeSet<Employee> set = new TreeSet<>();
		set.add(new Employee(1, "Ram", 100000));
		set.add(new Employee(2, "Snehal", 70000));
		set.add(new Employee(3, "Shubhangi", 67000));
		set.add(new Employee(4, "Abhishek", 95000));
		set.add(new Employee(5, "Yogesh", 45000));

		Iterator<Employee> itr = set.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("===================================================================");
		TreeSet<Employee> set1 = new TreeSet<>(new CompareById());
		set1.add(new Employee(1, "Ram", 100000));
		set1.add(new Employee(2, "Snehal", 70000));
		set1.add(new Employee(3, "Shubhangi", 67000));
		set1.add(new Employee(4, "Abhishek", 95000));
		set1.add(new Employee(5, "Yogesh", 45000));

		Iterator<Employee> itr1 = set1.iterator();
		while (itr1.hasNext()) {
			System.out.println(itr1.next());
		}

	}

}
