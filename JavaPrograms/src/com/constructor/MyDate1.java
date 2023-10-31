package com.constructor;

public class MyDate1 {
	int dd, mm, yy;

	public MyDate1() {
		System.out.println("Default constructor");
		dd = 17;
		mm = 10;
		yy = 23;
	}

	public MyDate1(int d, int m, int y) {
		System.out.println("parameterized constructor");
		dd = d;
		mm = m;
		yy = y;
	}

	public void setData(int d, int y, int m) {
		dd = d;
		mm = m;
		yy = y;

	}
	public void display() 
	{
		System.out.println("Date is"+dd+"/"+mm+"/"+yy);
	}
	//object calling in method
	public MyDate1 getobject() 
	{
		this.dd=20;
		this.mm=10;
		this.yy=2023;
		return this;
		
	}

	public static void main(String[] args) {
		System.out.println("I am in main");
		MyDate1 obj = new MyDate1();
		obj.display();
		obj.setData(10, 2, 2023);
		obj.display();
		MyDate1 o = obj.getobject();
		o.display();
		
	}

}

	