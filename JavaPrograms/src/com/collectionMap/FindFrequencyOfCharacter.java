package com.collectionMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class FindFrequencyOfCharacter {

	public static void main(String[] args) {
		String str = "Utkarsha";
		
		HashMap<Character,Integer> map = new HashMap<>();
		
		char[]ch = str.toCharArray();
		for(char c:ch) 
		{
			if(map.containsKey(c)) 
			{
				int a = map.get(c);
				map.put(c, a+1);//map.get(c)+1;
			}
			else 
			{
				map.put(c, 1);
			}
		}

	    Set<Character> set = map.keySet();
	    Iterator<Character> itr= set.iterator();
	    while(itr.hasNext()) {
	    	Character c = itr.next();
	    	System.out.print(c+" ");
	    	System.out.println(map.get(c));
	    	System.out.println("__________________________");
	    }
	
	
	
	
	
	
	
	
	
	
	}

}
