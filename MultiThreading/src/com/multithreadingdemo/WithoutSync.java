package com.multithreadingdemo;

public class WithoutSync implements Runnable {

	private Account a1;
	private Thread t1,t2;
	
	  WithoutSync(){
		a1=new Account();
		t1 = new Thread(this,"person1");
		t2=new Thread(this,"person2");
		t1.start();
		t2.start();
	}
	
	public void doTransaction() {
		System.out.println(Thread.currentThread().getName() + "is checking the balance =" +a1.getBalance());
		a1.withDrawAmount(4500);
	}
	public static void main(String[] args) {
		WithoutSync obj = new WithoutSync();
		

	}

	@Override
	public void run() {
		doTransaction() ;
		
	}

}
