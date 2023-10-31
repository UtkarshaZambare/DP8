package com.overridemethod;

import com.inheritance.MyDate;

public class Empolyee2 {
	
	int eid;
	String ename;
	double salary;
	MyDate joindate;

	public Empolyee2() {

	}

	public Empolyee2(int eid, String ename, double salary, MyDate joindate) {
		this.eid = eid;
		this.ename = ename;
		this.salary = salary;
		this.joindate = joindate;
	}
	public double getSalary()
	{
		return salary;
	}
	public void setSalary(double s)
	{
		salary=s;
	}


	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", salary=" + salary + ", joindate=" + joindate + "]";
	}

	public double calculateSalary() {
		return salary;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	

}



