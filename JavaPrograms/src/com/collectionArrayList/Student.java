package com.collectionArrayList;

import java.util.ArrayList;
public class Student implements Comparable<Student> {

int rollno;
String name;
ArrayList<Integer> marks;
double percentage;
String grdade;
public Student()
{
	
}
public Student(int rollno, String name,ArrayList<Integer> l) {

	this.rollno = rollno;
	this.name = name;
	this.marks=l;
	calculatePercentage();
	calculateGrade();
}

public int getRollno() {
	return rollno;
}

public void setRollno(int rollno) {
	this.rollno = rollno;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}
public void calculatePercentage()
{
	int sum=0;
	for(int m:marks)
		sum=sum+m;
	this.percentage=(sum/5);
}
public void calculateGrade()
{
	if(this.percentage>=90)
		this.grdade="A+";
	else if(this.percentage>=80)
		this.grdade="A";
	else if(this.percentage>=70)
    		this.grdade="B";
	
	else if(this.percentage>=60)
		this.grdade="C";
	else
		this.grdade="D";
	
	
}
public static void main(String[] args) {
	// TODO Auto-generated method stub

}

@Override
public String toString() {
	return "Student [rollno=" + rollno + ", name=" + name + ", marks=" + marks + ", percentage=" + percentage
			+ ", grdade=" + grdade + "]";
}
@Override
public int compareTo(Student o) {
	return rollno;
	
	
	//Sorting by name
//	int res=this.name.compareTo(o.name);
//	System.out.println(res);
//	return res;
	
//Sorting by rollno	
//	if(this.rollno==o.rollno)
//		return 0;
//	else if(this.rollno >o.rollno)
//		return -1;
//	else
//		return 1;
	
	//Sorting by percentage
	
//	if (this.percentage==o.percentage)
//		return 0;
//	else if(this.percentage> o.percentage)
//		return -1;
//	else
//		return 1;
	
	//Sorting by gread
//		int result = this.grdade.compareTo(o.grdade);
//		System.out.println(result);
//		return result;
//	
//  if(this.percentage>90) 
//    return 0;
//  else 
//	  return 1;

}


}
