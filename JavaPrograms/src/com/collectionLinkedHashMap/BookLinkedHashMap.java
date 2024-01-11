package com.collectionLinkedHashMap;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;

public class BookLinkedHashMap {

	public static void main(String[] args) {
		LinkedHashMap<Book,Integer> lmap = new LinkedHashMap<>();
		lmap.put(new Book(10, "Halfgirlfriend", 300), 34);
		lmap.put(new Book(12, "Wings of fire", 560), 40);
		lmap.put(new Book(13, "Basics of coding ", 490), 70);
		lmap.put(new Book(15, "Agnipankh", 760), 67);
		lmap.put(new Book(19, "Atomic habits", 890),90);
		
		Set<Entry<Book,Integer>> set = lmap.entrySet();
		Iterator<Entry<Book,Integer>> itr= set.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		itr=set.iterator();
		Collection<Integer> cls =lmap.values();
		Iterator<Integer> itr1 = cls.iterator();
		int max=0;
		Book b= null;
		while(itr.hasNext()) {
			Entry<Book,Integer> etr = itr.next();
			Book b1 = etr.getKey();
			int a= itr1.next();
			if(a>max) {
				max=a;
				b=b1;
			}
		}
		System.out.println("Maxmimum copies of "+b+ "is : "+max);
		
		System.out.println("Minimum copies-----------");
		itr = set.iterator();
		itr1 = cls.iterator();
		
		
	
	
	
	
	
	
	
	
	
	}

}
