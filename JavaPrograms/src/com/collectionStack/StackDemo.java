package com.collectionStack;

import java.util.Iterator;
import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		
		Stack<Integer> st = new Stack<Integer>();
		st.push(20);
		st.push(56);
		st.push(43);
		st.push(32);
		st.push(29);
		
		System.out.println(st);
		System.out.println("using iterator");
		
		Iterator<Integer> itr = st.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("Peek:"+st.peek());
		System.out.println("Pop:"+st.pop());
		System.out.println(st);
		
		while(!st.empty()) {
			System.out.println(st.pop());
		}
	System.out.println("Check is empty:"+ st.isEmpty());
	
	// Without using generics
	
	
//	System.out.println("Without using generics");
//	Stack num = new Stack();
//	num.add(10);
//	num.add(20);
//	num.add(30);
//	num.add(40);
//	
//	System.out.println(num);
	
	
	
	}

}
