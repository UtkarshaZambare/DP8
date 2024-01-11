package com.collectionSet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class CretaeHashSetFromArrayList {

	public static void main(String[] args) {
	//  WAP to create a HashSet from an ArrayList	
		ArrayList<String> arr = new ArrayList<>();
		arr.add("Sudarshan");
		arr.add("Ganesh");
		arr.add("Minal");
		arr.add("Sonal");
		arr.add("Komal");
		
		System.out.println("Arraylist.......");
		System.out.println(arr);
		HashSet<String>set = new HashSet<>(arr);
        System.out.println("Hash set......");
        System.out.println(set);
        
        // WAP to iterate through all elements in a HashSet and print the elements. Observe the order ofelements.
        
        Iterator<String> itr = set.iterator();
        while(itr.hasNext()) {
        	System.out.println(itr.next());
        	  }
     
        //  WAP to empty a HashSet.
        HashSet <Integer> hset = new HashSet<>();
        System.out.println(hset);
        
        
        System.out.println("Convert into array");
        String[]str = new String[set.size()];
        set.toArray(str);
        System.out.println(Arrays.toString(str));
        
        System.out.println("2nd way......");
        Object[] str1 = set.toArray();
        System.out.println(Arrays.toString(str1));
	
	
	
	
	
	
	
	
}

}
