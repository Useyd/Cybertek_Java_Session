package day18_readingUserInput;

import java.util.Scanner;

public class SecretNumberGuess {

	public static void main(String[] args) {
        /*  
		Write a guessing game where the user has to guess a secret number between 1-20.
		After every guess, the program tells user whether their number was too large or too small.
		The program will keep asking the user enter the number until he/she finds the correct number.
        When the correct answer is found, the program will display "Congrats, you got it!" 
        */ 
			
		Scanner input = new Scanner(System.in);
	    System.out.println("Find the secret number between 1-20!");
	    System.out.print("Enter your guess: ");
	    int secretNumber = 5;
	    int attempt = 0;
	    
	    //we can't use for loop in here. Because it will ask again infinite times if the user input is false...
        //so we should use do while loop!!
	    
	    do {
	    
	    	int guess = input.nextInt();
	        if(guess<=1 || guess>=20) {
	        	System.out.print("Invalid Value! Please enter a valid number between 1-20!");
	        	System.out.println();
	        	System.out.print("Enter your guess: ");
	        	
	        }
	        
	        
	        else {
	        	
	        	attempt++;
	        	if(guess>secretNumber) {
	        		System.out.print("Too large! Try again!");
	        		System.out.println();
	        		System.out.print("Enter your guess: ");
	        		
	        	
	        	}else if(guess<secretNumber) {
	        		System.out.print("Too small! Try again!");
	        		System.out.println();
	        		System.out.print("Enter your guess: ");
	        		
	        	}else if (guess==5){
	        		System.out.print("Congrats! You got it!");
	        	    break;
	        	}
	        	
	        }
	                
	    
	    }while(true);
	}

}
