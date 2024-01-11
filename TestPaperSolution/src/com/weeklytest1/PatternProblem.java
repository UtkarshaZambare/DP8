//1234 
//123
//12
//1

package com.weeklytest1;

public class PatternProblem {

	public void printPattern() {
		int i, j, n = 4;
		for (i = n; i >= 1; i--) {
			for (j = 1; j <= i; j++) {
				System.out.print(j+ "");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		PatternProblem obj = new PatternProblem();
		obj.printPattern();

	}

}
