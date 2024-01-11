package com.weeklytest6;

public class Pattern {

	public static void main(String[] args) {
		
		int n =0;
		for(int i = 4; i>=0; i--) {
			for(int j=0; j<i; j++) 
			{
				System.out.print(n+" ");
				n++;
			}
		 System.out.println();
		}

	}

}
