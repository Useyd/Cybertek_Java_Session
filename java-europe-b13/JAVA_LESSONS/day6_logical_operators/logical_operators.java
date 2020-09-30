package day6_logical_operators;

public class logical_operators {

	public static void main(String[] args) {
/*
 
 Logical Operators have two boolean operands that yield a boolean result
 
 Operator    Description
 
 &           Logical AND
 &&          Bitwise logical AND
 |           Logical Or
 ||          Bitwise Logical Inclusive OR 
 ^           Bitwise Logical Exclusive OR
     
       
       
       1-)Truth Table for && and & (Likes False)
       
       Expression1 Expression2 Returned Value
       
       False       False       False
       False       True        False
       True        False       False
       True        True        True
       
       2-)Truth Table for || and | (Likes True)
       
       Expression1 Expression2 Returned Value
       False       False       False 
       False       True        True
       True        False       True
       True        True        True
       
       3-)Truth Table for ^ (same as || but different only with true - true -> false)
       
       Expression1 Expression2 Returned Value
       False       False       False
       False       True        True 
       True        False       True  
       True        True        False
            
 */ 
		
		char c1='A';
		char c2=65;
		int i1=5;
		int i2=10;
		
		boolean res1=(i1==i2)&&(c1==c2); //first one is false, then && ignores second and says false
		System.out.println("res1 = " + res1);
		System.out.println();
		
		boolean res2=(i1==i2)&(c1==c2); //& checks both sides and then answers. False & True = False
		System.out.println("res2 = " + res2);
		System.out.println();
		
		boolean res3=(c1==c2) | (i1==i2); // | checks for both sides, True | False = True 
		System.out.println("res3 = " + res3);
		System.out.println();
		

		boolean res4=(c1==c2) || (i1==i2); // first one is True, then | ignores second and says True 
		System.out.println("res4 = " + res4);
		System.out.println();
		

		boolean res5=(c1==c2) ^ (i1==i2); // ^ checks for both sides, True ^ False = True 
		System.out.println("res5 = " + res5);
		System.out.println();

		boolean res7=(c1==c2) ^ (i1!=i2); // ^ checks for both sides, True ^ True = False
		System.out.println("res7 = " + res7);
		System.out.println();
		
		
		
	}

}
