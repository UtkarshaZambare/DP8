package com.logicaLProgram;

import java.util.Arrays;

public class SecondHeighest {

	public static void main(String[] args) {
		
int[] array = {12, 5, 8, 9, 15, 7, 6};
        
        // Sort the array in descending order
//        Arrays.sort(array);
//        
//        // The second largest element is at index length - 2
//        int secondLargest = array[array.length - 2];
//
//        System.out.println("Second Largest Element: " + secondLargest);
        
        int sum =0;
        for(int num : array) 
        {
        	int count=0;
        	if(num%2==0) {
        		sum = sum+num;
        		count++;
        		
        	}
        	
        }
        System.out.println(sum);
}
}