package com.neotech.lesson07;

public class LogicalNOT {

	public static void main(String[] args) {
	
		
		/* ! (NOT)
		 *  reserves the value of a boolean variable
		 */
	
	
	boolean b1 = !true;
	System.out.println(b1);
	
	boolean b2 = !false;
	System.out.println(b2);
	
	
	boolean cold = true;
	if (cold)
		
	{
		System.out.println("It is cold!");
	}
	
	int x =12;
	if (x==12) {
		System.out.println("x is 12");
		
	}
	else {
		System.out.println("x is NOT 12 ");
		
	}
	
	if (x != 12 ) 
	{
		System.out.println("X is NOT 12");
	}
	}
	
	
	

}
