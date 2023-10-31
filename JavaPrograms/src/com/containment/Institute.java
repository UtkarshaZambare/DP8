package com.containment;

public class Institute {
	private int inid;
	private String inname;
	Branch branch;
	Subject subject;
	Topic topic;
	SubTopic subtopic;
	Question question;

	Institute() {
		branch = new Branch();
		subject = new Subject();
		topic = new Topic();
		subtopic = new SubTopic();
		question = new Question();

	}

//	Institute(int inid, String inname, Branch branch, Subject subject,Topic topic,SubTopic subtopic,Question question ) {
//		this.inid = inid;
//		this.inname = inname;
//		this .branch=branch;
//		this.subject=subject;
//		this.topic=topic;
//		this.subtopic=subtopic;
//		this.question=question;
//		
//	}

	public Institute(int inid, String inname, Branch branch, Subject subject,Topic topic,SubTopic subtopic,Question question ) {
		this.inid = inid;
		this.inname = inname;
		this .branch=branch;
		this.subject=subject;
		this.topic=topic;
		this.subtopic=subtopic;
		this.question=question;
	}

	public void setInid(int inid) {
		this.inid = inid;

	}

	public void setName(String name, String inname) {
		this.inname = inname;

	}

	public int getInid() {
		return inid;
	}

	public String getInname() {
		return inname;
	}

	public String toString() {
		return "inid:" + inid + "\n inname:" + inname + "\n branch" + branch + "\n subject:" +subject+ "\n topic:" +topic+ "\n subtopic:" +subtopic+ "question:" +question;
	}

	public static void main(String[] args) {
    
		
		
		
		

	}

}
