/*4) print the patteren[1M]
      A
     CBA
    EDCBA
   GFEDCBA
*/




package com.testpaper2;

public class Que4PrintPattern {

	static void printPattern(int rows) {
        for (int i = 1; i <= rows; i++) {
            // Print spaces
            for (int j = 0; j < rows - i; j++) {
                System.out.print(" ");
            }

            // Print letters in reverse order
            for (int k = i * 2 - 1; k > 0; k--) {
                System.out.print((char) (64 + k));
            }

            System.out.println();
        }
    }

	public static void main(String[] args) {
        int rows =4;
		printPattern(rows);
	}

}
