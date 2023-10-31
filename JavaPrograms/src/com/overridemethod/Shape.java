package com.overridemethod;

public class Shape {

	public Shape() {

	}

	public void Draw() {

		System.out.println("Draw");

	}

	public static void main(String[] args) {

	}

}

class Circle extends Shape {

	public Circle() {

	}

	public void Draw() {

		System.out.println("Shape");
		super.Draw();

	}

	public static void main(String[] args) {
     Circle obj = new Circle();
     obj.Draw();
	}
}


class Squere extends Circle{
	
	Squere()
	{
		
	}
	
	public void Draw() {
		System.out.println("In Circle");
		super.Draw();
	}
	
	
	
}
