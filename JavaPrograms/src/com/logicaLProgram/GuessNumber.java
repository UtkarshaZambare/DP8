package com.logicaLProgram;

import java.util.Scanner;

public class GuessNumber {

	public static void main(String[] args) {
		int num =4;
        Scanner sc = new Scanner (System.in);
        
         
         
         while(true) {
        	 System.out.println("\n Enter any number ");
        	 int guessnum = sc.nextInt();
        	 if(num==guessnum) 
        	 {
        		 System.out.println("Congo! you guess right number");
        	     break;
        	 }
        	 else if(num<guessnum)
        	 {
        		 System.out.println("\n number is higher than gusseing number");
        	 }
        	 else 
        	 {
        		 System.out.println("\n number is lower than gusseing number");
        	 }	 
        	 
         }
         
	}

}
