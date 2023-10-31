package com.object;

public class Account {

	private int accNo;
	private String ownerName;
	private double balance;

	public void display() {
		System.out.println(accNo);
		System.out.println(ownerName);
		System.out.println(balance);
	}

	public void setaccNo(int acNo) {
		accNo = acNo;
	}

	public void setownerName(String oNm) {
		ownerName = oNm;
	}

	public void setbalance(double bal) {
		balance = bal;
	}

	public int getaccNo() {
		return accNo;
	}

	public String getownerName() {
		return ownerName;
	}

	public double getbalance() {
		return balance;
	}

	public static void main(String[] args) {
		Account obj = new Account();
		obj.setaccNo(2345678);
		obj.setownerName("Radha");
		obj.setbalance(10000);
		obj.display();

	}

}
