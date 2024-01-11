package com.weeklytest1;

public class FindHighestDigit {
	
	public void getHighestDigit(int num) {
		int rem,max=0;
		
		while(num>0) {
			rem=num%10;
			
			
			
			if(max<rem) {
				max=rem;
				
			}
			num=num/10;
		}
		System.out.println("Max digit:"+max);
	}

	public static void main(String[] args) {
		FindHighestDigit obj = new FindHighestDigit();
		obj.getHighestDigit(8950);

	}

}
