package com.constructor;

public class CompareObj {
	
	private int dd,mm,yy;
	
	public void add(int d,int m, int y) 
	{
		this.dd=d;
		this.mm=m;
		this.yy=y;
	}
	public void display() 
	{
		System.out.println("Date is:"+dd+"/"+mm+"/"+yy);
	}
	public void sum(CompareObj obj2) 
	{
		int dd = this.dd + obj2.dd;
		System.out.println(dd);
		mm = this.mm + obj2.mm;
		System.out.println(mm);
		yy = this.yy + obj2.yy;
		System.out.println(yy);
		
		
	}
	
	public static void main(String[] args) {
		CompareObj obj = new CompareObj();
		CompareObj obj1 = new CompareObj();
		obj.add (10,3,2023);
		obj1.add(23,7, 2023);
		
		obj.display();
		obj1.sum(obj1);
	}

}
