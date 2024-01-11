/*There are two classes Person and student Student inherits all the properties of Person person has firstname,lastname,id.[1M]
A Student class constructor, which has  parameters:
1.	A string firstname .
2.	A string lastname .
3.	An integer id .
4.	An integer array (or vector) of test scores
A char calculate() method that calculates a Student object’s average and returns the grade character representative of their calculated average

 * 
 * */

package com.testpaper2;

public class Que15Person {
	
	private String firstname;
	private String lastname;
	private int id;
	
	public Que15Person(String firstname, String lastname, int id) {
		
		this.firstname = firstname;
		this.lastname = lastname;
		this.id = id;
		
		
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Que15Prrson [" + (firstname != null ? "firstname=" + firstname + ", " : "")
				+ (lastname != null ? "lastname=" + lastname + ", " : "") + "id=" + id + "]";
	}
	
	
	

}
