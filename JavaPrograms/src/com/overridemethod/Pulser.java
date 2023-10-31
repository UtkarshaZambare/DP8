package com.overridemethod;

public class Pulser extends Bike {
	String model;

	public Pulser(String color, int speed, String model) {
		super(color, speed);
		this.model = model;
	}

	@Override
	public void bikeInfo() {
		System.out.println("Model: " + model);
		super.bikeInfo();

	}
	@Override
	public String toString() {
		return super.toString()+"Pulser [model=" + model + "]";
	}


	public static void main(String[] args) {
		Bike b= new Pulser("Black", 80, "Pulsar 220");
		b.bikeInfo();
		System.out.println(b);

	}

	
}
