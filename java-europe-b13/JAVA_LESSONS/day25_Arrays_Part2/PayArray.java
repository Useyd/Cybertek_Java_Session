package day25_Arrays_Part2;

import java.util.*;

public class PayArray {

	public static void main(String[] args) {
		
		//This program stores in an array the hours
		//worked for by 5 employees who all make
		//the same hourly wage
		//calculate, display their gross pay
		
		final int EMPLOYEES = 5;
		double payRate;
		double grossPay;
		
		Scanner sc = new Scanner(System.in);
		//create an array to hold employee work hours	
		int[] hours = new int[EMPLOYEES];
		
		//get the work hours for each employee from user
        System.out.println("Enter the hours worked by " + EMPLOYEES + " employees who all earn the same hourly wage: ");
	
        for(int i=0; i<EMPLOYEES; i++) {
        	
        	hours[i] = sc.nextInt();//hours[i] assigned as user input... Input directly goes to array..
        }
        
        //get the hourly pay rate from user
        System.out.println("Enter the hourly rate for each employee: ");
	    payRate = sc.nextDouble();
	    
	    //display each employee's gross pay
	    for(int i=0; i<EMPLOYEES; i++) {
	    	
	    	grossPay = hours[i]*payRate;
	    	
	    	System.out.println("Employee #" + (i+1) + ": $ " +grossPay);
	    }
	    
	}

}
