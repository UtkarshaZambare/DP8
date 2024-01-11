package com.logicaLProgram;

public class DuplicateArray {

	public static void countDuplicate(int num[]) {
		 for(int i=0 ; i<num.length; i++) 
		 {
			 boolean isDuplicate = false;
			 for(int j=i+1; j<num.length; j++) 
			 {
				 if(num[i]==num[j]) {
					 isDuplicate = true;
					 break;
				 }
			 }
			 if(isDuplicate) 
			 {
				 boolean isPrinted = true;
				 for(int k = i-1 ; k>=0; k--) 
				 {
					 if(num[k]==num[i]) {
						 isPrinted=false;
						 break;
					 }
				 }
			 if(isPrinted) {
				 System.out.println(num[i]+": is duplicate number");
			 }
			 
			 }
		 }
	}

	public static void main(String[] args) {
		int num[] = {1,3,3,4,5,6,7,7,8};
		
		countDuplicate(num);
	}

}
