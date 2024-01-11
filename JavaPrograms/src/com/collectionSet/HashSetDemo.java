package com.collectionSet;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {

	public static void main(String[] args) {
		
		ArrayList<String> arr = new ArrayList<>();
		arr.add("Blue");
		arr.add("Pink");
		arr.add("Red");
		arr.add("Orange");
		arr.add("Black");
		arr.add("Blue");
		
		System.out.println(arr);
		
		HashSet<String> set = new HashSet<>(arr);
		System.out.println("HashSet....");
		System.out.println(set);
		

		HashSet<Integer> set1 = new HashSet<>();
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
		
		
//		Iterator<Integer> itr = set1.iterator();
//		while(itr.hasNext()) 
//		{
//			System.out.println(itr.next());
//		}
	}

}
