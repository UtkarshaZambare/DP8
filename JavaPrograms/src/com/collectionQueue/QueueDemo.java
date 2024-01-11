package com.collectionQueue;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo {

	public static void main(String[] args) {
		
		Queue<Integer> qu = new PriorityQueue<Integer>();
		
		qu.add(10);
		qu.add(24);
		qu.add(9);
		qu.add(30);
		
		System.out.println(qu);
		
		System.out.println("Used of poll:" +qu.poll());
		System.out.println(qu);
		System.out.println("Remove element" +qu.remove());
		System.out.println(qu);
		
		Iterator<Integer>itr = qu.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println("Offer"+qu.offer(45));
		System.out.println(qu);

		
		
		
		
		
		
		
		
		
		
	}

}
