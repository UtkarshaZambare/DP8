package com.DeepCloningDemo;

public class Student implements Cloneable {
	
	int id;
	String name;
	CourseS course;

	public Student(int id, String name, CourseS course) {
		this.id = id;
		this.name = name;
		this.course = course;
	}
  @Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", course=" + course + "]";
	}
 //Overriding clone() method to create a deep copy of an object.
 
    protected Object clone() throws CloneNotSupportedException
    {
        Student student = (Student) super.clone();
 
        student.course = (CourseS) course.clone();
 
        return student;
    }

 


    public static void main(String[] args)
    {
        CourseS science = new CourseS("Physics", "Chemistry", "Biology");
 
        Student student1 = new Student(111, "John", science);
 
        Student student2 = null;
 
        try
        {
            //Creating a clone of student1 and assigning it to student2
 
            student2 = (Student) student1.clone();
        }
        catch (CloneNotSupportedException e)
        {
            e.printStackTrace();
        }
 
        //Printing the subject3 of 'student1'
 
        System.out.println(student1.course.subject3);         //Output : Biology
 
        //Changing the subject3 of 'student2'
 
        student2.course.subject3 = "Maths";
 
        //This change will not be reflected in original student 'student1'
 
        System.out.println(student1.course.subject3);       //Output : Biology
    }
}

