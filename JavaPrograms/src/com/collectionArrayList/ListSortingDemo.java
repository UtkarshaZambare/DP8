package com.collectionArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ListSortingDemo {

	public static void main(String[] args) {

		ArrayList<Integer> arrInt = new ArrayList<>(Arrays.asList(7, 5, 4, 9, 2, 8));
		System.out.println("Before Sorting");
		System.out.println(arrInt);

		Collections.sort(arrInt);
		System.out.println("After Sorting");
		System.out.println(arrInt);

		ArrayList<String> arrStr = new ArrayList<>(Arrays.asList("Vina", "Sam", "Om", "Priya"));
		System.out.println("Before Sorting");
		System.out.println(arrStr);

		Collections.sort(arrStr);
		System.out.println("After Sorting");
		System.out.println(arrStr);

	}

}
