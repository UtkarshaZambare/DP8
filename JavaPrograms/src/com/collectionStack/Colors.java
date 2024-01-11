package com.collectionStack;

import java.util.Iterator;
import java.util.Stack;

//WAP to create a Stack with some colors (String)  using generics
public class Colors {
	

	public static void main(String[] args) {
		
		Stack<String> color = new Stack<String>();
		 color.add("Red");
		 color.add("Pink");
		 color.add("Blue");
		 color.add("Orange");
		 color.add("Green");
		 
		 Iterator<String> itr = color.iterator();
		 while(itr.hasNext()) {
			 System.out.println(itr.next());
		 }

	}

}
