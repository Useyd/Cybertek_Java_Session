package day23_RandomClass;

import java.util.*;

public class Task85 {

	public static void main(String[] args) {
		
/*		Write a program that plays a simple dice game between the computer and the
		user. When the program runs, a loop should repeat 10 times. Each iteration of the
		loop should do the following:
		
		   ØGenerate a random integer in the range of 1 thru 6. This is the value of the
		    computer’s dice.
		
		   ØGenerate another random integer in the range of 1 thru 6. This is the value
		    of the user’s dice.
		
		   ØThe dice with the highest value wins. (In case of a tie, there is no winner)
		
		As the loop iterates , the program should keep count of the number of times the
		computer wins, and the number of times that the user wins. After the loop
		performs all of its iterations, the program should display who was the grand
		winner, the computer or the user.	
*/				
		
		Random  rn = new Random();
		
		int usersdice,compdice, comp=0, user=0, sum;
		
		for(int i = 0; i<=10; i++) {
			
			compdice = rn.nextInt(6)+1;
			usersdice = rn.nextInt(6)+1;
		    
			if(compdice>usersdice)
		    	
				comp++;
			else 
				
				user++;
			
		    
		}
	
		System.out.println("Computer's point is: " + comp);
		System.out.println("User's point is: " + user);
		
		if(comp>user)
	    System.out.println("Computer Wins!");
		else if(user>comp)
		System.out.println("User Wins!");	
		else
		System.out.println("There is no winner!");	
	}

}
