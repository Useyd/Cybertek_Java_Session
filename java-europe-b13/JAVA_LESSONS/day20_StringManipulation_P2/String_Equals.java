package day20_StringManipulation_P2;

public class String_Equals {

	public static void main(String[] args) {
	
		//important for INTERVIEW!!
	
		String str1 = "Apple";//Literal.-> it's in String pool in HEAP..
		
		String str2 = new String("Apple");//Create a new String object with new keyword. -> It will be in HEAP too but outside of the String Pool.
		
		System.out.println(str1==str2);//false!
		
		//normally output should be true. But it's giving false. 
		//The reason is here:
		//With == operator, compiler looks for the same object. And then says true or false 
		//With creating str2 using new keyword, we also create a new different object too... 
		//So compiler checks and sees str1 and str2 not referencing the same objects anymore.
		//Output comes false then...
		
		System.out.println(str1.equals(str2));//true!
		
		//When we use equals method it will check the exact matching on parameters. Not for objects.
        //Objects can be different. If parameters of the objects are equal then it gives true...
	    System.out.println();
	 
//************************************************************************************************
	
	    String s1 = "Welcome to Java";
	    String s2 = "Welcome to Java";
	    String s3 = "Welcome to C++";
	    
	    boolean b1 = s1.equals(s2);	
	    boolean b2 = s1.equals(s3);
	    
	    System.out.println(b1 + "|" + b2);
	
	    boolean b3 = s1==s2;
	    boolean b4 = s1==s3;
	    
	    System.out.println(b3 + "|" + b4);
	    
	    String s4 = new String("Welcome to Java");
	    
	    System.out.println(s1==s4);
	    System.out.println(s1.equals(s4));
	
	
	
	
	}

}
