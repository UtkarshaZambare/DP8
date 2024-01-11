package com.collectionLinkedList;

public class Student {
	int id;
	String Name;
	int rollno;

	public Student(int id, String name, int rollno) {
		super();
		this.id = id;
		Name = name;
		this.rollno = rollno;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", Name=" + Name + ", rollno=" + rollno + "]";
	}

	public static void main(String[] args) {

	}

}
