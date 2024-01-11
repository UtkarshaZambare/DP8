package com.collectionArrayList;
//Create arraylist of 10 integers. Insert an element at 7th position.
import java.util.ArrayList;
import java.util.Arrays;

public class InsertElementInArrayList {

	public static void main(String[] args) {
	ArrayList<Integer> arrInt = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
    System.out.println(arrInt);
    System.out.println("__________________________________");
	arrInt.add(7,49);
	System.out.println(arrInt);
	}

}
