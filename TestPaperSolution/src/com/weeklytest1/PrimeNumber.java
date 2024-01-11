package com.weeklytest1;

import java.util.Scanner;

public class PrimeNumber {

	public void getPrimeNum(int num) {
		
		boolean status =true;
		for (int i= 12; i <= 25; i++) {
			if (num %2== 0) {
				
				break;
			}
		}
		if (status==true) 
		{
			System.out.println("number is prime");
		}else 
		{
			System.out.println("number is not prime");
		}
	}

	public static void main(String[] args) {
		PrimeNumber obj  = new PrimeNumber();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number between 12 to 25");
		int num =sc.nextInt();
		obj.getPrimeNum(num);
		
		
		

	}
}