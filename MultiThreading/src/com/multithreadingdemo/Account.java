package com.multithreadingdemo;

public class Account {
	
	private long balance = 5000;
	
	public long getBalance() {
		return balance;
		
	}

	public void withDrawAmount(int amount) 
	{
		if(balance>amount) {
			balance =balance-amount;
			System.out.println("The amount is withdraw by" + Thread.currentThread().getName());
		}
			else { 
				System.out.println(Thread.currentThread().getName() + "Insufficent balance");
			
		}
	}

	public void deposit(int rupees) {
		balance=balance+rupees;
		System.out.println("The amount is deposited by  " + Thread.currentThread().getName());

		
	}
	
}
