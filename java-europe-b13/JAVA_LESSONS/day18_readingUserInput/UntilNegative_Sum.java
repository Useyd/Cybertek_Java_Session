package day18_readingUserInput;

import java.util.Scanner;

public class UntilNegative_Sum {

	public static void main(String[] args) {

		//Write a program that calculates the sum of numbers entered by user until
		//user enters a negative number...
		Scanner input = new Scanner(System.in);
		int sum=0;
	
		do {
			
			System.out.print("Enter a number: ");
			int number = input.nextInt();
			
			if (number>0) {
			   	sum = sum + number;
			    
			    
			    
			}else {
			
				System.out.println("You entered a negative number... You silly...");
				break;
			}
			
		}while(true);
		
		System.out.println("Sum before negative number: " + sum);
	}

}
