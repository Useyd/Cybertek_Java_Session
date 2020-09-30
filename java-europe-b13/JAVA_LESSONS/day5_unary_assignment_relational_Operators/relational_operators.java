package day5_unary_assignment_relational_Operators;

public class relational_operators {

	public static void main(String[] args) {
 /* ALL RELATIONAL OPERATORS RETURN BOOLEAN (true or false)
    Description             Operator
    
    Greater than            > 
    Greater than or equal   >=
    Less than               <
    Less than or equal      <=
    Equal                   ==
    Not equal               !=
 */
		
		byte b1 = 1;
		byte b2 = 2;
		double d1 = 3.5;
		int i1 = 17;
		float f1 = (float)67.0;
		
		boolean test1 = b1<b2;
		System.out.println(test1);
		System.out.println();
		
		boolean test2 = b1>b2;
		System.out.println(test2);
		System.out.println();
		
		boolean test3 = d1==b1;
		System.out.println(test3);
		System.out.println();
		
		boolean test4 = (i1*d1)>=(f1-42);
		System.out.println(test4);
		System.out.println();
		
		System.out.println((6*4)<=(3*8));
		System.out.println();
		
		System.out.println('a' < 'b'); // these characters have a numeral value in unicode. So system compares these values in here.
	}

}
