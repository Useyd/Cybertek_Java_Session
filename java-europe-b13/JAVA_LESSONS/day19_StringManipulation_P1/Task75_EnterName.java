package day19_StringManipulation_P1;

import java.util.Scanner;

public class Task75_EnterName {

	public static void main(String[] args) {


		Scanner input = new Scanner(System.in);
		System.out.print("Please enter your firstname: ");
		String firstname = input.next();
		
		System.out.print("Please enter your lastname: ");
	    String lastname = input.next();
	
	    int x = firstname.length();
	    int y = lastname.length();
	    
	    System.out.println("Total characters in your firstname and lastname:");
	    System.out.println(x+y);
	    
	    
	}

}
