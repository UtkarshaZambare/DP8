package com.abstractinterfacedemo;
import com.inheritance.Employee;
import com.inheritance.MyDate;
public class UseInterface {

	public UseInterface() {
		
	}

	public static void main(String[] args) {
		Printable p=new Circle(4.5);
		p.Show();
		Printable parr[]=new Printable[3];
		parr[0]=new Circle(3.5);
		parr[1]=new Employee();
		parr[2]=new MyDate();
		for(int i =0; i<parr.length; i++) 
		{
			System.out.println(parr[i]);
		}


	}

}
