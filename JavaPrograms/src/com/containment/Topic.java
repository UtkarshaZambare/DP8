package com.containment;

public class Topic {
	private int tid;
	private String tname;
	
	Topic()
	{
		
	}
	Topic(int tid,String tname)
	{
		this.tid=tid;
		this.tname=tname;
	}
	
	public void setTid(int tid) 
	{
		this.tid = tid;
		
	}
	
	public void setName(String tname) 
	{
		this.tname = tname;
		
	}
	
	public int getTid() 
	{
		return tid;
	}
	public String getTname() 
	{
		return tname;
	}
	public String toString() 
	{
		return "tid:" +tid+ "\n tname:" +tname;
	}



	public static void main(String[] args) {
		
		Topic t = new Topic(5,"Array");
		System .out.println(t);
		

	}

}
