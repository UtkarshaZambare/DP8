package com.testpaper2;

import java.util.PriorityQueue;

public class studentQueue {

	public static void main(String[] args) {
		PriorityQueue<Que21Student> studentQueue = new PriorityQueue<>();

        // Add students to the queue
        studentQueue.add(new Que21Student(1, "Alice", 85));
        studentQueue.add(new Que21Student(2, "Bob", 90));
        studentQueue.add(new Que21Student(3, "alice", 85));
        
        while(!studentQueue.isEmpty()) {
        	 Que21Student servedStudent = studentQueue.poll();
        	 System.out.println(servedStudent);
        	
        }

	}

}
