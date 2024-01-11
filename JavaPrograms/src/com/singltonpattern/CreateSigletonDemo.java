package com.singltonpattern;

public class CreateSigletonDemo {
	private static CreateSigletonDemo single_instance;

	private String s;

	CreateSigletonDemo() {

		setS("Hello am string part of singlton class");
	}

	public static CreateSigletonDemo getInstance() {

		if (single_instance == null)
			single_instance = new CreateSigletonDemo();

		return single_instance;

	}

	public static void main(String[] args) {

	}

	public String getS() {
		return s;
	}

	public void setS(String s) {
		this.s = s;
	}

}
