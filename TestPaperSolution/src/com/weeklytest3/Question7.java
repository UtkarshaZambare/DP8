package com.weeklytest3;

public class Question7 {

	public static void main(String[] args) {
		for (int number = 100; number <= 400; number++) {
            // Check if all digits of the number are even
            if (areAllDigitsEven(number)) {
                System.out.println(number);
            }
        }
    }

	private static boolean areAllDigitsEven(int number) {
		while (number > 0) {
            int digit = number % 10;
            if (digit % 2 != 0) {
                return false;
            }
            number /= 10;
        }
        return true;
    }
}



