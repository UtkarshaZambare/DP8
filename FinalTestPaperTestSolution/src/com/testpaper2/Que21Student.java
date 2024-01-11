package com.testpaper2;

public class Que21Student implements Comparable<Que21Student>{

	private int id;
	private String name;
	private int marks;

	public Que21Student(int id, String name, int marks) {

		this.id = id;
		this.name = name;
		this.marks = marks;

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

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "id=" + id + ", " + (name != null ? "name=" + name + ", " : "") + "marks=" + marks + " ";
	}

	

	@Override
	public int compareTo(Que21Student o) {
		int marksComparison = Integer.compare( o.getMarks(),this.getMarks());
		if (marksComparison == 0) {
            return this.name.compareTo(o.name);
        }

        return marksComparison;
	}
    
	
}
