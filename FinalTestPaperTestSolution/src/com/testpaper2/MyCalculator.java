package com.testpaper2;

public class MyCalculator implements Que5AdvanceArithmatic {

	@Override
	public int divisor_sum(int n) {
		int sum = 0;
		for (int i = 1; i <= n; i++) {

			if (n % i == 0) {
				sum = sum + i;
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		MyCalculator obj = new MyCalculator();
		int result = obj.divisor_sum(7);
		System.out.println(result);

	}

}
