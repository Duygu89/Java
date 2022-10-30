package com.neotech.lesson19;

public class EmployeeWithinPackage {

	public static void main(String[] args) {
	
		
	Employee emp = new Employee ();
	
	//company = "Neotech";--> //We are not anymore in same class 
	
		Employee.company="Neotech";
	
		emp.name = "Sabah";
		
		emp.lastName ="Bushaj";//Within package, we CAN access protected elements
		
		emp.salary = 122345; //Within package, we CAN access default elements
		
		//--->emp.ssn = 12345;<---
		//There is AN ISSUE
		//The field Employee.ssn is NOT VISIBLE 
		
		
		
		emp.method1();//Public method,we can ACCESS 
		emp.method2();
		emp.method3();
		//emp.method4(); NOT VISIBLE
		//it is there but you CAN NOT ACCESS
		
		emp.name.charAt(1);
		emp.name.substring(0);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
