/* Class student is as follows { private int sid, private string name , private int[] marks ,
float per}. Create array of 3 students. Hardcode data. Marks array is array of 3
integers which represent students marks of 3 subjects. Marks are out of 100. Strictly
use getter and setters to set and read values of all fields. Calculate percentage. Sort
array in descending order of percentage.*/




package com.testpaper1;

import java.util.Arrays;

public class Student {
	
	private int id;
	private String name;
	private int[]marks;
	private float per;
	
	
	public Student(int id, String name, int[] marks, float per) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
		this.per = per;
		calculatePercentage();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int[] getMarks() {
		return marks;
	}
	public void setMarks(int[] marks) {
		this.marks = marks;
		calculatePercentage();
	}
	public float getPer() {
		return per;
	}
	public void setPer(float per) {
		this.per = per;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", marks=" + Arrays.toString(marks) + ", per=" + per + "]";
	}
	
	public void calculatePercentage() {
		int totalMarks=0;
		for(int mark:marks) {
			totalMarks=totalMarks+mark;
		}
	per = totalMarks/marks.length;
	
	}

}
