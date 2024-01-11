package com.collectionArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

public class StudentArrayList {

	public static void main(String[] args) {
		ArrayList<Student> list=new ArrayList<>();
		ArrayList<Integer> l1=new ArrayList<>(Arrays.asList(78,56,90,70,78));
		list.add(new Student(1,"Pankaj",l1));
		ArrayList<Integer> l2=new ArrayList<>(Arrays.asList(87,89,90,71,65));
		list.add(new Student(5,"Utkarsha",l2));
		ArrayList<Integer> l3=new ArrayList<>(Arrays.asList(45,58,81,70,67));
		list.add(new Student(8,"Snehal",l3));
		ArrayList<Integer> l4=new ArrayList<>(Arrays.asList(78,56,90,70,78));
		list.add(new Student(2,"Ishawar",l4));
		ArrayList<Integer> l5=new ArrayList<>(Arrays.asList(89,82,90,56,72));
		list.add(new Student(9,"Yogesh",l5));

		Iterator<Student>itr=list.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.println("********************************************************");
		System.out.println("Sorting using Student name");
		
		Collections.sort(list);
		itr=list.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
	}
	





	}


