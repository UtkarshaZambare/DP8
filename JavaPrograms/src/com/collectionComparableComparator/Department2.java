package com.collectionComparableComparator;

public class Department2 {
	int did;
	String dname;
	String location;

	public Department2(int did, String dname, String location) {

		this.did = did;
		this.dname = dname;
		this.location = location;

	}

	public String toString() {
		return "Department2 [did=" + did + ", dname=" + dname + ", location=" + location + "]";
	}

	public String getloction() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public int getDid() {
		return did;
	}

	public void setDid(int did) {
		this.did = did;
	}

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	public static void main(String[] args) {

	}

}
