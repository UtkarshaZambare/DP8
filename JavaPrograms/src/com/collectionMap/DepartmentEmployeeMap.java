package com.collectionMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class DepartmentEmployeeMap {

	public static double findMAxSalary(List<Employee> elist)

	{
		double maxSalary = 0;
		// int a=0;
		for (int i = 0; i < elist.size(); i++) {
			if (elist.get(i).salary > maxSalary) {
				maxSalary = elist.get(i).salary;
				// a=i;
			}
		}
		// System.out.println(maxSalary+"\t" + elist.get(a));
		return maxSalary;
	}

	public static void main(String[] args) {

		HashMap<Department, ArrayList<Employee>> map = new HashMap<>();
		ArrayList<Employee> elist = new ArrayList<>();

		elist.add(new Employee(100, "Radhika", 23000, 12));
		elist.add(new Employee(101, "Komal", 43000, 12));
		elist.add(new Employee(102, "Sanika", 56000, 12));
		elist.add(new Employee(103, "Sarika", 72000, 12));
		elist.add(new Employee(104, "Pooja", 60000, 12));
		map.put(new Department(12, "Testing", "Pune"), elist);

		ArrayList<Employee> elist1 = new ArrayList<>();
		elist1.add(new Employee(201, "Sima", 67000, 13));
		elist1.add(new Employee(202, "Prem", 45000, 13));
		elist1.add(new Employee(203, "Abhi", 89000, 13));
		map.put(new Department(13, "IT", "Mumbai"), elist1);

		ArrayList<Employee> elist2 = new ArrayList<>();
		elist2.add(new Employee(301, "Vina", 23000, 14));
		elist2.add(new Employee(302, "Hina", 43000, 14));
		elist2.add(new Employee(303, "Tina", 56000, 14));
		map.put(new Department(14, "Finance", "Pune"), elist2);

		ArrayList<Employee> elist3 = new ArrayList<>();
		elist3.add(new Employee(401, "Ganesh", 34000, 15));
		elist3.add(new Employee(402, "Sana", 70000, 15));
		elist3.add(new Employee(403, "Isha", 78000, 15));
		map.put(new Department(15, "Marketing", "Nagpur"), elist3);

		ArrayList<Employee> elist4 = new ArrayList<>();
		elist4.add(new Employee(501, "Adarsh", 65000, 16));
		elist4.add(new Employee(502, "Suraj", 69000, 16));
		elist4.add(new Employee(503, "Neema", 55000, 16));
		map.put(new Department(16, "HR", "Bengluru"), elist4);

		// 1.Display all department wise employee
		System.out.println("\n Department Wise Employee \n");

		Set<Entry<Department, ArrayList<Employee>>> set = map.entrySet();
		Iterator<Entry<Department, ArrayList<Employee>>> itr = set.iterator();
		while (itr.hasNext()) {
			Entry<Department, ArrayList<Employee>> ele = itr.next();
			Department obj = ele.getKey();
			System.out.println(obj.getDid() + " " + obj.dname);
			ArrayList<Employee> arr = ele.getValue();
			Iterator<Employee> itr1 = arr.iterator();
			while (itr1.hasNext()) {
				System.out.println(itr1.next());
			}
			System.out.println();
		}
		// 2.Find maximum salary with emp details in all department
		itr = set.iterator();
		while (itr.hasNext()) {
			Entry<Department, ArrayList<Employee>> e = itr.next();
			Department obj = e.getKey();
			System.out.println(obj.did + " " + obj.dname);
			ArrayList<Employee> list = e.getValue();
			Employee e1 = null;
			double max = 0;
			Iterator<Employee> etr = list.iterator();
			while (etr.hasNext()) {
				Employee ob = etr.next();
				if (ob.getSalary() > max) {
					max = ob.getSalary();
					e1 = ob;
				}
			}
			System.out.println("Maximum Salary is: " + max + " of employee " + e1);
		}
		System.out.println();

		// 3.display all the employee from department who has having salary less than 70k
		System.out.println("salary less than 70k");
		itr = set.iterator();
		while (itr.hasNext()) {
			Entry<Department, ArrayList<Employee>> e = itr.next();
			Department obj = e.getKey();
			if (obj.getDname().equals("IT")) {
				System.out.println(obj.did + " " + obj.dname);
				Iterator<Employee> ir = e.getValue().iterator();
				while (ir.hasNext()) {
					Employee ob1 = ir.next();
					if (ob1.getSalary() < 70000) {
						System.out.println(ob1);
					}
				}
				// System.out.println();
			}
		}
		System.out.println("----------------------------------------------");

		// 4.give department details in which maximum number of employee working

		System.out.println("Department having maximum employee");
		itr = set.iterator();
		int max = 0;
		Department obj = null;
		while (itr.hasNext()) {
			Entry<Department, ArrayList<Employee>> e = itr.next();
			int count = 0;
			Iterator<Employee> etr = e.getValue().iterator();
			while (etr.hasNext()) {
				Employee e2 = etr.next();
				if (e2.getDid() > count) {
					count++;

				}
			}
			if (count > max) {
				max = count;
				obj = e.getKey();
			}
		}
		System.out.println(" Maximum " + max + " Employee work in " + obj);
		System.out.println("-------------------------------------------------");

	// 5. Add employee in testing department
		itr = set.iterator();
		while (itr.hasNext()) {
			Entry<Department, ArrayList<Employee>> e = itr.next();
			Department o = e.getKey();
			if (o.getDname().equals("Testing")) {
				ArrayList<Employee> list = e.getValue();
				Employee e1 = new Employee(245, "Nitin", 680000, 12);
				list.add(e1);
				map.put(o, list);

			}
		}
		itr = set.iterator();
		while (itr.hasNext()) {
			Entry<Department, ArrayList<Employee>> ele = itr.next();
			Department obj1 = ele.getKey();
			System.out.println(obj1.getDid() + " " + obj1.dname);
			ArrayList<Employee> arr = ele.getValue();
			Iterator<Employee> itr1 = arr.iterator();
			while (itr1.hasNext()) {
				System.out.println(itr1.next());
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("--------------------------------------------------------");

	//6. Find employee by given location
		System.out.println("Employee from given location------------");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the location");
		String location = sc.next();
		itr = set.iterator();
		while (itr.hasNext()) {
			Entry<Department, ArrayList<Employee>> arr = itr.next();
			Department obj2 = arr.getKey();
			if (obj2.getLocation().equals(location)) {
				ArrayList<Employee> brr = arr.getValue();
				Iterator<Employee> itr2 = brr.iterator();
				while (itr2.hasNext()) {
					System.out.println(itr2.next());
				}

				sc.close();
			}
		}

	}
}
