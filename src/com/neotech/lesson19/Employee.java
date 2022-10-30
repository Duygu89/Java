package com.neotech.lesson19;

public class Employee {

 public static String company;

public String name;

protected String lastName ;//limited,most security one

double salary ; // no access modifier (default)

private int ssn;


//formula
/*
 * 1.if no access modifier then it default
 * 2.the formula of ASSIGNing access modifier
 * OPTIONAL --> Access Modifier 
 * MUST		--> data_type,variable name
 */
	public void method1 () {
		System.out.println("I am public method!!");
	}
	protected void method2() {
		System.out.println("I am a protected method!!");
	}
	
	
	void method3() {
		System.out.println("I am a default method!!");
	}
	
	private void method4 () {
		System.out.println("I am a private method!!");
	}
	
	
	public static void main(String[] args) {
		
		
		//We want to SEE here what elements we can ACCESS from within the SAME CLASS!!
	
	Employee emp = new Employee();
	company = "NeoTech";
	
	emp.name = "Sabah";
	
	emp.lastName ="Bushaj";
	
	emp.salary = 122345;
	
	emp.ssn = 12345;//RED SQURE -- > Protected,private

	//Can we access the METHODS?!
	emp.method1();//We can access A PUBLIC METHOD
	emp.method2();//We can access A PROTECTED METHOD
	emp.method3();//We can access A DEFAULT METHOD
	emp.method4();//We can access THE PRIVATE METHOD AS WELL
	
	
	}
	
	
	
	
	
	
	
}
