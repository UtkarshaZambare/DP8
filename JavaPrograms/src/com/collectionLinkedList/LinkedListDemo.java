package com.collectionLinkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList<Student> L1 = new LinkedList<>();
		L1.add(new Student(1, "Pushkar", 102));
		L1.add(new Student(2, "Ajay", 105));
		L1.add(new Student(3, "Amit", 103));
		L1.add(new Student(4, "Ram", 101));
		L1.add(new Student(5, "Pranav", 104));

		System.out.println(L1.get(3));

		L1.set(4, (new Student(1, "Minal", 102)));

//		System.out.println(l1);
//		Collections.sort( L1);
		Iterator<Student> iter = L1.iterator();
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}

	}

}
