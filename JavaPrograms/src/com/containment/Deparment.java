package com.containment;

public class Deparment {

	private int id;
	private String Departmentname;
	Student student;

	Deparment() {
		student = new Student( );

	}

	Deparment(int id, String Departmentname, Student student) {
		this.id = id;
		this.Departmentname = Departmentname;
		this.student = student;
	}

	public void setData(int id) {
		this.id = id;
	}

	public void setData(String Departmentname) {
		this.Departmentname = Departmentname;
	}

	public int getId() { 
		return id;
	}

	public String getName() {
		return Departmentname;
	}
 
	public String toString() {
		return "Id=" + id +  "\n Departmentname  =" +  Departmentname +  "\n student" +student ;

	}

	public static void main(String[] args) {
		Deparment obj = new Deparment();
		
		Deparment obj1 = new Deparment(1, "Cs",new Student(203,"Neha")  );
		System.out.println(obj1);

	}

}
