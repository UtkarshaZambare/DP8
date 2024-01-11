package com.collectionMap;

import java.util.HashMap;
//WAP to add elements to a HashMap without using generics (ie do not use <>) and print content of it. Use Integer as Key and String as 
public class MapDemo2 {

	public static void main(String[] args) {
		HashMap map= new HashMap();
		map.put(1, "Rima");
		map.put(2, "Sima");
		map.put(3, "Nima");
		
		System.out.println(map);

	}

}
