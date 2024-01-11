package com.array;

public class FindFrequencyOfArrayElements {

	public static void frequencyElement(int[] arr) {
		int[] frequency = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			int count = 1;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					count++;
					// Mark the duplicate element by setting its value to 0
					arr[j] = 0;
				}
			}

			// If the element is not marked as a duplicate, set its frequency in the
			// auxiliary array
			if (arr[i] != 0) {
				frequency[i] = count;
			}
		}

		// Display the frequencies of each element
		for (int i = 0; i < frequency.length; i++) {
			if (frequency[i] != 0) {
				System.out.println("Element: " + arr[i] + " - Frequency: " + frequency[i]);
			}
		}
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 2, 4, 5, 3, 2, 1, 2 };
		frequencyElement(arr);
	}

}
