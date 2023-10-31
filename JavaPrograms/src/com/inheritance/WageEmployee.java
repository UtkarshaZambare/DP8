package com.inheritance;

public class WageEmployee extends Employee {

	double hrs, rate;

	 public WageEmployee() {
		System.out.println("I am in  default constructor");
	}

	 public WageEmployee(int eid, String ename, double salary, MyDate joindate, double hrs, double rate) {
		super(eid, ename, salary, joindate);
		this.hrs = hrs;
		this.rate = rate;

	}
	@Override
	public double calculateSalary() {
		
		
		System.out.println("in WageEmp calculateSalary");
		double s= super.calculateSalary()+hrs*rate;
		super.setSalary(s);
		return s;

	}

	

	@Override
	public String toString() {
		return super.toString()+"WageEmployee [hrs=" + hrs + ", rate=" + rate + ", eid=" + eid + ", ename=" + ename + ", salary="
				+ salary + ", joindate=" + joindate + "]";
	}

	public static void main(String[] args) {
		WageEmployee we=new WageEmployee(101,"Kanchan",20000,new MyDate(24,10,2023),50,25);
		System.out.println(we.calculateSalary());
		System.out.println(we);


	}

}
