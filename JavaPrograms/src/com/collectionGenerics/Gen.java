package com.collectionGenerics;

class Gen<E>
{
	E obj;
	Gen(E o)
	{
		obj=o;
	}
	E getObject()
	{
		return obj;
	}
    public static void main(String a[])
	{
		Gen<Integer> obj=new Gen<Integer>(10);
		Integer  i=obj.getObject();
		System.out.println(i);

		Gen<String>obj1=new Gen<String>("Java");
		String str=obj1.getObject();
		System.out.println(str);

//		obj=obj1; //compile time error
	}
}
