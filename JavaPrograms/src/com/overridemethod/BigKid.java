package com.overridemethod;

 class BigKid extends Kid {
	
	
	public BigKid() 
	{
		
	}

	public static void main(String[] args) {
		Kid  b=  new BigKid();
	    b.readBook("Java","Coding");
	    b.readBook();
	    
	  //Type casting  
	    ((BigKid) b).readBook("Java", "Coding...");

	}

}
