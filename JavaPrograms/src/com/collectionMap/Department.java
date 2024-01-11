package com.collectionMap;

public class Department {
	int did;
	String dname;
	String location;
	public Department(int did, String dname, String location) {
		super();
		this.did = did;
		this.dname = dname;
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
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	@Override
	public String toString() {
		return "Department \n did=" + did + ", dname=" + dname + ", location=" + location;
	}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return did;
	}
	@Override
	public boolean equals(Object obj) {
		Department d = (Department) obj;
		if(this.did==d.did)
			return true;
		else
			return false;
	}
	

	

}
