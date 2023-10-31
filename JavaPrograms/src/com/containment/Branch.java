package com.containment;

public class Branch {
	private int brid;
	private String brname;
	
	Branch()
	{
		
	}
	Branch(int brid,String brname)
	{
		this.brid=brid;
		this.brname=brname;
	}
	
	public void setBrid(int brid) 
	{
		this.brid = brid;
		
	}
	
	public void setName(String brname) 
	{
		this.brname = brname;
		
	}
	
	public int getBrid() 
	{
		return brid;
	}
	public String getBrname() 
	{
		return brname;
	}
	public String toString() 
	{
		return "brid:" +brid+ "\n brname:" +brname;
	}



	public static void main(String[] args) {
		Branch b = new Branch(101,"Civil");
		System.out.println(b);

	}

}
