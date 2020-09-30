package day13_MEthods_P1;

import java.util.Scanner;

public class Task59_Payment {

	public static void main(String[] args) {

		//Write a method that accepts number of hours and hourly
        //pay and show your pay for those in the console.
	
		
		workingHour(5,15);
		workingOur();
		
	
	}

	public static void workingHour(int hours1, int hourlyPay1) {
		int payment = hours1*hourlyPay1;
		System.out.println("The payment is $" + payment);
        System.out.println("----------------------------");
		
	}

	public static void workingOur() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Please enter the working hours:");
		int hours = scanner.nextInt();
		System.out.print("Please enter the hourly payment:");
		int hourlyPay = scanner.nextInt();
		
		int payment=hours*hourlyPay;
		System.out.println("The payment is $" + payment);
		
		
		
	}

	
	
	
	
	
	
	
	
	
}
