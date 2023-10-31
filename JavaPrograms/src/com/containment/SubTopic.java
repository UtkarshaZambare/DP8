package com.containment;

public class SubTopic {
	
	private int sid;
	private String sname;
	
	SubTopic()
	{
		
	}
	SubTopic(int sid,String sname)
	{
		this.sid=sid;
		this.sname=sname;
	}
	
	public void setSid(int sid) 
	{
		this.sid = sid;
		
	}
	
	public void setName(String name) 
	{
		this.sname = sname;
		
	}
	
	public int getSid() 
	{
		return sid;
	}
	public String getSname() 
	{
		return sname;
	}
	public String toString() 
	{
		return "sid:" +sid+ "\n sname:" +sname;
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SubTopic st=new SubTopic(3,"Array object");
		System.out.println(st);
		
		
	}

}
