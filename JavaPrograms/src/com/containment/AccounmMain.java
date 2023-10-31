package com.containment;

public class AccounmMain {

	public static void main(String[] args) {
		 
		Account accArr[] = new Account[3];
		 accArr[0]= new Account(101, "Niya", 500000);
		 accArr[1]= new Account(102,"Piya", 550000);
		 accArr[2]= new Account(103,"Siya", 900000);
		 
//		 for(int i=0; i<accArr.length; i++) 
//		 {
//			 System.out.println(accArr[i]);
//		 }
          for(Account a:accArr) 
          {
        	  System.out.println(a);
          }
          
          double max=0;
          String name = "";
          for(Account a1:accArr) 
          {
        	  if( a1.getbalance()>max) 
        	  {
        		  max=a1.getbalance();
        		  name=a1.getName();
        	  }
        	  
          }
          System.out.println(name + " is a maximum  balance rs" + max);
	}
}

	