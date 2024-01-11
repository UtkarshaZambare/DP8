package com.collectionMap;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class FrequencyOfWord {

	public static void main(String[] args) {
		
		String str = "Java is a Object Oriented Language and also it is a robost Language ";
		
		HashMap<String,Integer> map = new HashMap<>();
		
		String[]words =str.split(" ");
		
		System.out.println(Arrays.toString(words));
		
		System.out.println("-------------------------------");
		
		for(String s: words) {
			
			if(map.containsKey(s)) {
				int a = map.get(s);
				map.put(s, a=a+1);
				}
			else {
				
				map.put(s, 1);
			}
		}

		Set<String> set = map.keySet();
	    Iterator<String> itr= set.iterator();
	    while(itr.hasNext()) {
	    	String c = itr.next();
	    	System.out.print(c+" ");
	    	System.out.println(map.get(c));
	    	System.out.println("__________________________");
	    }
		
		
		
		
		
		
		
		
		
		
		
	}

}
