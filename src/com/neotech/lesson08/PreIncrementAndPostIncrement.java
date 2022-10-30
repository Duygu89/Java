package com.neotech.lesson08;

public class PreIncrementAndPostIncrement {

	public static void main(String[] args) {
		// ++ INCREMENT ---> ADD 1 
		// -- DECREMENT ---> SUBTRACK 1 to the value

		int x;
		int y = 10;

		// POST Increment
		// 1.perform x = y
		// 2.increment (y=y+1)
		x = y++; // y = y+1

		System.out.println(x);
		System.out.println(y);

		// PRE increment
		int a;
		int b = 15;
		// 1.first increment b = b+1
		// 2. assign value of b to a
		a = ++b;
		System.out.println(a);
		System.out.println(b);
		
		//DECREMENT "--"
		int c ;
		int d = 14;
		// --d >> decrease 1
		//PRE decrement
		//1.fisrt decrement the value of D
		c=--d;
		//THIS MEANS ---> d-=1 c=d
		System.out.println(c);
		System.out.println(d);
		//POST Decrement
		int e;
		int f = 14;
		e=f--;
		System.out.println(e);
		System.out.println(f);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	

}
