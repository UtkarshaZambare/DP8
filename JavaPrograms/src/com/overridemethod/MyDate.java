package com.overridemethod;

public class MyDate {
	
	int dd, mm, yy;

	@Override
	public String toString() {
		return "MyDate [dd=" + dd + ", mm=" + mm + ", yy=" + yy + "]";
	}
// equals method
	public boolean equals(Object obj) 
	{
		//Object obj = new MyDate();
		System.out.println("In equals");
		MyDate d = (MyDate)obj;
		if(this.dd==d.dd && this.mm==d.mm && this.yy==d.yy) 
		return true;
		else
			return false;
		
	}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		final int prime = 31;
		int result = 1;
		result = prime * result + dd;
		
		return result;
	}

	

	public MyDate() {
		System.out.println("Default constructor");
		dd = 17;
		mm = 10;
		yy = 23;
	}

	public MyDate(int d, int m, int y) {
		System.out.println("parameterized constructor");
		dd = d;
		mm = m;
		yy = y;
	}

	public void setData(int d, int y, int m) {
		dd = d;
		mm = m;
		yy = y;

	}
	

	public static void main(String[] args) {
		MyDate obj=new MyDate(26,10,2023);
		System.out.println(obj);
		
		System.out.println(obj.hashCode());
		MyDate obj1=new MyDate(26,10,2023);		
		System.out.println(obj1.hashCode());
		MyDate obj2=obj1;
		System.out.println(obj2.hashCode());
		System.out.println(obj.equals(obj1));
		
		

		
	}

}
