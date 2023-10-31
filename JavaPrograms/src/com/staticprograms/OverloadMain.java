package com.staticprograms;

public class OverloadMain {
	
	public static void to() {
		System.out.println("to");
		
	}
      public static void goTo() 
      {
    	  System.out.println("goTo");
      }
	
	
	public static void main(String[] args) {
		OverloadMain.to();
		OverloadMain.goTo();

	}

}
