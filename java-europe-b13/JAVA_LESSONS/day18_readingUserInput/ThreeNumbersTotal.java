package day18_readingUserInput;

import java.util.Scanner;

public class ThreeNumbersTotal {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Please enter three numbers: ");
		System.out.println();
		
		System.out.print("Number 1: ");
        int n1 = input.nextInt();
        
        
        System.out.print("Number 2: ");
	    int n2 = input.nextInt();
	    
	    
	    System.out.print("Number 3: ");
	    int n3 = input.nextInt();
	    System.out.println();
	
	    System.out.print("Total: ");
	    Total(n1,n2,n3);
	    
	
	
	}

	public static void Total(int n1, int n2, int n3) {
		int total = n1 + n2 + n3 ; 
	    System.out.print(total);
	}
	
}
