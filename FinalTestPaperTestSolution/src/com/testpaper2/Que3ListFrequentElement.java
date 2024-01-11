/*3) Write a java program to find the least frequent element in an array?without using any builtin method.[1M]
Input Array : [4, 5, 8, 7, 4, 7, 6, 7]
The least frequent element : 8,6,5
Its frequency : 1
*/

package com.testpaper2;

public class Que3ListFrequentElement {

	public static void findLeastFrequentElements(int arr[]) {
		int [] frequency = new int[arr.length];
		
		for(int i =0; i<arr.length; i++) {
		int count = 1;
		for(int j=i+1; j<arr.length; j++) {
			if(arr[i]==arr[j]) {
				count++;
			}
		}
		 frequency[i] = count;
        }

        // Find the least frequent element and its frequency
        int leastFrequentElement = arr[0];
        int leastFrequency = frequency[0];

        for (int i = 1; i < arr.length; i++) {
            if (frequency[i] < leastFrequency) {
                leastFrequency = frequency[i];
                leastFrequentElement = arr[i];
            }
        }

        System.out.println("Input Array: " + java.util.Arrays.toString(arr));
        System.out.println("The least frequent element: " + leastFrequentElement);
        System.out.println("Its frequency: " + leastFrequency);
    }

	
	
	
	public static void main(String[] args) {
		int arr[] = {4, 5, 8, 7, 4, 7, 6, 7};
		findLeastFrequentElements(arr);

	}

}
