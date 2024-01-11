//Find duplicate elements from given array
package com.weeklytest3;

public class Question3 {

	public static void countDuplicate(int num[]) {

		for (int i = 0; i < num.length; i++) {
			boolean isDuplicate = false;
			for (int j = i + 1; j < num.length; j++) {
				if (num[i] == num[j]) {
					isDuplicate = true;
					break;
				}
			}
			if (isDuplicate) {
				boolean isNotprinted = true;
				for (int k = i - 1; k >= 0; k--) {
					if (num[i] == num[k]) {
						isNotprinted = false;
						break;
					}
				}  
				if (isNotprinted) {
					System.out.println(num[i] + ":is duplicate no");
				}

			}
		}

	}

	public static void main(String[] args) {
		int num[] = { 4, 3, 2, 4, 9, 2 };
		countDuplicate(num);

	}

}
