package com.collectionArrayList;

import java.util.ArrayList;

public class RemoveDaysOfWeek {

	public static void main(String[] args) {
	ArrayList<String> daysOfweek = new ArrayList<>();
	
	
	daysOfweek.add("Monday");
    daysOfweek.add("Tuesday");
    daysOfweek.add("Wednesday");
    daysOfweek.add("Thursday");
    daysOfweek.add("Friday");
    daysOfweek.add("Saturday");
    daysOfweek.add("Sunday");
    System.out.println("Days of the week before removal: " + daysOfweek);
    for(int i =0; i<daysOfweek.size(); i++) 
    {
    	if(daysOfweek.get(i).length() > 7) 
    	{
    		
    		 daysOfweek.remove(i);
    		 i--;
    	}
    	
    }
    System.out.println("Days of the week after removal: " + daysOfweek);
	}

}
