package com.multithreadingdemo;

public class ThreadDemo extends Thread {

	@Override
	public void run() {
		
		
		for (int i = 1; i <= 10; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(i + " : " + currentThread().getName() + "");

		}
	}

	public static void main(String[] args) throws InterruptedException {

		ThreadDemo t1 = new ThreadDemo();
		t1.setName("Thread-1");

		t1.start();
		t1.join();
		t1.setPriority(MAX_PRIORITY);
		System.out.println(t1);
		ThreadDemo t2 = new ThreadDemo();
		t2.setName("Thread-2");
		t2.setPriority(MIN_PRIORITY);
		System.out.println(t2);
		t2.start();
		
		System.out.println(t1.isAlive());
		System.out.println(t2.isAlive());

	}

}
