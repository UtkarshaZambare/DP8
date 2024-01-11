package com.collectionMap;

import java.util.ArrayList;

public class PhoneDirectory {

	private String name;
	private ArrayList<Long> phoneNo;
	
	
	
	
	public PhoneDirectory(String name, ArrayList<Long> phoneNo) {
		super();
		this.name = name;
		this.phoneNo = phoneNo;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public ArrayList<Long> getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(ArrayList<Long> phoneNo) {
		this.phoneNo = phoneNo;
	}


	@Override
	public String toString() {
		return "PhoneDirectory [name=" + name + ", phoneNo=" + phoneNo + "]";
	}
	
	
	
	
}
