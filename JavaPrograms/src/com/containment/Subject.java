package com.containment;

public class Subject {
	private int subid;
	private String subname;
	
	Subject()
	{
		
	}
	Subject(int subid,String subname)
	{
		this.subid=subid;
		this.subname=subname;
	}
	
	public void setSubid(int subid) 
	{
		this.subid = subid;
		
	}
	
	public void setName(String subname) 
	{
		this.subname = subname;
		
	}
	
	public int getSubid() 
	{
		return subid;
	}
	public String getSubname() 
	{
		return subname;
	}
	public String toString() 
	{
		return "subid:" +subid+ "\n subname:" +subname;
	}



	public static void main(String[] args) {
		Subject sb = new Subject(2,"Java");
		System.out.println(sb);

	}

}
