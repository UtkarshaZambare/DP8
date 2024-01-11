package com.manager;


import java.util.Date;
import java.util.Iterator;
import java.util.List;
import com.bean.Academy;
import com.bean.Course;




public class CourseManager {

	public static void addTwoCourse() {
		Course c1 = new Course(1, "Full Stack Java", new Date(3 / 10 / 2017), "java", 30000, "2 months");
		Course c2 = new Course(2, "Software Testing", new Date(4 / 10 / 2017), "Core java", 40000, "3 months");
		Course c3 = new Course(3, "Python", new Date(5 / 10 / 2017), "Sql", 40000, "5 months");
		Academy.courseList.add(c1);
		Academy.courseList.add(c2);
		Academy.courseList.add(c3);
		
	}

	public static void printCourses() {

		List<Course> courseList = Academy.courseList;
		for (Iterator<Course> iterator = courseList.iterator(); iterator.hasNext();) {
			Course course = (Course) iterator.next();
			System.out.println(course);
		}
	}

	public static void findCourseByID(int id, int max) {
	    
	    Iterator<Course> itr =Academy.courseList.iterator();
	    while(itr.hasNext()) {
	      
	      Course obj= itr.next();
	      if(obj.courseId==id) {
	        System.out.println(obj.course_name+" has : "+max+" Students");
	      }
	    }
	  }
}
