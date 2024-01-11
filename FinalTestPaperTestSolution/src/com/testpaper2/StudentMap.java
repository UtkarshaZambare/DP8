package com.testpaper2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import com.testpaper1.Student;


public class StudentMap {

	public static void main(String[] args) {
		 Map<Que12Student, List<String>> studentCourseMap = new HashMap<>();
		 
		 Que12Student std1 = new Que12Student(101, "Rohit");
		 Que12Student std2 = new Que12Student(102, "Suyash");
		 
		 List<String> course1 = List.of("Biology","Chemistry");
		 List<String> course2 = List.of("Maths","Physics");
		 
		 studentCourseMap.put(std1, course1);
		 studentCourseMap.put(std2, course2);
		
		 
		 Map<String, List<Que12Student>> courseStudentMap = new HashMap<>();
		 
		 
		 Iterator<Entry<Que12Student, List<String>>> itr = studentCourseMap.entrySet().iterator();
		 while(itr.hasNext()) {
			 Map.Entry<Que12Student, List<String>> entry = itr.next();
			 Que12Student student = entry.getKey();
	            List<String> courses = entry.getValue();

	            // Iterate through the courses for the current student
	            for (String course : courses) {
	                // If the course ID is not already a key in the new map, add it
	                courseStudentMap.putIfAbsent(course, new ArrayList<>());

	                // Add the student to the list of students for that course
	                courseStudentMap.get(course).add(student);
	            }
	        }

	        // Print the original map
	        System.out.println("Original Map:");
	        for (Map.Entry<Que12Student, List<String>> entry : studentCourseMap.entrySet()) {
	            System.out.println(entry.getKey() + " - " + entry.getValue());
	        }

	        // Print the new map
	        System.out.println("\nNew Map:");
	        for (Map.Entry<String, List<Que12Student>> entry :courseStudentMap.entrySet()) {
	            System.out.println(entry.getKey() + " - " + entry.getValue());
	        }
	    }
	}