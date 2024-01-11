package com.collectionMap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class PhoneMap {

	public static void main(String[] args) {
		
		ArrayList<PhoneDirectory>phone = new ArrayList<>();
		phone.add(new PhoneDirectory("Kajal Patil", new ArrayList<Long>(Arrays.asList(8574883738l,7463738982l))));
	    phone.add(new PhoneDirectory("Utkarsha Zambare", new ArrayList<Long>(Arrays.asList(6574764748l,8272647301l))));
	    phone.add(new PhoneDirectory("Suraj Rokade", new ArrayList<Long>(Arrays.asList(6747373831l,7564738399l))));
	    phone.add(new PhoneDirectory("Snehal Nalawade", new ArrayList<Long>(Arrays.asList(7463538934l,4645372829l))));
	    phone.add(new PhoneDirectory("Rohit Zambare", new ArrayList<Long>(Arrays.asList(6574839284l,9878684627l))));
	    phone.add(new PhoneDirectory("Subhangi Kolekar", new ArrayList<Long>(Arrays.asList(6457283792l,987658796l))));
	    phone.add(new PhoneDirectory("Maruti Tate", new ArrayList<Long>(Arrays.asList(9087484743l,9808764531l))));
	    
	    HashMap<String, ArrayList<PhoneDirectory>> map= new HashMap<String, ArrayList<PhoneDirectory>>();
	    
	    Iterator<PhoneDirectory> itr=phone.iterator();
	    while(itr.hasNext()) {
	      PhoneDirectory obj=itr.next();
	      if(map.containsKey(obj.getName())) {
	        ArrayList<PhoneDirectory> arr= map.get(obj.getName());
	        arr.add(obj);
	        map.put(obj.getName(), arr);  
	      }
	      else {
	        ArrayList<PhoneDirectory> arr1= new ArrayList<PhoneDirectory>();
	        arr1.add(obj);
	        map.put(obj.getName(), arr1);
	      }
	    }
	    
	    Set<String> set =map.keySet();
	    Iterator<String> itr1= set.iterator();
	    while(itr1.hasNext()) {
	      String pn=itr1.next();
	      System.out.print(pn+" ");
	      System.out.println(map.get(pn));
	      System.out.println("------------------------------------------------------");
	    }
	    
	    
	  
	  }

	}