package com.collectionMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapDemoCustomKey {

	public static void main(String[] args) {
		Map<Apple,Integer> applemap= new HashMap<>();
		Apple a1= new Apple(200, "Simla Apple");
		System.out.println(a1.hashCode());
		applemap.put(a1, 400);
		
		Apple a2= new Apple(150, "Washington Apple");
		System.out.println(a2.hashCode());
		applemap.put(a2, 450);
		
		Apple a3= new Apple(350, "Green Apple");
		System.out.println(a3.hashCode());
		applemap.put(a3, 100);
		
		
		
		Set<Entry<Apple,Integer>> set= applemap.entrySet();
		Iterator<Entry<Apple,Integer>>itr= set.iterator();
		
		while(itr.hasNext()) 
		{
			Entry<Apple,Integer> obj= itr.next();
			System.out.println("key:"+ obj.getKey());
			System.out.println("Value: "+obj.getValue());

		}
		Apple a4=new Apple(150,"Smila Apple");
		System.out.println(a4.hashCode());
		System.out.println(applemap.get(a4));

	}
	

}
