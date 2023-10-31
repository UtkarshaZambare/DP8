package com.staticprograms;



public class Account {
	
	static int count =100;
	private int eid;
	private String ename;
	private String email;
	private double salary;
	
	Account()
	{
		this.eid = count ++;
	}
	
	public void DisplayData()
	{
		System.out.println("eid:"+eid+"ename:"+ename+"salary:"+salary);
	}
	public void setData( String nm,  double s) {
//		this.eid = e;
		this.ename = nm;
//		this.email = em;
		this.salary = s;
	}

//	public void display() {
//		System.out.println(eid);
//		System.out.println(ename);
//		System.out.println(email);
//		System.out.println(salary);
//	}

//	public void CompareSalary(Account otherEmployee) {
//        if (this.salary > otherEmployee.salary) {
//            System.out.println(this.ename + " has a higher salary than " + otherEmployee.ename);
//        } else if (this.salary < otherEmployee.salary) {
//            System.out.println(this.ename + " has a lower salary than " + otherEmployee.ename);
//        } else {
//            System.out.println(this.ename + " and " + otherEmployee.ename + " have the same salary.");
//        }
//    }

    public static void main(String[] args) {
//        Account employee1 = new Account();
//        employee1.setData(1, "John", "john@example.com", 50000.0);
//        
//       Account employee2 = new Account();
//        employee2.setData(2, "Alice", "alice@example.com", 55000.0);
//
//        employee1.display();
//        employee2.display();
//        
//        employee1.CompareSalary(employee2);
        
        Account obj1 = new Account();
        Account obj2 = new Account();
        Account obj3 = new Account();
      obj1.setData( "John",  50000);
      obj2.setData( "ohn",  50000);
      obj3.setData( "hn",  250000);
      obj1.DisplayData();
      obj2.DisplayData();
      obj3.DisplayData();
        
    }


}
