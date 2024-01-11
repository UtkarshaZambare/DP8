package com.collectionArrayList;

import java.util.ArrayList;

public class DynamicArrayList {

	public static void main(String[] args) {
		ArrayList<Integer> dynamiclist = new ArrayList<>();
		System.out.println("Initial size of array list:" + dynamiclist.size());
		
		
		dynamiclist.add(10);
        dynamiclist.add(20);
        dynamiclist.add(30);
        
        System.out.println("Size of ArrayList after adding elements: " + dynamiclist.size());
	
        dynamiclist.remove(1);
        System.out.println("Size of ArrayList after removing an element: " + dynamiclist.size());
	
        dynamiclist.add(40);
        dynamiclist.add(50);
        System.out.println("Size of ArrayList after adding more elements: " + dynamiclist.size());
	}

}
