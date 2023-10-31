package com.object;

// using getter and setter
public class MyDate {

	private int dd, mm, yy;

	public void setDd(int d) {
		dd = d;
	}

	public void setMm(int m) {
		mm = m;
	}

	public void setYy(int y) {
		yy = y;
	}

	public int getDd() {
		return dd;
	}

	public int getMm() {
		return mm;
	}

	public int getYy() {
		return yy;
	}

	public void printDate() {
		System.out.println("Date is:" + dd + "/" + mm + "/" + yy);
	}

	public static void main(String[] args) {
		MyDate obj = new MyDate();
		obj.setDd(10);
		obj.setMm(12);
		obj.setYy(2023);
		obj.printDate();

	}

}
