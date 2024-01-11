package com.weeklytest6;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class NumberHashMap {

	public static void main(String[] args) {

		HashMap<Integer,String> numberMap = new HashMap<>();
		 
	        numberMap.put(1, "One");
	        numberMap.put(2, "Two");
	        numberMap.put(3, "Three");
	        numberMap.put(4, "Four");
	        numberMap.put(5, "Five");
	        numberMap.put(6, "Six");
	        numberMap.put(7, "Seven");
	        numberMap.put(8, "Eight");
	        numberMap.put(9, "Nine");
	        numberMap.put(10, "Ten");
	        
	        System.out.println("origanal map "+numberMap);
	        
	        Set<Entry<Integer,String>> set = numberMap.entrySet();
	        Iterator<Entry<Integer,String>> itr = set.iterator();
	        while(itr.hasNext()) {
	        	Entry<Integer,String> etr = itr.next();
	        	
	        	if(etr.getKey()%3==0) 
	        	{
	        		itr.remove();
	        	}
	        }
		System.out.println("After removing entries"+ numberMap);
	
	}

}
