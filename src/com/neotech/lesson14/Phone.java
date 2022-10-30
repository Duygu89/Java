package com.neotech.lesson14;

public class Phone {
	
	 /*
	  * Create a Class "Phone". 
	  * Create 3 Objects of it: iPhone, Android, Nokia with specific  attributes and behaviors.
	  */
	
	//features 
	String brand,model;
	int storage;
	//behaviors
	// bigstorage(), easytouse()
	
	void bigmemory()
	{
		System.out.println("The"+brand+" "+"has a more option for stroage");
	}
	
	void use ()
	{
		System.out.println("The"+" "+brand+" "+"easy to use");
	}
	
	void fast()
	{
		System.out.println("The"+" "+brand+" "+model+" "+"is really fast");
		
	}
	public static void main(String[] args) {
		
		Phone p1=new Phone();
		
		
		p1.brand="Iphone";
		p1.model="14";
		p1.storage=128;
		System.out.println(p1.brand+" " +"a very popular phone");
				
		p1.use();
		p1.bigmemory();
		p1.fast();
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	

}

