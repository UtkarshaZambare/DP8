package com.collectionArrayList;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList<String> technology = new ArrayList<>();
		// System.out.println(technology.size());
		technology.add("Java");
		technology.add("C#");
		technology.add("MobileDevelopment Flutter");
		technology.add("Java Framework");

		System.out.println(technology);
		System.out.println(technology.size());
		technology.add(1, "SQL");

		System.out.println(technology);
		
		technology.remove(3);
		System.out.println(technology);
		
		boolean f=technology.remove("C#");
		System.out.println(f);
		System.out.println(technology);
		
		ArrayList<String> l1 = new ArrayList<String> ();
		l1.add("maths");
		l1.add("English");
		l1.add("History");
		
		technology .addAll(l1);
		System.out.println(technology);
		
		ArrayList<String> l2 = new ArrayList<String> ();
		l2.add("Bio");
		l2.add("Chemistry");
		technology.addAll(2,l2);
		System.out.println(technology);
		

	}

}
