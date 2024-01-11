package com.clone;

public class Employee implements Cloneable  {
	
	int eid,sal;
	String name;
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		
		return this;
	}


	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", sal=" + sal + ", name=" + name + "]";
	}


	public Employee(int eid, int sal, String name) {
		super();
		this.eid = eid;
		this.sal = sal;
		this.name = name;
	}


	public static void main(String[] args) throws CloneNotSupportedException {
		Employee  e1=new Employee(101, 35000, "Peter");
		Employee e2=(Employee) e1.clone();
		System.out.println(e1);
		System.out.println(e1.hashCode());
		System.out.println(e2);
		System.out.println(e2.hashCode());

		

	}

}
