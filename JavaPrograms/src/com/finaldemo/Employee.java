package com.finaldemo;

public class Employee {

	final int eid;
	String ename;
	double salary;
	MyDate joindate;

	public Employee() {
		
		eid=15;

	}

	public Employee(int eid, String ename, double salary, MyDate joindate) {
		this.eid = eid;
		this.ename = ename;
		this.salary = salary;
		this.joindate = joindate;
	}

	public double getSalary() {
		return salary;
	}

	final public void setSalary(double s) {
		salary = s;
	}

	 public String toString() {
		return "Employee [eid=" + eid + "\n ename=" + ename + "\n salary=" + salary + "\n joindate=" + joindate + "]";
	}

	public static void main(String[] args) {
		Employee obj = new Employee(1,"Utkarsha",600000,new MyDate(10,2,2030));
		System.out.println(obj);

	}

}
