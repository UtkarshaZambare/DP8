package com.collectionGenerics;

public class TwoGen<T, V> {
	T obj1;
	V obj2;

	TwoGen(T o1, V o2) {
		obj1 = o1;
		obj2 = o2;
	}

	void showType() {
		System.out.println(obj1.getClass());
		System.out.println(obj2.getClass());
	}

	public static void main(String[] args) {
		TwoGen<Integer, String> obj = new TwoGen<Integer, String>(32, "Software");
		obj.showType();
	}

}
