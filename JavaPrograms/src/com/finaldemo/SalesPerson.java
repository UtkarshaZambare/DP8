package com.finaldemo;




final public class SalesPerson extends WageEmployee {

	double comm, sale;

	public SalesPerson() {

	}

	public SalesPerson(int eid, String ename, double salary, MyDate joindate, double hrs, double rate,double comm,double sales) 
	{
		super(eid, ename, salary, joindate, hrs, rate);
		this.comm = comm;
		this.sale=sales;

	}
	public String toString()
	{
		return super.toString()+" Sales "+sale+ " comm "+comm;
		
	}
	


	public static void main(String[] args) {
		SalesPerson s=new SalesPerson(101, "Kanchan", 10000, new MyDate(23,07,2024), 50, 25, 10000, 0.1);
		System.out.println(s);

	}

}

