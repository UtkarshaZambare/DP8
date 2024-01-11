package com.collectionTreeMap;

import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {
		TreeMap<Integer, String> tmap = new TreeMap<>();
		tmap.put(10, "Rima");
		tmap.put(14, "Vinod");
		tmap.put(15, "Rocky");
		tmap.put(13, "Rani");
		tmap.put(11, "Nima");

		System.out.println(tmap);

		NavigableSet<Integer> ni = tmap.descendingKeySet();
		System.out.println("By navigable set");
		for (int i : ni) {
			System.out.println(i + " : " + tmap.get(i));
		}
		System.out.println("By Navigable map");
		NavigableMap<Integer,String> nimap = tmap.descendingMap();
		System.out.println(nimap);
	}

}
