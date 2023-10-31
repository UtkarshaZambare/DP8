package com.containment;

public class Address {
	private String city;
	private String state;
	private String country;

	public Address(String city, String state, String country) {
		this.city = city;
		this.state = state;
		this.country = country;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
	
	
	public String toString() {
		return "city=" + city + "\n state=" + state + "\n country=" + country ;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
