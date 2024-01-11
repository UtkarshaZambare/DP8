package com.collectionArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

//   Create arraylist of characters. Remove duplicate characters from the list. E.g. list –
//{ ‘d’ , ‘g’ , ‘h’ , ‘d’ , ‘d’ . ‘h’ , ‘g’}Output should be {‘d’ , ‘g’ , ‘h’}
public class RemoveDuplicateChar {

	public static void main(String[] args) {
	ArrayList<Character> arrChar= new ArrayList <>(Arrays.asList('G','E','H','P','E','H'));
	System.out.println(arrChar);
	
	ArrayList<Character>ch =new ArrayList<Character>();
	Iterator<Character>itr= arrChar.iterator();
	while(itr.hasNext()) {
		Character ss = itr.next();
		
		if(!ch.contains(ss)) {
		ch.add(ss);
		}
	}
	System.out.println(ch);
	}

}
