package com.weeklytest5;

public class Employee implements Comparable<Employee> {

	 int eid;
	 String name;
	Department d;

	public Employee(int eid, String name, Department d) {
		super();
		this.eid = eid;
		this.name = name;
		this.d = d;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Department getD() {
		return d;
	}

	public void setD(Department d) {
		this.d = d;
	}

	@Override
	public String toString() {
		return " \neid=" + eid + ", name=" + name + ", d=" + d + " ";
	}

	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		return Integer.compare(this.eid,o.eid);
	}

}
