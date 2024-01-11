package com.collectionComparableComparator;

import java.util.Comparator;

class Location  implements Comparator <Employee> {

	

	@Override
	public int compare(Employee o1, Employee o2) {
		
		return o1.dpt.location.compareTo(o2.dpt.location);
	}

}
