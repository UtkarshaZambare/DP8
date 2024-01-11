package com.array;

public class DuplicateElementInArray {

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
		int num[] = { 1, 2, 3, 4, 2, 1, 5, 3, 6 };
		countDuplicate(num);

	}

}
