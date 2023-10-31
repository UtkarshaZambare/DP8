package com.object;



public class Date {

	private int dd, mm, yy;

	public void setData(int d, int m, int y) {
		dd = d;
		mm = m;
		yy = y;
	}

	public void printDate() {

		System.out.println("Date is:" + dd + "/" + mm + "/" + yy);
	}

	public static void main(String[] args) {
		Date obj = new Date();
		obj.setData(16, 10, 2023);
		obj.printDate();
		
	}

}
