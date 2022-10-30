package com.neotech.lesson18;

public class LocalVariables {
	
	void method1 () {
		// local variables are only visible within the method
		String name ="Duygu";
		int age = 28;
		System.out.println(name);
		System.out.println(age);
	}
void method2 () {
	String name = "Volkan";
	int age = 30;
	System.out.println("his name is "+ name);
	System.out.println(age);
}
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		LocalVariables obj1 = new LocalVariables();
		obj1.method1();
		obj1.method2();
		
	
		
		boolean flag = true;
		if (flag) {
			String answer = "yes";
			System.out.println(answer);
			System.out.println(flag);
		}
		// System.out.println(answer);
		System.out.println(flag);
		// The scope/lifetime of answer is only the if block
		// The scope of the flag is the main method
		
		for (int i=0; i<=5; i++) {
			
			System.out.print(i);
			
		}
		// Cannot access the value of "i" outside the for loop
		// System.out.println(i);
		
		System.out.println("----");
		int x ; //declare variable OUTSIDE the for loop 
		
		for (x = 1; x<=5; x++) {
			System.out.print(x);
		} 
		
		System.out.println(x); //that is why this line will execute
		
		
	}

}
