package com.finaldemo;

public class WageEmployee extends Employee {
	
	
	double hrs, rate;

	 public WageEmployee() {
		System.out.println("I am in  default constructor");
		this.hrs=0;
		this.rate=0;
	}

	 public WageEmployee(int eid, String ename, double salary, MyDate joindate, double hrs, double rate) 
	 {
		super(eid,ename,salary,joindate);
		this.hrs = hrs;
		this.rate = rate;

	}
	
//	 public void setSalary(double s) {
//			super.setSalary(s);
//		}

	@Override
	public String toString() {
		return super.toString()+"\nWageEmployee [hrs=" + hrs + "\n rate=" + rate + "\n eid=" + eid + "\n ename=" + ename + "\n salary="
				+ salary + "\n joindate=" + joindate + "]";
	}

	public static void main(String[] args) {
		WageEmployee we=new WageEmployee(101,"Kanchan",20000,new MyDate(24,10,2023),50,25);
		
		System.out.println(we);


	}

}


	