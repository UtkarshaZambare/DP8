package com.collectionMap;

import java.util.HashMap;
import java.util.Map.Entry;

public class StudentMap {

	public static void main(String[] args) {
		Student s1= new Student(1,"Utkarsha",120);
		Student s2= new Student(2,"Rohit",150);
		Student s3= new Student(3,"Shreya",135);
		Student s4= new Student(4,"Utkarsha",190);
		Student s5= new Student(5,"Utkarsha",170);
		
		HashMap<Student,String> studentmap = new HashMap<Student,String>();
		studentmap.put(s1, "Java");
		studentmap.put(s2, "Sql");
		studentmap.put(s3, "C++");
		studentmap.put(s4, "Python");
		studentmap.put(s5, "C#");
		
		for (Entry<Student,String> entry : studentmap.entrySet()) 
		{
			System.out.println(entry.getValue() + "Value" + " is " + entry.getKey());
		}
		

	}

}
