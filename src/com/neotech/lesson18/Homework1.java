package com.neotech.lesson18;

public class Homework1 {

	public static void main(String[] args) {
		String str = " Sunday";

		for (int i = str.length() - 1; i >= 0; i--)

		{
			char c = str.charAt(i);
			System.out.print(c);

		}
		
		System.out.println();
		
		// 2nd way using toCharAray()
		char[] charArray = str.toCharArray();
for(int i = str.length()-1; i >=0; i--) {
	char c = charArray[i];
	System.out.print(c);
}
System.out.println();
//3 rd way,using reverse() method of StringBuffer

StringBuffer strBuffer = new StringBuffer(str);
strBuffer.reverse();
System.out.println(strBuffer);


//String is IMMUTABLE , calling toUpperCase() method
// WON'T change the string 
 str.toUpperCase();
 System.out.println(str);
 String strUpper = str.toUpperCase();
 System.out.println(strUpper);


	}

}
