package com.neotech.lesson06;

public class Lesson06Recap {

	public static void main(String[] args) {

		/*
		 * If Else If -> (Ladder If)
		 * 
		 * if (condition 1) { code 1 ... } else if (condition 2) { code 2 ... } else if
		 * (condition 3) { code 3 ... } else { code else ... }
		 * 
		 * 
		 * Nested If -> If inside another If if (condition 1) {
		 * 
		 * code 1 ... if (condition 2) { code 2 ... } else { code else 2 ... }
		 * 
		 * } else { code else ...
		 * 
		 * 
		 * if (condition 3) { code 3 ... } else { code else 3 ... } }
		 * 
		 * 
		 * If I want "code 2" to be executed, what should be condition 1 AND condition
		 * 2? -> Both true If I want "code else 2" to be executed, what should be
		 * condition 1 AND condition 2? -> condition1 = true; condition2 = false;
		 *  If I want "code 3" to be executed, what should be condition 1 AND condition 2? ->
		 * condition1 = false; condition3 = true; condition2 DOESN'T matter
		 * 
		 * -------------------------------- 
		 * Scanner Class -> it takes input from a user,
		 * the user will provide input from the console. The value that is entered, is
		 * used in the program.
		 * 
		 * Scanner variableName = new Scanner(System.in); variableName.next() -> read
		 * into a String variableName.nextInt() -> read into an int
		 * variableName.nextBoolean() -> read into a boolean variableName.nextDouble()
		 * -> read into a double variableName.next().charAt(0) -> read the first letter
		 * into a char
		 * 
		 * char c = variableName.next().charAt(0); // you are reading one character
		 * -------------------------------- 
		 * Logical operators in Java are 3: AND, OR,
		 * NOT
		 * 
		 * AND (&&) if (true && true) --> true if (false && true) --> false if (true &&
		 * false) --> false if (false && false) --> false
		 * 
		 * Are you RICH && YOUNG? Only if BOTH of them are true, the result is true.
		 * 
		 * OR (||) if (true || true) --> true if (false || true) --> true if (true ||
		 * false) --> true if (false || false) --> false
		 * 
		 * Are you OLD || SICK? Only ONE of then is enough to make the result true.
		 * 
		 * NOT (!) - will reverse the condition 1. boolean b = !true; sout(b); // false
		 * 
		 * 2. boolean cold = true; if (!cold) { sout(1); } else { sout(2); // This will
		 * be printed }
		 * 
		 * 3. if (5 != 6){ sout(1); // This will be printed } else { sout(2); }
		 */
	}

}
