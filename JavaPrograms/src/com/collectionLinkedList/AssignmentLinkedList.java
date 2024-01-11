package com.collectionLinkedList;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;


public class AssignmentLinkedList {

	public static void main(String[] args) {
//	WAP to append the specified element to the end of a linked list
      LinkedList <Integer> list = new LinkedList<>(Arrays.asList(1,2,3,4,5,6));
     list.addLast(7);
     System.out.println(list);
	
  //WAP to iterate through all elements in a linked list.
	 Iterator <Integer>itr =list.iterator();
	 while(itr.hasNext()) 
	 {
		 System.out.println(itr.next());
	 }
	 	
	// WAP to iterate a linked list in reverse order.
//	System.out.println("________________________________");
//	Iterator<Integer> list1 = list.descendingIterator();
//	while(list1.hasNext()) 
//	{
//		System.out.println(list1.next());
		
//		WAP to insert the specified element at the specified position in the linked list.
		 LinkedList <Integer> l = new LinkedList<>(Arrays.asList(1,2,3,4,1,6,1,5));
//		l.add(6, 9);
//		System.out.println(l);
//		
//		l.addFirst(10);
//		l.addLast(11);
		System.out.println(l);
//	 WAP to get the first and last occurrence of the specified elements in a linked list.	
//		int a=l.indexOf(1);
//	     int b=l.lastIndexOf(1);
//		System.out.println(a);
//		System.out.println(b);
		int firstO=0;
		int lastO=0;
		int count=0;
		for(int i=0; i<l.size();i++) 
		{
			if(l.get(i)==1)
			{
			count++;
			if(count==1)
				firstO=i;
			if(count>1)
				lastO=i;
			
		}
		}
		System.out.println(firstO);
		System.out.println(lastO);                              
		
		// shuffle list
		System.out.println("List before shuffling"+l);
		System.out.println("___________________________________________");
		Collections.shuffle(l);
		System.out.println("List before shuffling"+l);
	
		// add two list
		 LinkedList<String> list1 = new LinkedList<>();
	        list1.add("Element1");
	        list1.add("Element2");
	        list1.add("Element3");
	    
	     LinkedList<String> list2 = new LinkedList<>();
	        list2.add("Element4");
	        list2.add("Element5");
	        
	        list1.addAll(list2);
	       System.out.println(list1);
	}
	}


