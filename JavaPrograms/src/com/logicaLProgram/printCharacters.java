package com.logicaLProgram;

public class printCharacters {

	public void printcharacterFromatoz() {
		 char i;
		 for (i='a'; i<='z'; i++) 
		 {
			 System.out.println(i);
		 }
	}
	
	public static void main(String[] args) {
		printCharacters obj = new printCharacters();
		obj.printcharacterFromatoz();

	}

}
