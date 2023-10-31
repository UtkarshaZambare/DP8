package com.staticprograms;

public class CustomerDetail {

	static int count = 0;
	private int cid;
	private String cname;

	CustomerDetail() {
		this.cid = count++;
	}

	public void DisplayData() {
		System.out.println("cid:" + cid + "cname:" + cname);
	}

	public void setData(String nm) {

		this.cname = nm;

	}

	public static void main(String[] args) {
		CustomerDetail obj1 = new CustomerDetail();
		CustomerDetail obj2 = new CustomerDetail();
		CustomerDetail obj3 = new CustomerDetail();
		obj1.setData("John");
		obj2.setData("ohn");
		obj3.setData("hn");
		obj1.DisplayData();
		obj2.DisplayData();
		obj3.DisplayData();
		System.out.println(count);

		// TODO Auto-generated method stub

	}

}
