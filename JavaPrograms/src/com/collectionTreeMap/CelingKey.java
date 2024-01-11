package com.collectionTreeMap;

import java.util.Collections;
import java.util.NavigableSet;
import java.util.TreeMap;

public class CelingKey {

	public static void main(String[] args) {
//		TreeMap<Integer, String> tm = new TreeMap<>();
//		tm.put(42, "Pune");
//		tm.put(43, "Patna");
//		tm.put(8, "Paris");
//		tm.put(10, "Mumbai");
//		tm.put(98, "Surat");
//		tm.put(78, "Chennai");

		// System.out.println("Ceiling Key :"+tm.ceilingKey(100));

		// System.out.println(tm);
		// tm.clear();
		// System.out.println("After delete all value");
		// System.out.println(tm);

		// System.out.println("Floor Key :"+tm.floorKey(100));

		// System.out.println("Lower Key :"+tm.lowerKey(10));

		// System.out.println("Higher Key :"+tm.higherKey(10));

		// System.out.println("First Key :"+tm.firstKey());
		// System.out.println("Last Key :"+tm.lastKey());

//		System.out.println("Floor Entry :" +tm.floorEntry(100));
//		System.out.println("Ceiling Entry :" +tm.ceilingEntry(10));

//		System.out.println("Lower Entry :" +tm.lowerEntry(1));
//		System.out.println("HigherEntry :" +tm.higherEntry(10));

		TreeMap<Integer, String> tm1 = new TreeMap<>(Collections.reverseOrder());
		tm1.put(42, "Pune");
		tm1.put(43, "Patna");
		tm1.put(23, "Paris");
		tm1.put(10, "Mumbai");
		tm1.put(98, "Surat");
		tm1.put(78, "Chennai");

		System.out.println(tm1);
		
		NavigableSet<Integer> kset=tm1.navigableKeySet();
		for(Integer s: kset)
			if(s==98)
			System.out.println(s+" => "+tm1.get(s));



	}

}
