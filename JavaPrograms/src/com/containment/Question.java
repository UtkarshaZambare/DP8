package com.containment;

public class Question {
	
	private int qid;
	private String qname;
	
	Question()
	{
		
	}
	Question(int qid,String qname)
	{
		this.qid=qid;
		this.qname=qname;
	}
	
	public void setQid(int qid) 
	{
		this.qid = qid;
		
	}
	
	public void setName(String name) 
	{
		this.qname = qname;
		
	}
	
	public int getQid() 
	{
		return qid;
	}
	public String getQname() 
	{
		return qname;
	}
	public String toString() 
	{
		return "qid:" +qid+ "\n qname:" +qname;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Question q = new Question(10,"mcq");
		System.out.println(q);
		
	}

}
