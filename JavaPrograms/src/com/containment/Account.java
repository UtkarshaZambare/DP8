package com.containment;

public class Account {

	private long accNo;
	private String Name;
	private double balance;

	Account() {

	}

	Account(long accNo, String Name, double balance) {
		this.accNo = accNo;
		this.Name = Name;
		this.balance = balance;

	}

	public void setaccNo(long ac) {
		this.accNo = ac;
	}

	public void setName(String nm) {
		this.Name = nm;
	}

	public void setName(double bal) {
		this.balance = bal;
	}

	public long getaccNo() {
		return accNo;

	}

	public String getName() {
		return Name;

	}

	public double getbalance() {
		return balance;

	}

	public String toString() {
		return "Account details"  + accNo +  "Name"  + Name +  "balance" + balance;
	}

	public static void main(String[] args) {
		Account obj = new Account();
		System.out.println(obj);
		Account obj1 = new Account(123456, "Tina", 45000);
		System.out.println(obj1);

	}

}
