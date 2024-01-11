package com.MasterAssignment;

public class StartDate {
	
	private String subject;
	private  double fees;
	private int duration;
	private Date d;
	
	public StartDate(String subject, double fees, int duration, Date d) {
		super();
		this.subject = subject;
		this.fees = fees;
		this.duration = duration;
		this.d = d;
	}

	@Override
	public String toString() {
		return "StartDate [subject=" + subject + ", fees=" + fees + ", duration=" + duration + ", d=" + d + "]";
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public double getFees() {
		return fees;
	}

	public void setFees(double fees) {
		this.fees = fees;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public Date getD() {
		return d;
	}

	public void setD(Date d) {
		this.d = d;
	}
	
	
	

}
