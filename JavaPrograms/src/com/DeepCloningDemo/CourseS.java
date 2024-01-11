package com.DeepCloningDemo;

public class CourseS implements Cloneable{
	public String subject1;
	public String subject2;
	String subject3;

	public CourseS(String subject1, String subject2, String subject3) {
		super();
		this.subject1 = subject1;
		this.subject2 = subject2;
		this.subject3 = subject3;
	}

	@Override
	public String toString() {
		return "Course [subject1=" + subject1 + ", subject2=" + subject2 + ", subject3=" + subject3 + "]";
	}
	protected Object clone() throws CloneNotSupportedException
    {
        return super.clone();
    }

 

	


	public static void main(String[] args) {
		
	}

}
