package com.test;

import com.manager.TestResultManager;

//import java.util.Scanner;

import com.manager.AttendanceManager;
import com.manager.TransactionManager;
import com.manager.CourseManager;
import com.manager.StudentManager;

public class Test {

	public static void main(String[] args) {
		//CourseManager.addCourse();

		CourseManager.addTwoCourse();
		CourseManager.printCourses();
		System.out.println("--------------------------------------------------------------------------------------------");
		StudentManager.dummyAdd();
		StudentManager.show();
		System.out.println("--------------------------------------------------------------------------------------------");

		AttendanceManager.addDummyAttendance();
		AttendanceManager.show();
		System.out.println("--------------------------------------------------------------------------------------------");

		TransactionManager.dummyTransaction();
		TransactionManager.show();
		System.out.println("--------------------------------------------------------------------------------------------");

		TestResultManager.addDummyTestResult();
		TestResultManager.show();
		System.out.println("--------------------------------------------------------------------------------------------");

		//One method which takes course id as input and shows all students registered for this 
	    //course.
//	    Scanner sc = new Scanner(System.in);
//	    System.out.println("Enter a Course Id : ");
//	    int id = sc.nextInt();
//	    System.out.println("Students with Course is : ");
//	    StudentManager.addStudent(id);
//	    StudentManager.show();
//	    
		System.out.println("--------------------------------------------------------------------------------------------");

	    StudentManager.maxStudentInCourse();
	    
	    System.out.println("--------------------------------------------------------------------------------------------");
	    
	    TransactionManager.paidAllFees();
	    
	    System.out.println("--------------------------------------------------------------------------------------------");

	   TestResultManager.countPercentageForPoorPerformance();
	    
	    System.out.println("--------------------------------------------------------------------------------------------");
	    	System.out.println("Poor Performance : ");
	    TestResultManager.countPercentageForPoorPerformance();   
	    
	    
	    
	    
	    
//	    sc.close();

	}

}
