package com.innerclasses.simpleinnerclass;

public class Outer {

	int outer_n;
	int data = 100;

	public Outer() {
		outer_n = 10;
	}

	public Outer(int outer_n) {
		this.outer_n =  outer_n;
	
	}

	public void showOuterData() {
		System.out.println("outer class is " + outer_n);
	    Inner in = new Inner (20);
	
	}
	
	public  class Inner {
		int inner_n;
		int data =999;
		
		public Inner() {
			inner_n =15;
		}
		public Inner(int inner_n) 
		{
			this.inner_n = inner_n;
		}
		
		public void showInnerData() {
			System.out.println("Inner class Data is " + inner_n)  ;
		    System.out.println("Outer data from inner class method" +outer_n);
		    System.out.println(this.data);
		    System.out.println(Outer.this.data);
		}
	}
	
	
	
	
	public static void main(String[] args) {
		
		Outer outer = new Outer();
		outer.showOuterData();
		
		Outer.Inner in = outer.new Inner();
		in.showInnerData();
}
}