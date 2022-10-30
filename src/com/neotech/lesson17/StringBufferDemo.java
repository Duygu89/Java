package com.neotech.lesson17;

public class StringBufferDemo {

	public static void main(String[] args) {
		
		
		
		String a  = "Hello";
		String b = new String ("Hello");
		StringBuffer sb = new StringBuffer("Hello");
		System.out.println(sb);
//We can CHANGE the stringBuffer object, without the need to create  a new one 
	
	sb.append(" All");  //METHOD
	System.out.println(sb);
	
	
	//String is IMMUTABLE -- once created it CANNOT be changed
	//StringBuffer and StrinBuilder are MUTABLE!
	//WE CAN CHANGE THE EXISTING STRING
	System.out.println(sb.length());
	
	System.out.println(sb.reverse());
	
	String subStr = sb.substring(2, 5);
	
	System.out.println(subStr);
	
	StringBuffer strBuff = new StringBuffer("");
	
	StringBuilder strBld = new StringBuilder("it is late");
	
	strBld.append(" but we won't stop!");
	
	System.out.println(strBld);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
