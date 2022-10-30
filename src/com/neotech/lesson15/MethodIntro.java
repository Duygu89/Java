package com.neotech.lesson15;

public class MethodIntro {

	
	
	// does NOT return anything 	
	void greet ()
	{//begin body of method
	
	
	System.out.println("Hello");
	
	System.out.println("how are you");
	
	System.out.println("Bye");
	
	
	
	//no input no out put
	} // --> end body of method
		
	void greet2(String name)
	{
		System.out.println("Hello"+" "+name);
		System.out.println("how are you");
		
		System.out.println("Bye"+" "+name);
	}
		
	public static void main(String[] args) {
		
		
		//Calling method --->Executing a method ---> running the code of a method
		
		MethodIntro obj = new MethodIntro();
		obj.greet();
		obj.greet2("Duygu");
		
	}
		
		
		
		
		
		
		

	

}
