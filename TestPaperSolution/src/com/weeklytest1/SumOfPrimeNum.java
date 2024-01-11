package com.weeklytest1;

import java.util.Scanner;

public class SumOfPrimeNum {

	public boolean checkPrimeNum(int num) {
		int count = 0;
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				count = 1;
				break;
			}
		}
		if (count == 0)
			return true;
		else {
			return false;
		}
	}

	public  void sumPrime(int num) {
		int sum = 0;
		int count = 0;
		for (int i = 2; count < num; i++) {
        if(checkPrimeNum(i)) 
        {
        	sum=sum+i;
        	count++;
        }
		}
		System.out.println("Sum of first"+num+ "prime number= "+sum);
	}

	public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     System.out.println("enter the number");
     int num = sc.nextInt();
     
    SumOfPrimeNum obj = new SumOfPrimeNum();
      obj.sumPrime(num);
      obj.checkPrimeNum(num);
	}

}
