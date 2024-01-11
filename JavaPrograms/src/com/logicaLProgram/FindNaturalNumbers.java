package com.logicaLProgram;

import java.util.Scanner;

public class FindNaturalNumbers {

	public void getNaturalNumber(int num) 
	{
		for(int i=1; i<=num; i++) 
		{
			System.out.println("natural number:"+i);
		}
	}
	
	public void getNaturalNumberinReverse(int num) 
	{
		for(int i=num; i>=1; i--) 
		{
			System.out.println("natural number:"+i);
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enetr any number");
		int num = sc.nextInt();
		
		FindNaturalNumbers obj = new FindNaturalNumbers();
		
//		obj.getNaturalNumber(num);
		obj.getNaturalNumberinReverse(num);

	}

}
