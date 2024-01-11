package com.weeklytest3;

public class Person {

	private int id;
	private String name;
	private Vehicale vehicale;

	public Person() {

	}

	public Person(int id, String name, Vehicale vehicale) {
		this.id = id;
		this.name = name;
		this.vehicale = vehicale;

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
	}}
//	public Vehicale[] getV() {
//		return v;
//	}
//
//	public void setV(Vehicale[] v) {
//		this.v = v;
//	}
//
//	public static void main(String[] args) {
//		Vehicale v[] = new Vehicale[3];
//		
//		Vehicale v[0] = new Vehicale[1,"car"];
//		Vehicale v[1] = new Vehicale[2,"bike"];
//		Vehicale v[2] = new Vehicale[3,"Riksha"];
//		
//
//	}
//
//}
