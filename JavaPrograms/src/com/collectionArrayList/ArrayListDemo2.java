package com.collectionArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class ArrayListDemo2 {

	public static void main(String[] args) {
//		ArrayList<Integer> l1 = new ArrayList<>();
//		l1.add(11);
//		l1.add(12);
//		l1.add(11);
//		l1.add(1);
//		l1.add(4);
//
//		Object []arr =l1.toArray();
//		Integer arr1[] =l1.toArray(new Integer[l1.size()]);
//		System.out.println(l1);
//		
//	    int sum=0;
//		for(int i=0; i<l1.size(); i++)
//		{
//			System.out.print(l1.get(i)+" ");
//			sum=sum+l1.get(i);
//		}
//		System.out.println(sum);
////		for(int i:l1) 
////		{
////			System.out.println(l1.get(i)+"");
////			
////		}
//		Iterator<Integer> itr = l1.iterator();
//		 sum=0;
//		while(itr.hasNext()) 
//		{
//			System.out.print(itr.next()+"");
//			sum=sum+itr.next();
//			
//		}
//		System.out.println(sum);
		ArrayList<Integer> l1=new ArrayList<>();
		l1.add(11);
		l1.add(12);
		l1.add(11);
		l1.add(1);
		l1.add(4);
		
	    Integer[] arr=(Integer[]) l1.toArray();
	
		System.out.println(l1);
		int sum=0;
		//1
		for(int i=0; i<l1.size(); i++)
		{
			System.out.print(l1.get(i)+" ");
			sum=sum+l1.get(i);
		}
		System.out.println(sum);
		sum=0;
		System.out.println();
		System.out.println("___________________________");
		//2
		for(int i:l1)
		{
			System.out.print(i+ " ");
			sum=sum+i;
		}
		System.out.println(sum);
		sum=0;
		// 3 Iterator
		
		/* itr= {1,2,3,4,5}*/
		Iterator<Integer> itr=l1.iterator();
		while(itr.hasNext())
		{
			
			//System.out.print(itr.next()+" ");
			sum=sum+itr.next();
		}
		System.out.println(sum);
		
		//ArrayList<Integer> l=(ArrayList<Integer>) Arrays.asList(1,2,3,4,5,6);
		
		
	}

}
