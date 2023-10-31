package com.abstractinterfacedemo;

public class Jucier extends Machine {

	public Jucier() {

	}

	@Override
	public void rotate() {
		System.out.println("Machine is rotating");
	}

	public void filter() {
		System.out.println("Juicer is filtering.");
	}

	@Override
	public void crush() {
		System.out.println("jucier is crushing");

	}

	public static void main(String[] args) {
		Machine m = new Jucier();
		m.rotate();
		m.crush();
		((Jucier) m).filter();

	}

}
