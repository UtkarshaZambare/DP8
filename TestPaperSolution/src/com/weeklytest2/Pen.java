//A Pen contains variables Refill, capLength and brand. 
//Refill has variables inkColor, length and Nib (tip).
//Nib has variables materialType and width. 
//Create a Java class structure for above . Write a main method which sets values in all the variables
//using setter methods and prints all the variables using getter methods

package com.weeklytest2;

public class Pen {

	private Refill refill;
	private double capLength;
	private String brand;

	public Pen() {

	}

	public Pen(double capLength, String brand, Refill refill) {
		this.capLength = capLength;
		this.brand = brand;
		this.refill = refill;
	}

	public Refill getRefill() {
		return refill;
	}

	public void setRefill(Refill refill) {
		this.refill = refill;
	}

	public double getCapLength() {
		return capLength;
	}

	public void setCapLength(double capLength) {
		this.capLength = capLength;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	@Override
	public String toString() {
		return "Pen = capLength=" + capLength + ", brand=" + brand + "Refill="+refill;
	}

	public static void main(String[] args) {
		Pen p = new Pen(5.5,"trimax", new Refill("Blue",10.5,new Nib("Steel",0.5)));
		System.out.println(p);
		

	}

}
