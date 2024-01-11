package com.collectionLinkedHashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;

public class LinkedHashMapDemo {

	public static void main(String[] args) {
//
//		LinkedHashMap<Integer, String> lmap = new LinkedHashMap<>();
//		lmap.put(5, "A");
//		lmap.put(1, "B");
//		lmap.put(2, "C");
//	
//		System.out.println(lmap);

		HashMap<Integer, String> map = new HashMap<>();
		map.put(5, "Red");
		map.put(10, "Blue");
		map.put(21, "Pink");

		LinkedHashMap<Integer, String> lmap = new LinkedHashMap<>(map);
		lmap.put(15, "Sky Blue");
		lmap.put(1, "Green");

		System.out.println(lmap);
		Set<Entry<Integer, String>> set = lmap.entrySet();
		Iterator<Entry<Integer, String>> itr = set.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
//       lmap.clear();
//       System.out.println(lmap.isEmpty());
       lmap.remove(15);
       System.out.println(lmap);
	
	
	Set<Integer> s = lmap.keySet();
	Iterator<Integer> itr1= s.iterator();
	int max=0;
	while(itr1.hasNext()) {
		int a = itr1.next();
		if(a>max)
		max=a;
	}
	System.out.println("highest key is:" +max+ " "+lmap.get(max));
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
