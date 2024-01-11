package com.weeklytest4;

public class Que2Pattern {

	public static void main(String[] args) {
		String str="JAVA";
	    
	    for(int i=0;i<str.length();i++) {
	      System.out.println(str.substring(0,i+1));
	    }
	     for (int j= str.length() - 2; j >= 0; j--) {
	              System.out.println(str.substring(0, j + 1));
	          }
	  }

	
	}


