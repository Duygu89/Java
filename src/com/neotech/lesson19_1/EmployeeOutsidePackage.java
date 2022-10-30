package com.neotech.lesson19_1;



//This imports ONLY class Employee from package com.neotech.lesson19.Employee;

import com.neotech.lesson19.Employee;


	public class EmployeeOutsidePackage {

	public static void main(String[] args) {
	
	Employee.company = "Neotech";
	
	Employee emp = new Employee();
	
		
		emp.name = "Mustafa";
		//WE CAN ACCESS THIS IS PUBLIC 
		//emp.lastName = "";
		//THIS IS PROTOCED WE CAN NOT ACCESS
		
		//emp.salary = 544;
		//WE CAN NOT ACCESS
		
		//emp.method1();
		//emp.method2();
		//emp.method3();
		//emp.method4();
	
		
		//emp.method5();

	}

}
