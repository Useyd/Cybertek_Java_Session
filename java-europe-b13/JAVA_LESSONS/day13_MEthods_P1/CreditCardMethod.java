package day13_MEthods_P1;

import java.util.Scanner;

public class CreditCardMethod {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Please enter your salary:");
		double salary = scanner.nextDouble();
		System.out.print("Please enter your credit rating:");
		int creditRating = scanner.nextInt();
		
		if (salary>=20000 && creditRating>=7) {
			qualify();//if is true then use this method
			
		}else {
			noQualify();//else is true then use this method
			
		}
		
		
	}

	public static void noQualify() {
    System.out.println("I am sorry, you are not qualified for the CC");		
	
	}

	public static void qualify() {
	System.out.println("Congrats! You are qualified for the CC");
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
