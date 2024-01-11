package com.collectionMap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class StudentArrayList {

	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<Integer>(Arrays.asList(78, 56, 90, 45, 88));
		Student2 obj = new Student2(1, "Pranali", arr);
		System.out.println(obj);
		ArrayList<Integer> arr1 = new ArrayList<Integer>(Arrays.asList(78, 69, 97, 78, 88));
		Student2 obj1 = new Student2(2, "Manali", arr1);
		System.out.println(obj1);
		ArrayList<Integer> arr2 = new ArrayList<Integer>(Arrays.asList(90, 78, 40, 67, 77));
		Student2 obj2 = new Student2(3, "Sonali", arr2);
		System.out.println(obj2);
		ArrayList<Integer> arr3 = new ArrayList<Integer>(Arrays.asList(87, 90, 76, 72, 68));
		Student2 obj3 = new Student2(4, "Anand", arr3);
		System.out.println(obj3);
		ArrayList<Integer> arr4 = new ArrayList<Integer>(Arrays.asList(88, 76, 88, 92, 66));
		Student2 obj4 = new Student2(5, "Nilam", arr4);
		System.out.println(obj4);

		ArrayList<Student2> arrlist = new ArrayList<>();
		arrlist.add(obj);
		arrlist.add(obj2);
		arrlist.add(obj3);
		arrlist.add(obj4);
		arrlist.add(obj1);
     System.out.println("__________________________________________________________________________________________________________________________________________________");
		HashMap<String, ArrayList<Student2>> map = new HashMap<>();

		Iterator<Student2> itr = arrlist.iterator();
		while (itr.hasNext()) {
			Student2 std = itr.next();
			if (map.containsKey(std.grade())) {
				ArrayList<Student2> list = map.get(std.grade());
				list.add(std);
				map.put(std.grade(), list);
			} else {
				ArrayList<Student2> a = new ArrayList<Student2>();
				a.add(std);
				map.put(std.grade(), a);
			}
		}
		Set<String> set = map.keySet();
		Iterator<String> itr1 = set.iterator();
		while (itr1.hasNext()) {
			String s = itr1.next();
			System.out.print(s+" ");
			System.out.println(map.get(s));

			System.out.println("---------------------------------------------------");
		}

	}

}
