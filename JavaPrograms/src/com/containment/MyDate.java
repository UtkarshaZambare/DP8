package com.containment;

public class MyDate {

	private int day;
	private int month;
	private int year;

	
	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public MyDate(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}
	public String toString() {
		return "day=" + day + " month=" + month + " year=" + year ;
	}

	public static void main(String[] args) {
		MyDate d = new MyDate(1,2,2030 );
		System.out.println(d);

	}

}
