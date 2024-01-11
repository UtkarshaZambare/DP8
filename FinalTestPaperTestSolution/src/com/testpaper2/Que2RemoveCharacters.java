/*How to remove  Characters from the first String which are present in the second String and add deleted Characters in the ArrayList.[1M]
e.g String1->india is great nation.
string2-in
output->da s great 
ArrayList [i,n,i,i,n,i]
*/

package com.testpaper2;

import java.util.ArrayList;

public class Que2RemoveCharacters {

	public static void main(String[] args) {
		String str1 = "india is greate nation";
		String str2 = "in";
		
		ArrayList<Character> deletedChars = new ArrayList<>();
		
		String result = "";
		for(int i =0; i<str1.length(); i++) {
			char ch = str1.charAt(i);
			
			if(str2.indexOf(ch)== -1) {
				result =result+ch;
			}
			else {
				deletedChars.add(ch);
			}
		}

		System.out.println("Output:" +result);
		System.out.println("ArrayList:" +deletedChars);
	}

}
