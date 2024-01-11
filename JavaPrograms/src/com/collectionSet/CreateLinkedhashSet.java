package com.collectionSet;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class CreateLinkedhashSet {

	public static void main(String[] args) {
		ArrayList<String> arr = new ArrayList<>();
		arr.add("Sudarshan");
		arr.add("Ganesh");
		arr.add("Minal");
		arr.add("Sonal");
		arr.add("Komal");
		
		System.out.println("Arraylist.......");
		System.out.println(arr);
		LinkedHashSet<String>set = new LinkedHashSet<>(arr);
        System.out.println("LinkedHashSet......");
        System.out.println(set);
        
        // WAP to iterate through all elements in a LinkedHashSet and print the elements. Observe the order ofelements.
        
        Iterator<String> itr = set.iterator();
        while(itr.hasNext()) {
        	System.out.println(itr.next());
        	  }
     
        //  WAP to empty a LinkedHashSet.
       LinkedHashSet <Integer> hset = new LinkedHashSet<>();
        System.out.println(hset);
        
        
       LinkedHashSet<Integer> set1 = new LinkedHashSet<>();
		set1.add(1);
		set1.add(2);
		set1.add(3);
		set1.add(4);
		set1.add(5);
		
		System.out.print(set1);
		set1.remove(2);
		System.out.println(set1);
		
//		set1.clear();
//		System.out.println(set1);
		
		set1.isEmpty();
		System.out.println(set1.isEmpty());
		
		System.out.println("Size is :"+ set1.size());
		
		set1.removeAll(set1);
		System.out.println(set1);
		
	
		Iterator<Integer> itr1 = set1.iterator();
		while(itr1.hasNext()) 
		{
			System.out.println(itr1.next());
	}
	}
}


	
	
	
	
	
	
	
	

	


