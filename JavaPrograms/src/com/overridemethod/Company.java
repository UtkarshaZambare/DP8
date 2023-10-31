//2) WAP to create class company with method address. create class eBay which extends 
//company implement address() differently in eBay class.Here the method address ()
//has been overridden in child class.

package com.overridemethod;

public class Company {
	
	private String address;

	public Company() {
		
	}

	

	public String getAddress() {
		return address;
	}



	public void setAddress(String address) {
		this.address = address;
	}



	@Override
	public String toString() {
		return "Company [address=" + address + "]";
	}

	public static void main(String[] args) {
		Company obj = new Company();
		obj.setAddress("Dehli,Dehli");
		System.out.println(obj);

	}

}
