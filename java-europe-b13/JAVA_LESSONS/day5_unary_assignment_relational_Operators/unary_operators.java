package day5_unary_assignment_relational_Operators;

public class unary_operators {
	public static void main(String[] args) {
		
		/*
		 *  Operator    Name                                    Meaning
		 *  +           Unary Plus Operator                     Indicates positive value
		 *  -           Unary Minus Operator                    Negates an expression or a value
		 *  ++          Increment Operator                      Incremenets a value by 1
		 *  --          Decrement Operator                      Decremenets a value by 1 
		 *  !           Logical Complement Operator             Inverts a value of a boolean
		 */
		
		int i1=+10;
		int i2=-100;
		int i3=-(i1+i2);// -(10-100) => - (-90)= 90...
		System.out.println("i1 = " + i1);
		System.out.println("i2 = " + i2);
		System.out.println("i3 = " + i3);
		System.out.println();
		
		
		boolean flag=true;
		System.out.println(!flag);//! is converting it to the opposite. FALSE...
		System.out.println(!!flag);
		System.out.println();
		
		
		int i=10, j=5;
		i++; //same as i = i + 1
		--j;// same as j = j - 1
		
		System.out.println("j = " +i);
		System.out.println("i = " +j);
		
		//i=11, j=4
		
		int res = i++ + --j;
		
		System.out.println("res = " + res);
		
		//res = 11 + 3
		//i =  11  -> 11, on next line it will be 12..  
		//j =   4 -> 3 
		
		

	
	
	
	
	
	}

}
