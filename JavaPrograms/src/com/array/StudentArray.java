package com.array;

public class StudentArray {
	
	Student student;
	
	public StudentArray(Student student) 
	{
		this.student=student;
	}

		
	
	

		
	public String toString() {
		return "StudentArray [student=" + student + "]";
	}





		public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student2 s1[] = new Student2[4];
		s1[0] = new Student2(7, " Ganesh ", 23, 78);
		s1[1] = new Student2(8, " Ganna ", 24, 82);
		s1[2] = new Student2(9, " Ganni ", 25, 90);
		s1[3] = new Student2(10, " Ganesh2 ", 26, 79);

		

	}

}
