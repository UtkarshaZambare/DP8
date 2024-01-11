package com.multithreadingdemo;

public class RunnableThreadDemo implements Runnable{

	public static void main(String[] args) {
		RunnableThreadDemo t = new RunnableThreadDemo();
		Thread t1 = new Thread(t,"Ping");
		t1.start();
		Thread t2 = new Thread(new RunnableThreadDemo(),"Pong" );
		t2.start();
		
	}

	@Override
	public void run() {
		
		for(int i=1; i<=10;i++)
		{
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(i + " : " + Thread.currentThread().getName()+ " ");
		}

		
	}
}
