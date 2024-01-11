package com.weeklytest6;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class StudentHashSet {

	public static void main(String[] args) {

		HashSet<Student> set = new HashSet<>();

		set.add(new Student(1, "John", "Engineering", 2022, true));
		set.add(new Student(2, "Alice", "Computer Science", 2021, false));
		set.add(new Student(3, "Bob", "Mathematics", 2023, true));
		set.add(new Student(6, "Jiya", "Bsc", 2022, true));
		set.add(new Student(1, "Niya", "Mca", 2022, false));
		set.add(new Student(1, "Moan", "Pharmacy", 2022, true));

		ArrayList<Student> placedStudents = new ArrayList<>();
		ArrayList<Student> unplacedStudents = new ArrayList<>();

		Iterator<Student> itr = set.iterator();
		while (itr.hasNext()) {
			Student cs = itr.next();
			if (cs.isPalced()) {
				placedStudents.add(cs);
			} else {
				unplacedStudents.add(cs);
			}
			itr.remove();

		}
		System.out.println("placed students");
		for (Student plstd : placedStudents) {
			System.out.println(plstd.getName());
		}
		System.out.println("__________________________________________________");
		System.out.println("unplaced students");

		for (Student unplstd : unplacedStudents) {
			System.out.println(unplstd.getName());
		}
		
		 System.out.println("\nRemaining students in HashSet: " + set.size());

	}

}
