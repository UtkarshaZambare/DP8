package com.inheritance;

import com.abstractinterfacedemo.Printable;

public class Employee implements Printable {

	int eid;
	String ename;
	double salary;
	MyDate joindate;

	public Employee() {

	}

	public Employee(int eid, String ename, double salary, MyDate joindate) {
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

	@Override
	public void Show() {
		// TODO Auto-generated method stub
		
	}

	

}
