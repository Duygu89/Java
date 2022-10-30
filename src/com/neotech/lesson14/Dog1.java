package com.neotech.lesson14;

public class Dog1 {

	String breed,size,color;
	
	int age;
	//Create a class Dog
    //features: breed, size, color and age
    //behaviors: eat(), run(), breed()
	
	
	void eat ()
	{
		System.out.println("The"+" "+breed+" "+"dog"+" "+"loves to eat");
		
	}
	
	void run ()
	{
		System.out.println("The"+" "+breed+" "+"breed"+" "+"run fast");
	}
	
void play() {
	System.out.println(breed+" "+"loves to play alot!");
}

	public static void main(String[] args) {
		
		Dog1 d1=new Dog1();
		d1.breed="Golden retriever";
		d1.color="Golden";
		d1.size="Medium";
		d1.age=5;
		System.out.println(d1.breed+" "+"dog has "+d1.color+" "+"color");
		System.out.println(d1.breed+" "+"is"+" "+d1.size );
		
		
		d1.eat();
		d1.run();
		d1.play();
		
		
		
		
	}
	
}

		
	
		
	
	
	
	
	
	
	
	
	
	
	
	
	


		
		
		
		
		
	
	
	
	
	
	

