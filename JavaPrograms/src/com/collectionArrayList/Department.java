package com.collectionArrayList;

public class Department {
	
	String Department_Name;
	int id;
	

	public Department(String department_Name, int id) {
		
		Department_Name = department_Name;
		this.id = id;
	}


	public String getDepartment_Name() {
		return Department_Name;
	}


	public void setDepartment_Name(String department_Name) {
		Department_Name = department_Name;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public static void main(String[] args) {
		

	}


	@Override
	public String toString() {
		return "Department [Department_Name=" + Department_Name + ", id=" + id + "]";
	}

}
