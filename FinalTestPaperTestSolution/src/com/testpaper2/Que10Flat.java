
/*You have been tasked to create flats in a housing scheme. Each flat has a bhk number, 
 * area, price and height. Create three flats which are exact copies of each other in such a 
 * manner that changes made to one flat should reflect across all copies.*/


package com.testpaper2;

public class Que10Flat {
	
	private int bhk;
    private double area;
    private double price;
    private double height;
	public Que10Flat(int bhk, double area, double price, double height) {
		super();
		this.bhk = bhk;
		this.area = area;
		this.price = price;
		this.height = height;
	}
	public int getBhk() {
		return bhk;
	}
	public void setBhk(int bhk) {
		this.bhk = bhk;
	}
	public double getArea() {
		return area;
	}
	public void setArea(double area) {
		this.area = area;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	@Override
	public String toString() {
		return "bhk=" + bhk + ", area=" + area + ", price=" + price + ", height=" + height + " ";
	}
    
    

}
