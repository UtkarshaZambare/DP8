package com.collectionMap;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

//WAP to search for an element from HashMap using key
public class SearchElement {

	public static void main(String[] args) {

		HashMap<String, Integer> hmap = new HashMap<>();

		hmap.put("A", 1);
		hmap.put("B", 2);
		hmap.put("C", 3);

		Integer value = 3;
		for (Entry<String, Integer> entry : hmap.entrySet()) {
			if (entry.getValue() == value) {
				System.out.println("The key for value " + value + " is " + entry.getKey());
				break;

			}

		}
//7.WAP to test if a HashMap contains a mapping for the specified value	
		System.out.println(hmap.containsValue(3));
	    Set<String> st =hmap.keySet();
	    for(String ss : st) {
	      if(ss.equals(3)) {
	        System.out.println("Value is : "+hmap.get(ss));
	      
	      
	      
	      }
	    }
		
	
	}

}
