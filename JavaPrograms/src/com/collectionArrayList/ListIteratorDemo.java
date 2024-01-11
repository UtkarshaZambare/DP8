package com.collectionArrayList;

import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorDemo {

	public static void main(String[] args) {
		
		List<Integer> l = Arrays.asList(7,5,4,9,2,8);
		ListIterator<Integer> itr =l.listIterator(l.size());
		
		while(itr.hasPrevious())
		{
			System.out.print(itr.previous()+" ");
		}


	}

}
