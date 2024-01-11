package com.multithreadingdemo;

import java.util.Scanner;

public class Wait_Notify implements Runnable {

	public static int amount;
	Account a;
	Thread t1, t2;

	Wait_Notify()// constructor
	{
		a = new Account();

		t1 = new Thread(this, "Person1");
		t2 = new Thread(this, "Person2");

		t1.start();
		t2.start();

	}

	private void doTransaction() throws InterruptedException {
		if (Thread.currentThread() == t1) {
			synchronized (this) {
				System.out.println(Thread.currentThread().getName() + " is checking the balance = " + a.getBalance());

				Scanner sc = new Scanner(System.in);
				System.out.println("enter amount");
				amount = sc.nextInt();

				if (a.getBalance() < amount)

				{
					System.out.println(Thread.currentThread().getName() + " is waiting ....");
					wait();
					a.withDrawAmount(amount);
					System.out.println("current balance is " + a.getBalance());
					System.out.println("successul witdraw");

				}

			}
		}
		if (Thread.currentThread() == t2) {
			synchronized (this) {
				a.deposit(amount);
				System.out.println("after depositing balance is" + a.getBalance());
				System.out.println(Thread.currentThread().getName() + " is notify ....");
				notify();
			}
		}

	}

	public static void main(String[] args) {

		Wait_Notify obj = new Wait_Notify();

	}

	@Override
	public void run() {
		// synchronized(this)//will sync this class
				{
				
					try {
						doTransaction();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

	}

	}
}
