package com.collectionVector;

import java.util.Enumeration;
import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		
		Vector<String> v = new Vector<>(20);
		System.out.println("Capacity: " + v.capacity());
		
		v.add("A");
		v.add("Z");
		v.add("Y");
		v.add("C");
       System.out.println("Size: "+v.size());
       Enumeration<String> eCursor = v.elements();
       
       while(eCursor.hasMoreElements())
			System.out.println(eCursor.nextElement());
		
       System.out.println(v.addAll(v)); //return boolean
		System.out.println(v);
		
		v.add(1, "d");
		System.out.println(v);

		System.out.println(v.firstElement());//
		System.out.println(v.lastElement());



	}

}
