package com.testpaper1;

public class StudentList {

	public static void main(String[] args) {
		Student std [] = new Student[3];
		std[0] = new Student(1, "Rohit", new int[]{85, 90, 75}, 0);
		std[1] = new Student(2, "Shyam", new int[]{78, 80, 80}, 0);
		std[2] = new Student(3, "Neha", new int[]{95, 88, 72}, 0);
		
		for(int i=0; i<std.length-1; i++) {
			for(int j=i+1; j<std.length; j++) {
				if(std[i].getPer()<std[j].getPer()) {
					Student temp = std[i];
					std[i]=std[j];
					std[j]=temp;
				}
			}
		}
      System.out.println("Sorted Students in decending order");
      for(Student students: std) {
    	  System.out.println(students);
      }
      
	}

}
