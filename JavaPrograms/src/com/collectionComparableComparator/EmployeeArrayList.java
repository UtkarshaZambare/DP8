package com.collectionComparableComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

import com.containment.Deparment;

public class EmployeeArrayList {
	
	
	public static void main(String[] args) {
		ArrayList<Employee> list = new ArrayList<>();
		list.add(new Employee(11, "Rima", 45000, 23, new Department2(104, "Development", "Pune")));
	    list.add(new Employee(15, "Sima", 40000, 30, new Department2(103, "Testing", "Mumbai")));
		list.add(new Employee(14, "Nima", 42000, 37, new Department2(107, "Hr", "Dehli")));
		list.add(new Employee(17, "Gita", 40000, 45, new Department2(108, "Account", "Kolkata")));
		list.add(new Employee(13, "Piya", 60000, 25, new Department2(105, "Finance", "Bengluru")));
		list.add(new Employee(12, "Tina", 70000, 31, new Department2(106, "Development", "Pune")));
		list.add(new Employee(16, "Gita", 470000,30, new Department2(101, "Sql", "Punjab")));

		System.out.println(list);
		System.out.println("********************************************************************************************************************************************");

		// Sort by id
		System.out.println("\n Sort by id");
		Collections.sort(list);
		System.out.println(list);
		
		System.out.println("********************************************************************************************************************************************");
		System.out.println("\n Sort by id in decending order");
		Collections.reverse(list);

		System.out.println(list);
		// Sort by location
		System.out.println("********************************************************************************************************************************************");
		System.out.println("\n by location");
		Location l = new Location();
		Collections.sort(list, l);
		System.out.println(list);

		System.out.println("********************************************************************************************************************************************");
		System.out.println("\n by name");
		CompareByName n = new CompareByName();
		Collections.sort(list, n);
		System.out.println(list);
		System.out.println("********************************************************************************************************************************************");

		System.out.println("\n Sort by age");
		ByAge b=new ByAge();
		Collections.sort(list,b);
		System.out.println(list);

		System.out.println("********************************************************************************************************************************************");

	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter name of department : ");
	    String str = sc.next();
	    double max =0;
	    Employee e1=null;
	    for(int i=0;i<list.size();i++) {
	    	if(list.get(i).dpt.dname.equals(str)) {
	    		if(list.get(i).salary>max) {
	    			max=list.get(i).getSalary();
	    			e1=list.get(i);
	    		}
	    	}
	    }
	    System.out.println(max+" is a Higehst salary in "+str+ " Department");
	    System.out.println(e1);
	    	
		System.out.println("********************************************************************************************************************************************");
	    
	    System.out.println("\n Sort by name starts with letter");
	    System.out.println("Enter letter : ");
	    String letter = sc.next();
	    for(Employee e: list) 
	    {
	    	if(e.getEname().startsWith(letter)) 
	    	{
	    		System.out.println(e);
	    	}
	    }
		System.out.println("********************************************************************************************************************************************");

	    System.out.println("\n Sort by same location");
	    System.out.println("Enter any Location : ");
	    String location = sc.next();
	    
	    for(Employee e: list) 
	    {
	    	if(e.getDpt().location.equals(location))
	    		System.out.println(e);
	    }
	}
		
		
}
