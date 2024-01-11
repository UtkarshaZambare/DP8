package com.collectionMap;

public class Employee {

	int empid;
	String ename;
	double salary;
	int did;

	public Employee(int empid, String ename, double salary, int did) {
		super();
		this.empid = empid;
		this.ename = ename;
		this.salary = salary;
		this.did = did;
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public int getDid() {
		return did;
	}

	public void setDid(int did) {
		this.did = did;
	}

	@Override
	public String toString() {
		return "empid=" + empid + ", ename=" + ename + ", salary=" + salary + ", did=" + did + " ";
	}

	

}
