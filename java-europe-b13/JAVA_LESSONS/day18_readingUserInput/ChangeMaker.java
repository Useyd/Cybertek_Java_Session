package day18_readingUserInput;

import java.util.Scanner;

public class ChangeMaker {

	public static void main(String[] args) {
     
		//Enter a whole number from 1-99, and I will find a combination of coins that equals that amount of 
		//change.

		//quarter: 25 cents
		//dimes: 10 cents
		//nickles: 5 cents
		//pennies: 1 cent
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a whole number from 1-99, and I will find a combination of coins that equals that amount of change: ");
        int attempt = 0;
		
        do {
        	int n1=sc.nextInt();
        	
        	if(n1>=1 && n1<=99) {
        		ChangeMake(n1);
        	    break;
        	
        	}else{
        	
        		attempt++;
        	   
        		if(attempt==3) {
        	    	System.out.println("Sorry, no more attempts!");
        	        break;
        	    }else {
        	    	
        	    	System.out.println("Try again!");
        	    }
        	}	
        	
        	
        } while(true);
        	
	}
	
	//we are writing the calculating method outside of the main method. With creating a new template method. So we can use this method in main with every variables we want..
	public static void ChangeMake(int n1) {
		
		
		int amount = n1;		 
		int quarter = n1/25; 
		int dimes = (n1%25)/10;
		int nickles = (n1%10)/5;
		int pennies = (n1%5)/1;
		System.out.println("Your number -> " + amount + " equals to: " + "\n" + "Quarter: " + quarter + "\n" + "Dimes: " + dimes + "\n" + "Nickles: " + nickles + "\n" + "Pennies: " + pennies );
		
		
		
	}
	
			
				
	
}
