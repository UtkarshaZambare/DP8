package com.staticprograms;

public class staticKeywordExample {
	public static int numberOfWorker = 0;
	public String name;

	public staticKeywordExample(String name) {
		this.name = name;
		numberOfWorker++; // increment the static variable every time a new //Person is created
	}

	public static void main(String[] args) {
		staticKeywordExample dpt1 = new staticKeywordExample("Admin");
		System.out.println(staticKeywordExample.numberOfWorker); // output: 1

		staticKeywordExample dpt2 = new staticKeywordExample("Finance");
		System.out.println(staticKeywordExample.numberOfWorker); // output: 2

		staticKeywordExample dpt3 = new staticKeywordExample("Software");
		System.out.println(staticKeywordExample.numberOfWorker); // output: 3

	}

}
