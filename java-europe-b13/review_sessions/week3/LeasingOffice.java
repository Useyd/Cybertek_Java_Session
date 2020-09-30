package week3;

import java.util.Scanner;

public class LeasingOffice {

	public static void main(String[] args) {

		System.out.println("Welcome to Cybertek Apartments!");
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter your room number: ");
		int numberOfBedrooms = scanner.nextInt();
		double startingPrice = 0.0;
		
		switch (numberOfBedrooms) {
		
		case 0:
		System.out.println("Studio selected");
		startingPrice=1200.0;
		break;
		
		case 1:
		System.out.println("One bedroom is selected");
		startingPrice=1400.0;
		break;
		
		case 2:
		System.out.println("Two bedroom is selected");
		startingPrice=1650.0;
		break;
		
		case 3:
	    System.out.println("Three bedroom is selected");
		startingPrice=2200.0;
		break;
		
		default:
		System.out.println("No such bedroom available");
		}
	
	    System.out.println("Starting price: $ " + startingPrice);
	    
	    if (startingPrice>1300.0) {
	    	System.out.println("Too expensive, BYE");
	    }
	    
	}
	

}
