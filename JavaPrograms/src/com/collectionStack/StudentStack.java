package com.collectionStack;

import java.util.Iterator;
import java.util.Stack;

public class StudentStack {

	public static void main(String[] args) {
		
		Stack<Student> std = new Stack<Student>();
		std.add(new Student(101, "Pooja"));
		std.add(new Student(107, "Ram"));
		std.add(new Student(103, "Sanu"));
		std.add(new Student(105, "Gita"));
		std.add(new Student(102, "Pinu"));
		
		std.add(new Student(103, "Sanu"));
		
		Iterator<Student> itr = std.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
       System.out.println("peek:"+ std.peek());
	}

}
