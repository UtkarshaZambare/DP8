package com.collectionStack;

import java.util.Iterator;
import java.util.Stack;

public class EmployeeStack {

	public static void main(String[] args) {
		Stack<Employee> st = new Stack<Employee>();
		
		st.push(new Employee(200, "Adarsh", 10000));
		st.push(new Employee(201, "Sudarshan", 54000));
		st.push(new Employee(203, "Abhishek", 89000));
		st.push(new Employee(202, "Maruti", 70000));
		st.push(new Employee(204, "Suraj", 30000));
		
		Iterator<Employee> itr = st.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("----------------------------------------------");
		while(!st.empty()) {
			System.out.println(st.pop());
		}
		System.out.println("----------------------------------------------");

		System.out.println(st.isEmpty());

	}

}
