package com.String_;

//WAP to split string into 2 tokens where string is “HELLO$WORLD”
public class SplitStringInto2Tokens {

//	public static void main(String[] args) {
//		
//		//by using method
//		String str = new String("HELLO$WORLD");
//	    String[] str1= str.split("\\$", 2);
//	    for(String ss : str1)
//	    System.out.println(ss);
//	    
//     // by using logic
//	    char ch[] = str.toCharArray();
//	    for(int i=0; i<ch.length; i++) 
//	    {
//	    	if(ch[i]=='$') 
//	    	{
//	    		System.out.println();
//	    		continue;
//	    	}
//	    	  System.out.print(ch[i]);
//	    }
//	  
//	}
//
//}

	
	
	
	public static void main(String[] args) {
        String str = "javaprograms";

        String[] spaceBasedSplitArray = str.split(" ");

        for(String value : spaceBasedSplitArray){
            System.out.println(value);
        }
    }
}