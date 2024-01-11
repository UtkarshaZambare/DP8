package com.weeklytest5;

import java.util.ArrayList;
import java.util.Iterator;

public class RemoveDuplicate {

	public static void main(String[] args) {
		ArrayList<String> alist = new ArrayList<>();
		alist.add("Sun");
		alist.add("Mon");
		alist.add("Sat");
		alist.add("Sun");
		alist.add("Mon");
		alist.add("Sat");
		alist.add("Sun");
		alist.add("Mon");

		ArrayList<String> str = new ArrayList<>();
		Iterator<String> itr = alist.iterator();
		while(itr.hasNext()) 
		{
			String ss = itr.next();
			if(!str.contains(ss))	{	
			str.add(ss);
		}
	}
		System.out.println(str);
	
	
	
	}

}
