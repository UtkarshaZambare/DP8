package com.weeklytest6;

public class Student {

	 private int id;
	 private String name;
	 private String degree;
	 private int passingyear;
	 private boolean palced;
	
	 public Student(int id, String name, String degree, int passingyear, boolean palced) {
		super();
		this.id = id;
		this.name = name;
		this.degree = degree;
		this.passingyear = passingyear;
		this.palced = palced;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDegree() {
		return degree;
	}

	public void setDegree(String degree) {
		this.degree = degree;
	}

	public int getPassingyear() {
		return passingyear;
	}

	public void setPassingyear(int passingyear) {
		this.passingyear = passingyear;
	}

	public boolean isPalced() {
		return palced;
	}

	public void setPalced(boolean palced) {
		this.palced = palced;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", degree=" + degree + ", passingyear=" + passingyear
				+ ", palced=" + palced + "]";
	}
	
	


	 
	 
	 
}
