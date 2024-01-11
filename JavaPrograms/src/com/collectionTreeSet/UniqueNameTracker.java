package com.collectionTreeSet;

import java.util.Iterator;

import java.util.TreeSet;

public class UniqueNameTracker {

	TreeSet<String> names = new TreeSet<>();
	{

		names.add("Asavari");
		names.add("Rohit");
		names.add("Akashy");
		names.add("Sumit");
		names.add("Namrta");
		names.add("Piya");
		names.add("Mona");
	}

	public void addName(String str) {
		if (!this.names.contains(str)) {
			this.names.add(str);
			Iterator<String> itr = this.names.iterator();
			while (itr.hasNext()) {
				System.out.println(itr.next());
			}
		} else
			System.out.println("Name is already  exist we cannot add duplicate");
	}

	public void show() {
		Iterator<String> itr = this.names.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

	public void removeName(String str) {
		if (this.names.contains(str)) {
			this.names.remove(str);
			Iterator<String> itr = this.names.iterator();
			while (itr.hasNext()) {
				System.out.println(itr.next());
			}
		} else
			System.out.println("Name is not exist to remove");
	}

	public void checkName(String str) 
	{
		if(this.names.contains(str)) 
		{
			System.out.println("The Name"+str+"is exist");
		}
		else
			System.out.println("Name is Not Exist");
	}
}
