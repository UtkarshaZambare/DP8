package com.ShallowCloningDemo;

class Student implements Cloneable {

	int id;
	String name;
	Course course;

	public Student(int id, String name, Course course) {
		this.id = id;
		this.name = name;
		this.course = course;
	}

	@Override
	protected Student clone() throws CloneNotSupportedException {

		return (Student) super.clone();
	}
	


@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", course=" + course + "]";
	}

public static void main(String[] args) {
	Course science = new Course("Physics", "Chemistry", "Maths");

	Student student1 = new Student(111, "John", science);

	Student student2 = null;

	try {
		
		student2 = student1.clone();
	} catch (CloneNotSupportedException e) {
		e.printStackTrace();
	}

	System.out.println(student2); 
	System.out.println(student1);
	

	student2.course.subject3 = "English";

	

	System.out.println(student1.course.subject3); 
	
//	System.out.println(student2); 
//	System.out.println(student1);

}
}
