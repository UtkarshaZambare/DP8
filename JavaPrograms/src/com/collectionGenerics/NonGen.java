package com.collectionGenerics;

public class NonGen {

	Object obj;

	NonGen() {
	}

	NonGen(Object o) {
		this.obj = o;
	}

	void showType() {
		System.out.println(obj.getClass());
	}

	Object getObj() {
		return obj;
	}

	public static void main(String[] args) {
		NonGen obj = new NonGen(45);
		obj.showType();
		System.out.println(obj.getObj());
		int i = (int) obj.getObj();
		NonGen obj1 = new NonGen("Java");
		obj1.showType();
     	String str=(String) obj1.getObj();
		obj = obj1;
		int v=(int) obj.getObj();

	}

}
	