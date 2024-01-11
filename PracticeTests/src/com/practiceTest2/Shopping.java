/* Q3.Write a program with Shopping class which has overloaded method ‘doTransaction’.                                                     If it has CreditCard type parameter it should display message ‘You got 15% discount on bill on credit card transaction’.                                
 * If it has DebitCard type parameter it should display message 
 * ‘No discount on bill on debit card transaction’./*
 */

package com.practiceTest2;

public class Shopping {

	
		    public void doTransaction(CreditCard creditCard) {
		        System.out.println("You got 15% discount on bill on credit card transaction");
		    }

		    public void doTransaction(DebitCard debitCard) {
		        System.out.println("No discount on bill on debit card transaction");
		    }
		

		
		    public static void main(String[] args) {
		        Shopping shopping = new Shopping();

		        // Credit Card Transaction
		        CreditCard creditCard = new CreditCard();
		        shopping.doTransaction(creditCard);

		        // Debit Card Transaction
		        DebitCard debitCard = new DebitCard();
		        shopping.doTransaction(debitCard);
		    }
		}
	


