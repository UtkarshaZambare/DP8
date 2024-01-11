package com.collectionTreeSet;

import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		
		TreeSet<String> tset = new TreeSet<>();
		tset.add("Utkarsha");
		tset.add("Sanika");
		tset.add("Rutuja");
		tset.add("Neha");
		tset.add("Shreya");
		
		System.out.println(tset);
		
		System.out.println("Ceiling: "+tset.ceiling("Pp"));// nearest upper value
		
		System.out.println("Flooring: "+tset.floor("Pp")); // nearest lower value
		
		System.out.println("First: "+tset.first());   // give 1st element
		
		System.out.println("Higher: "+tset.higher("Sima")); // give higher string
		
		System.out.println(tset.pollFirst()); // it will give first and remove it
		System.out.println(tset);
		
		System.out.println(tset.pollLast()); //  it will give last and remove i
		System.out.println(tset);
		
		
	}

}
