package com.abstractinterfacedemo;

public class Circle extends Shape implements Printable {

	
	double r;
	final double pi=3.14;
	public Circle(double r)
	{
		this.r=r;
//		double d;
//		d=calculateArea();
//		System.out.println(d);
	}

	@Override
	public double calculateArea() {
		
		return pi*r*r;
	}

	
	
	public String toString()
	{
		return "Area_of _circle"+pi*r*r;
	}


	public static void main(String[] args) {
		Circle obj=new Circle(3.5);
		System.out.println(obj.calculateArea());
		System.out.println(obj.n);
		Shape s=new Circle(3.5);
		Shape arr[]=new Shape[1];
		arr[0]=new Circle(4.5);
		obj.calculateArea();

		

	}

	@Override
	public void Show() {
		
		System.out.println("I am in show of Circle");
	}



}
