package com.constructor;

public class Employee {

	private int eid;
	private String ename;
	private String email;
	private double salary;

	public void setData(int e, String nm, String em, double s) {
		this.eid = e;
		this.ename = nm;
		this.email = em;
		this.salary = s;
	}

	public void display() {
		System.out.println(eid);
		System.out.println(ename);
		System.out.println(email);
		System.out.println(salary);
	}

	public void CompareSalary(Employee otherEmployee) {
        if (this.salary > otherEmployee.salary) {
            System.out.println(this.ename + " has a higher salary than " + otherEmployee.ename);
        } else if (this.salary < otherEmployee.salary) {
            System.out.println(this.ename + " has a lower salary than " + otherEmployee.ename);
        } else {
            System.out.println(this.ename + " and " + otherEmployee.ename + " have the same salary.");
        }
    }

    public static void main(String[] args) {
        Employee employee1 = new Employee();
        employee1.setData(1, "John", "john@example.com", 50000.0);
        
        Employee employee2 = new Employee();
        employee2.setData(2, "Alice", "alice@example.com", 55000.0);

        employee1.display();
        employee2.display();
        
        employee1.CompareSalary(employee2);
    }
}






