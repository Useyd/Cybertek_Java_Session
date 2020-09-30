package day5_unary_assignment_relational_Operators;

public class typeCasting {

	public static void main(String[] args) {
		byte b;
		int i=81;
		double d=323.142;
		float f=72.38f;
		char c='A';
		
		c=(char)i; //Explicit Casting

		System.out.println("i = " + i + " c = " + c);
		System.out.println();
		
		i=(int)d; //implicit Casting
		System.out.println("d = " + d + " i = " + i); // data loss on d
		System.out.println();
		
		i=(int)f; //integer to float - Explicit
		System.out.println("f = " + f + " i = " + i);
		System.out.println();
		
		b=(byte)d; //double to byte - implicit
		System.out.println("d = " + d + " b = " + b);
		System.out.println();
		
		
		

	
	
	
	
	
	}

}
