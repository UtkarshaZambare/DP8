package com.singltonpattern;

public class MySinglton {

	public static void main(String[] args) {
		
		CreateSigletonDemo d1 = new CreateSigletonDemo();
		CreateSigletonDemo d = CreateSigletonDemo.getInstance();
		System.out.println(d.hashCode());
		
		CreateSigletonDemo y =  CreateSigletonDemo.getInstance();
		System.out.println(y.hashCode());
	
		d.setS("I an from d");
		y.setS("I am from y ");
		
		System.out.println("String from x is " + d.getS());
        System.out.println("String from y is " + y.getS());

	
	
	}

}
