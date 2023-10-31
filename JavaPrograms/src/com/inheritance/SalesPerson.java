package com.inheritance;

public class SalesPerson extends WageEmployee {

	double comm, sales;

	public SalesPerson() {

	}

	public SalesPerson(int eid, String ename, double salary, MyDate joindate, double hrs, double rate, double sales,
			double comm) {
		super(eid, ename, salary, joindate, hrs, rate);
		this.comm = comm;
		this.sales = sales;

	}
	public String toString()
	{
		return super.toString()+" Sales "+sales+ " comm "+comm;
		
	}
	public double calculateSalary()
	{
		System.out.println("in Salesperson calculateSalary");
		double s=super.calculateSalary()+sales*comm;
		super.setSalary(s);
		return s;
	}


	public static void main(String[] args) {
		SalesPerson s=new SalesPerson(101, "Kanchan", 10000, new MyDate(23,07,2024), 50, 25, 10000, 0.1);
		System.out.println(s.calculateSalary());
		System.out.println(s);


	}

}
