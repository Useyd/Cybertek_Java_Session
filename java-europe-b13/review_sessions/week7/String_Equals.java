package week7;

import java.util.Scanner;

public class String_Equals {

	public static void main(String[] args) {
		
		String s1 = "Welcome to Java";
		String s2 = "Welcome to Java";
		String s3 = new String("Welcome to Java");
	
	    System.out.println(s1==s2);
	    System.out.println(s1==s3);
	    
	    System.out.println(s1.equals(s2));
	    System.out.println(s1.equals(s3));
	    System.out.println("-----------------------");
	    
	    Scanner scan = new Scanner(System.in);
	    System.out.println("What is the capital of USA?");
	    String capital = scan.next();
	    
	    if(capital.equalsIgnoreCase("DC") || capital.equalsIgnoreCase("Washington")) {
	    	
	    	System.out.println("Your answer is correct");
	    }else {
	    	
	    	System.out.println("Your answer is not correct");
	    }
	    
	}

}
