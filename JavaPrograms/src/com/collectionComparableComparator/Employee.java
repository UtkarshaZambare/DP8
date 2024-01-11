package com.collectionComparableComparator;

public class Employee implements Comparable<Employee> {

	int eid;
	String ename;
	Double salary;
	int age;
	Department2 dpt;

	public Employee(int eid, String ename, double salary, int age, Department2 dpt) {

		this.eid = eid;
		this.ename = ename;
		this.salary = salary;
		this.age = age;
		this.dpt = dpt;

	}

	@Override
	public String toString() {
		return "Employee [\neid=" + eid + ", ename=" + ename + ", salary=" + salary + ", age=" + age + ", dpt=" + dpt
				+ "]";
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
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

	

	public Department2 getDpt() {
		return dpt;
	}

	public void setDpt(Department2 dpt) {
		this.dpt = dpt;
	}

	@Override
	public int compareTo(Employee o) {
		return this.eid - o.eid;
	}

	

}
