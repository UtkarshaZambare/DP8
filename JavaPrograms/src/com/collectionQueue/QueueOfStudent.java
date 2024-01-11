package com.collectionQueue;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueOfStudent {

	public static void main(String[] args) {
		
		Queue<Student> std = new PriorityQueue<Student>();
		
		std.add(new Student(104, "Snehal"));
		std.add(new Student(105, "Adarsh"));
		std.add(new Student(103, "Ganesh"));
		std.add(new Student(102, "Amit"));
		std.add(new Student(101, "Suraj"));
		
		std.add(new Student(101, "Snehal"));
		
		Iterator<Student>itr = std.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	   System.out.println("----------------------------------------------------");
	   Student s;
	   while((s=std.poll())!=null) {
		   System.out.println(s);
	   }
		   
		   
		   
		   
		   
		   
		   
		   

	}

}
