package com.testpaper2;

public class Que15PrintSeries {

	public static void main(String[] args) {
		int n,num1=1,num2=0,result;
		
		for( n=1;n<=15;n++) {
			result= num1+num2*2;
			
			System.out.print (result+ " ");
			
			num1=num2;
			num2=result;
		}

	}
}