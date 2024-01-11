/*)  You are given a class Solution and its main method in the editor. 
Your task is to create the class Add and the required methods so that the code prints the sum of the numbers passed to the function add.[1M]
sample input
2,3
output 5
14,2,1
output 17
output 30
14,14,1,1
*/



package com.testpaper2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Method;
import java.util.HashSet;
import java.util.Set;

public class Que7Add {
	public void add(int... intArgs) {
        int sum = 0;
        String separator = "";
        for (int i : intArgs) {
            sum += i;
            System.out.print(separator + i);
            separator = "+";            
        }
        System.out.println("=" + sum);
    }
}
 class Solution {
    public static void main(String[] args) {
       try{
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            int n1=Integer.parseInt(br.readLine());
            int n2=Integer.parseInt(br.readLine());
            int n3=Integer.parseInt(br.readLine());
            int n4=Integer.parseInt(br.readLine());
            int n5=Integer.parseInt(br.readLine());
            int n6=Integer.parseInt(br.readLine());
            Que7Add ob=new Que7Add ();
            ob.add(n1,n2);
            ob.add(n1,n2,n3);
            ob.add(n1,n2,n3,n4,n5);    
            ob.add(n1,n2,n3,n4,n5,n6);
            Method[] methods=Que7Add .class.getDeclaredMethods();
            Set<String> set=new HashSet<>();
            boolean overload=false;
            for(int i=0;i<methods.length;i++)
            {
                if(set.contains(methods[i].getName()))
                {
                    overload=true;
                    break;
                }
                set.add(methods[i].getName());
                
            }
            if(overload)
            {
                throw new Exception("Overloading not allowed");
            }
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
        }
        
    
    
}


