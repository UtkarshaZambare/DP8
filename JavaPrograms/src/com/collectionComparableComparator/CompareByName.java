package com.collectionComparableComparator;

import java.util.Comparator;

class CompareByName implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		if(o1.ename==o2.ename)
		return o1.salary.compareTo (o2.salary);
		else
			return o1.ename.compareTo(o2.ename);
	}

}
