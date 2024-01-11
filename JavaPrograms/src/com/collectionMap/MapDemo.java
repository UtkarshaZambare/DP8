package com.collectionMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class MapDemo {

	public static void main(String[] args) {
		HashMap <Integer,String> hmp = new HashMap<>();
		hmp.put(1, "Utkarsha");
		hmp.put(2, "Snehal");
		hmp.put(3, "Rutuja");
		hmp.put(4, "Nikita");
		
		System.out.println("Map size:"+hmp.size());
		System.out.println("______________________________________________________");
        
    //	using keySet
		for(Integer h:hmp.keySet()) 
		{
			System.out.println(h +" " +hmp.get(h));
		}
		//using iterator
		System.out.println("_________________________________________________");
	    Set<Entry<Integer,String>> s= hmp.entrySet();
	    Iterator<Entry<Integer,String>> set=s.iterator();
	}

}
