package com.String_;

//Write a Java program to convert lowercase string to uppercase.

public class ConvertString {

	public static void main(String[] args) {
		String str = "utkarsha";
		String s="JAVA";
//		String str2=str.toLowerCase();
//		System.out.print(str2);
//		String str3= str.toUpperCase();
//		System.out.print(str3);
		
		
//		using logic lower to upper
		
		char c[] = str.toCharArray();
		for(int i=0; i<c.length; i++) 
		{
			if(c[i]>='a'&&c[i]<='z') 
			{
				c[i]=(char)(c[i]-32);
			}
		}
		for(char x:c) 
		{
			System.out.print(x);
		}
			
	}
	
//  //upper to lower
//	char  c[] = s.toCharArray();
//	for(int i=0; i<c.length; i++) 
//	{
//		if(c[i]>='A'&&c[i]<='Z') 
//		{
//			c[i]=(char)(c[i]+32);
//		}
//	}
//	for(char x:c) 
//	{
//		System.out.print(x);
//	}
		
}


