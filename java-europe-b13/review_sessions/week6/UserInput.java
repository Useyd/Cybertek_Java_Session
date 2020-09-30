package week6;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {

		//Scanner, String, Array, Math, Random, ....
		Scanner sc = new Scanner(System.in);// I'm creating an object from Scanner class - to able to use properties (variable+methods)
		
		System.out.print("Enter first number: ");
        int num1 = sc.nextInt();//I'm calling the method
        
        System.out.print("Enter second number: ");
		int num2 = sc.nextInt(); 
		
		
		//sc.nextLine();//if I want to use nextLine after nextInt - I need to put one extra nextLine before nextLine
		
		System.out.print("Enter a string: ");
	    String str = sc.next();
	    
	    System.out.println(str);
		
		
	
	
	
	
	
	
	
	
	
	}

}
