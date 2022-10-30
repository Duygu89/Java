package com.neotech.lesson16;

public class StringMethodsContinue {

	public static void main(String[] args) {
	
		
		
		//CONTAINS
		
		
	String sentence = "Today is Oct 22";
	boolean cont = sentence.contains("are");
	
	
	//   *This is like a question
	//   *Does this string contain this element!
	
	System.out.println(cont);
	
		
	
	
	
	
	
	
	
	//STARTSWITH startsWith ()
	boolean starts = sentence.startsWith("");
	System.out.println(starts);
	
	//ENDS WITH endsWith()'
	
	boolean ends = sentence.endsWith("Oct 22");
	System.out.println(ends);
		
		//EQUALS equals()
	String s1 = "Saturday";
	String s2 = "saturday";
	boolean equals = s1.equals(s2);
	System.out.println(equals);
	
	// EQUALSIGNORECASE equalsIgnoreCase()
	
	boolean equalsIgnoreCase = s1.equalsIgnoreCase(s2);
	System.out.println(equalsIgnoreCase);
		
		
	//Instead of Using equalsIgnoreCase
		
		
		
		
		
		
		
		
		
	}

}
