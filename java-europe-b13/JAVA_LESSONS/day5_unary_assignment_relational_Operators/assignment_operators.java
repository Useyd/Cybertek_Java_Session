package day5_unary_assignment_relational_Operators;

public class assignment_operators {

	public static void main(String[] args) {
		
		/*
		 Name                        Shorthand Operator         Meaning 
		                  
		 Assignment                  x = y                      x = y  
		 Addition Assignment         x += y                     x = x + y
		 Subtraction Assignment      x -= y                     x = x - y
		 Multiplication Assignment   x *= y                     x = x * y
		 Division Assignment         x /= y                     x = x / y
		 Remainder Assignment        x %= y                     x = x % y 
		 
		 */
		
		int i =100;
		System.out.println(i);
		System.out.println();
		
		i+=1; // 101
		System.out.println(i);
		System.out.println();
		
		i-=2; //101-2=99
		System.out.println(i);
		System.out.println();
		
		i*=3; //99*3=297
		System.out.println(i);
		System.out.println();
		
		i/=4; //297/4=74
		System.out.println(i);
		System.out.println();
		
		i%=5; // 74%5 = 4
		System.out.println(i);
		System.out.println();
		
		
	}

}
