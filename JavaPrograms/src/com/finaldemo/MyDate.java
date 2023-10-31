package com.finaldemo;

public class MyDate {

	@Override
	public String toString() {
		return "MyDate [dd=" + dd + ", mm=" + mm + ", yy=" + yy + "]";
	}

	int dd, mm, yy;

	public MyDate() {
		System.out.println("Default constructor");
		dd = 17;
		mm = 10;
		yy = 23;
	}

	public MyDate(int d, int m, int y) {
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

	public static void main(String[] args) {
		MyDate obj = new MyDate();
		obj.display();
		obj.setData(10, 2, 2023);
		obj.display();
		
	}

}
