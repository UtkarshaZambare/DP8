package com.collectionComparableComparator;

import java.util.Comparator;

public class BySalary implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return Double.compare(o1.getSalary(), o2.getSalary());
	}


	

}
