package com.innerclasses.methodlocal;

public class Outer {
	
		
		int outer_n=20;
		public Outer() {
			// TODO Auto-generated constructor stub
		}
		public void show()
		{
			class Inner
			{
				int inner_n=10;
				public Inner() {
					// TODO Auto-generated constructor stub
				}
				public void show()
				{
					System.out.println(outer_n);
					System.out.println(inner_n);
				}
				
			}
			Inner in=new Inner();
			in.show();
			
		}
	    public static void main(String[] args) {
			
	    	Outer o=new Outer();
	    	o.show();
		}
	}
