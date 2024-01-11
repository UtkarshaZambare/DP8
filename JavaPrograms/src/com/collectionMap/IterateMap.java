package com.collectionMap;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;

import java.util.Map;
import java.util.Set;

// WAP to get all the entries from a HashMap. Iterate the entries and print the Key & Value values
public class IterateMap {

	public static void main(String[] args) {

		HashMap<Integer, String> hmap = new HashMap<>();

		hmap.put(1, "Utkarsha");
		hmap.put(2, "Snehal");
		hmap.put(3, "Bhakti");
		hmap.put(4, "Neha");

		Set<Map.Entry<Integer, String>> entrySet = hmap.entrySet();

//		for (Map.Entry<Integer, String> entry : entrySet) {
//			Integer key = entry.getKey();
//			String value = entry.getValue();
//			System.out.println("Key: " + key + ", Value: " + value);
//		
		//  WAP to get only the Keys from a HashMap
			for(Integer s: hmap.keySet()) 
			{
				System.out.println(s);
			}
		//	 WAP to get only the values from a HashMap
			Collection<String>str = hmap.values();
			
			for(String s: str) 
			{
				System.out.println(s);
			}
		}

	}
