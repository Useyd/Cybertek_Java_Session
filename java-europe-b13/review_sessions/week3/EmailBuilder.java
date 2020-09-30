package week3;

import java.util.Scanner;

public class EmailBuilder {

	public static void main(String[] args) {
//		Welcome to your new Company!
//		Enter first name, last name, company name:
//		mike
//		smith
//		cybertek
//		Your email: mike_smith@cybertek.com
		
   
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Welcome to your new Company!");
		
		System.out.print("Enter first name, last name, company name: ");
		
		String name = scanner.next();
				
		String lastname = scanner.next();
		
		String companyname = scanner.next(); //if you write nextLine(); you can put space in string.
		
		String email = name + "_" + lastname + "@" + companyname + ".com";

		System.out.println("Your e-mail is: " + email);
	}

}
