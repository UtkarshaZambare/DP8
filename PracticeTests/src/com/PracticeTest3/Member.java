package com.PracticeTest3;

public class Member {
	
	 private String Name;
	 private int Age;
	 private  long PhoneNumber;
	 private String Address;
	 private double Salary;
	 
	 public Member(String name, int age, long phoneNumber, String address, double salary) {
			super();
			Name = name;
			Age = age;
			PhoneNumber = phoneNumber;
			Address = address;
			Salary = salary;
		}


	@Override
	public String toString() {
		return "Member [Name=" + Name + ", Age=" + Age + ", PhoneNumber=" + PhoneNumber + ", Address=" + Address
				+ ", Salary=" + Salary + "]";
	}


	public String getName() {
		return Name;
	}


	public void setName(String name) {
		Name = name;
	}


	public int getAge() {
		return Age;
	}


	public void setAge(int age) {
		Age = age;
	}


	public long getPhoneNumber() {
		return PhoneNumber;
	}


	public void setPhoneNumber(long phoneNumber) {
		PhoneNumber = phoneNumber;
	}


	public String getAddress() {
		return Address;
	}


	public void setAddress(String address) {
		Address = address;
	}


	public double getSalary() {
		return Salary;
	}


	public void setSalary(double salary) {
		Salary = salary;
	}

	public void printSalary() {
        System.out.println("Salary: " + Salary);
    }
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
