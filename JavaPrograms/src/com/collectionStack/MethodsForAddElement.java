package com.collectionStack;

import java.util.Stack;

public class MethodsForAddElement {

	public static void main(String[] args) {
		
		Stack<Integer> st = new Stack<Integer>();
		
		st.add(101);
        st.push(190);
        st.addElement(90);
        
        System.out.println(st);
        
        st.add(1, 34);
        System.out.println("After adding element"+ st);

	}

}
