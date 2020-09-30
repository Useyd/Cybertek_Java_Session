package day4_arithmetic_operators;

public class type_cast_operators {
	
	public static void main(String[] args) {
		
		/*Type Cast Operators

		1-Implicit Casting
		2-Explicit Casting

		1-Implicit Casting*/

		int x = 'A';
		System.out.println(x); // outcome 65

		double d=20;
		System.out.println (d); // outcome 20.0

		/*Conclusion:
		1-Done by Compiler
		2-Smaller data type to bigger data type
		3-Widening
		4-No Loss of Data


		byte --> short --> int --> long --> float --> double

		2-Explicit Casting*/
		
		int y = 130; 
		
		//byte b = y; -> (y 4 byte b 1 byte-compiler will not do it)
		
		byte b = (byte) y; // So we'll type the code like this to force the compiler manually.
		System.out.println(b); //But outcome will be different: -126. Not 130.

		/*
		  
		 Conclusion:
		1-Done by programmer
		2-Bigger data type to smaller data type
		3-Narrowing
		4-Loss of Data

		byte <-- short <-- int <-- long <-- float <-- double 
		
		*/
		
		/*
		intx=130;
		 
		byte b = (byte) x;
		
		int(32 bit) =>00000000 00000000 00000000 10000010 -> 130 in machine language 
		byte(8 bit)=>10000010 -> When we want to compress the int to byte compiler takes the last 8 digits and ignores rest.		
		
		
		*/
		
		/*
		
		In the computer, first digit is the signing digit. 1 is negative, 0 is positive 
		If the first digit is 0, computer understands it as positive
		If the first digit is 1, computer understands it as negative 
		
		byte(8 bit)=>1 0000010
		In here there is a complement form:
		1111101 -> zero's became 1, 1's became zero.
		1111101
		      1
		1111110 -> -126
			
		*/
		
	
	}

}
