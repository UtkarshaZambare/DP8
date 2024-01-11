package com.practiceTest1;

public class Question2 {

	public static void main(String[] args) {
		 double sale = 22000;
		   double incentive = 
			    	(sale >= 50000) ? sale*0.10 :
			        (sale >= 30000 )? sale*0.08 :
			        (sale >= 10000) ? sale*0.05 : 0;
		  System.out.println("Incentive earned is : "+ incentive);

	}

}
