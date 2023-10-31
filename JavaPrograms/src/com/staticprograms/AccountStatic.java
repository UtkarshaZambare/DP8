package com.staticprograms;

public class AccountStatic {
	
	int accNo,n,p;
	double si;
	String name;
	
	public  void setData(int ac,int num,int principle,String nam) 
	{
		accNo= ac;
		n=num;
		p=principle;
		name =nam;
	}
	public static float interestrate;
	static
	{
		interestrate=5;
	}
	
	public static void interest(float rate) 
	{
		interestrate=rate;
	}
	public void calculteInterest() 
	{
		si = n*p*interestrate/100;
	}
	public void display() 
	{
		System.out.println("Account no="+accNo);
		System.out.println("Number of year="+n);
		System.out.println("principle="+p);
		System.out.println("Name="+name);
		System.out.println("Rate="+interestrate);
		System.out.println("SI="+si);
		
	}

	public static void main(String[] args) {
		AccountStatic obj = new AccountStatic();
		obj.setData(203456,5,300,"Utkarsha");
		obj.calculteInterest();
		obj.display();

	}

}
