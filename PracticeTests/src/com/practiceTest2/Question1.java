package com.practiceTest2;

public class Question1 {

	
		public static void main(String[] args) {
			Car c1 = new Car();
			c1.color = "Blue";
			Car c2=new Car();
			c2.changeColor(c1);
			c2.color="Pink";
			System.out.println(c1.color);
			System.out.println(c2.color);	}
	}
	class Car
	{	String color;
		public void changeColor(Car c2)
		{
			c2.color = color;
			color = "Red";
		}
	}


	


