//Design  class Job with following fields (  id, Role, salary) [2M]
//Design class Person with following fields (id, name, mobile, Job )
//Relation-Person has a job .Write a program to create 2 person objects
// (by constructor).


package com.weeklytest2;

public class Person {
	
	private int id;
    private String name;
    private String mobile;
    private Job job;

    public Person(int id, String name, String mobile, Job job) {
        this.id = id;
        this.name = name;
        this.mobile = mobile;
        this.job = job;
    }




    @Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", mobile=" + mobile + ", job=" + job + "]";
	}




	public static void main(String[] args) {
        Job job1 = new Job(1, "Software Engineer", 75000);
        Job job2 = new Job(2, "Data Analyst", 60000);

        Person person1 = new Person(101, "Alice", "123-456-7890", job1);
        Person person2 = new Person(102, "Bob", "987-654-3210", job2);

        System.out.println(person1);
        System.out.println(person2);
    }
}






