package com.collectionTreeSet;

import java.util.HashSet;
import java.util.TreeSet;

public class TreeSetFromHashSet2 {
//     WAP to create a TreeSet from a HashSet.
	
	
	public static void main(String[] args) {
		 
		HashSet<Integer> set = new HashSet<>();
		set.add(101);
		set.add(102);
		set.add(103);
		set.add(104);
		set.add(105);
		
		System.out.println("HashSet......");
		System.out.println(set);
		TreeSet<Integer> tset = new TreeSet<>(set);
		System.out.println("TreeSet.......");
		System.out.println(tset);

	}

}
