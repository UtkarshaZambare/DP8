package com.collectionMap;

import java.util.HashMap;
//   WAP to copy all of the mappings from the specified HashMap to another map

public class CopyMap {

	public static void main(String[] args) {
		
		HashMap <String,Integer> hmap = new HashMap<>();
		
		hmap.put("A", 1);
        hmap.put("B", 2);
        hmap.put("C", 3);
      
        HashMap <String,Integer> hmap2 = new HashMap<>(hmap);
        System.out.println(hmap2);
	}
}