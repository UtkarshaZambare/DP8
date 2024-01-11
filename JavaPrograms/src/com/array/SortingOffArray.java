package com.array;

import java.util.Arrays;

public class SortingOffArray {

//	public static void sortArray(int[] arr) {
//		for (int i = 0; i < arr.length ; i++) {
//			for (int j = i+1; j < arr.length ; j++) {
//				int temp=0;
//				if (arr[i] > arr[j]) {
//                temp=arr[i];
//                arr[i]=arr[j];
//                arr[j]=temp;
//                
//				}
//				
//			}
//			System.out.println(arr[i]);
//		}
//		
//	}
//	public static void sortArray(int[] arr) {
//		for (int i = 0; i < arr.length ; i++) {
//			for (int j = i+1; j < arr.length ; j++) {
//				int temp=0;
//				if (arr[i] < arr[j]) {
//                temp=arr[i];
//                arr[i]=arr[j];
//                arr[j]=temp;
//                
//				}
//				
//			}
//			System.out.println(arr[i]);
//		}
//		
//	}
	public static void sortArray(int[] arr) {
	for (int i = 0; i < arr.length ; i++) {
		for (int j = 0; j < arr.length-1-i ; j++) {
			int temp=0;
			if (arr[j] > arr[j+1]) {
            temp=arr[j];
            arr[j]=arr[j+1];
            arr[j+1]=temp;
            
			}
			
		}
		
	}
	System.out.println(Arrays.toString(arr));
}


	public static void main(String[] args) {
      int[] arr = {10,30,20,40};
      sortArray(arr);
      System.out.println("Second smallest no:"+arr[1]);
	}

}
