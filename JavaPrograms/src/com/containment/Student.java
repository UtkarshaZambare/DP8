package com.containment;

public class Student {

	private int rollno;
	private String name;

	Student() {

	}

	Student(int rollno, String name) {

		this.rollno = rollno;
		this.name = name;
	}

	public void setData(int rollno) {
		this.rollno = rollno;
	}

	public void setData(String name) {
		this.name = name;
	}

	public int getrollno() {
		return rollno;
	}

	public String getName() {
		return name;
	}

	public String toString() {
		return "Id=" + rollno + "\nName =" + name;

	}

	public static void main(String[] args) {
		Student s = new Student();
		System.out.println(s);
		Student s1 = new Student(201,"Riya");
		System.out.println(s1);
		
		
		

	}

}
