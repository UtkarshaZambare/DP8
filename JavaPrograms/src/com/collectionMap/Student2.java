package com.collectionMap;

import java.util.ArrayList;

public class Student2 {

	private int rollNo;
	private String name;
	private ArrayList<Integer> marks;
	private double percentage;
	private String gread;

	public Student2(int rollNo, String name, ArrayList<Integer> marks) {
		this.rollNo = rollNo;
		this.name = name;
		this.marks = marks;
		calculatePercentage();
		grade();

	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<Integer> getMarks() {
		return marks;
	}

	public void setMarks(ArrayList<Integer> marks) {
		this.marks = marks;
	}

	public double calculatePercentage() {
		double sum=0;
		for(int i: marks) 
		{
			sum=sum+i;
		}
		percentage = (sum*100)/500;
		return percentage;
	}

	public String grade() {
		if(this.percentage>=90)
			this.gread="A+";
		else if(this.percentage>=80)
			this.gread="A";
		else if(this.percentage>=70)
	    		this.gread="B";
		
		else if(this.percentage>=60)
			this.gread="C";
		else
			this.gread="D";
		return gread;
	}

	@Override
	public String toString() {
		return "\nrollNo=" + rollNo + ", name=" + name + ", marks=" + marks + ", percentage=" + percentage + ", gread="
				+ gread + " ";
	}

	public static void main(String[] args) {

	}

}
