package com.weeklytest2;

public class Job {
	
	 private int id;
	    private String role;
	    private double salary;

	    public Job(int id, String role, double salary) {
	        this.id = id;
	        this.role = role;
	        this.salary = salary;
	    }

		@Override
		public String toString() {
			return "Job [id=" + id + ", role=" + role + ", salary=" + salary + "]";
		}
	    
	    
	    }
	


