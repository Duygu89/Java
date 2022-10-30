package com.neotech.lesson04;

public class PrimitiveCasting {

	public static void main(String[] args) {
	
		//Casting or Converting
		//byte-- short-- int--long -- float
		
		double d1= 3.7 ;
		System.out.println(d1);
		double d2=6;//casting is happening 
		System.out.println(d2);

		int num1=5;
		double d3=num1;//casting happening
		System.out.println(d3);
		//complier is complaning 
		//type mismatch : cannot convert froum double to int
		//int num2=6.3;
		//narrowing exlicit casting , manually 
		int num2=(int)6.3;// i tell Java i wanna store it as an int
		System.out.println(num2);
		
		
		//narrowing explicit casting should be done manually
		byte b1=(byte)4253;
		
		System.out.println(b1);
		
		int i2 = 45;
		byte b2 = (byte)i2;
		System.out.println(b2);   // i may or may not lose data
		
		long l1 = 17L;
		int number1 =(int) l1;
		System.out.println(number1);
		//narrowing , we are trying to fit something big into a small container 
		long l2 = 73874837483748L;
				int number2= (int) l2;
				System.out.println(number2);
				
				
				//widening imlicit casting automatically
				
				int number5=247;
				float f1 = number5 ;
				float f2= number5;
				
				System.out.println(number5);
				
				System.out.println(f1);
				System.out.println(f2);
				
				
				
		
		
		
		
		
		
		
		
	}

}
