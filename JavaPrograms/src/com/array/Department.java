//3.	Create class Dept(did, dname), class MyDate(day, month, year)
//a.	Class Employee(emp_id, emp_name, salary, date(object), dept(object)). 
//Create array of Employee and display the array elements.


package com.array;

public class Department {
	int dId;
	String dName;
	
	public Department(int dId,String dName) {
		
		this.dId=dId;
		this.dName=dName;
		
		
	}
	
	public boolean compareDepartment(Department dept) 
	{
		if(this.dName==dept.dName)
    		return true;
    	else
    		return false;
	}
	

	
	public String toString() {
		return "dId=" + dId + ", dName=" + dName ;
	}


	public static void main(String[] args) {
		Department obj =new Department(1, "Science");

	}

}
