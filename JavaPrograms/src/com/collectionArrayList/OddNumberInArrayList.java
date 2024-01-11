package com.collectionArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class OddNumberInArrayList {

	public static void main(String[] args) {
//	
//		ArrayList<Integer> OddNumber = new ArrayList<>();
//		
//		int num = 1;
//		
//		while(num<=100);
//		OddNumber.add(num);
//		num=num+2;
//		
//		System.out.println("Odd Numbers in ArrayList: " + num);
//
//		
//		Iterator<Integer> itr=OddNumber.iterator();
//		while(itr.hasNext())
//		{
//			
//			System.out.print(itr.next()+" ");
//			
//		}
//	}
//
//}
		
		ArrayList<Integer> oddNumbersList = new ArrayList<>();

        // Add the first 50 odd numbers to the ArrayList using a while loop
        int i = 0; // Starting from the first odd number
        while (oddNumbersList.size() < 50) {
            oddNumbersList.add(i);
            i += 2; // Move to the next odd number
        }

        // Print the ArrayList
        System.out.println("Odd Numbers in ArrayList:");
        for (Integer number : oddNumbersList) {
            System.out.print(number + " ");
        }
    }
}
