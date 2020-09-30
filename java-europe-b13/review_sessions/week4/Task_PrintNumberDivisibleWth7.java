package week4;

import java.util.Scanner;

public class Task_PrintNumberDivisibleWth7 {

	public static void main(String[] args) {

Scanner scanner = new Scanner(System.in);
System.out.print("Please enter the starting number:");
int number= scanner.nextInt();
System.out.print("Please enter the ending number:");
int number2= scanner.nextInt();


    for(int i=number; i<=number2; i++) {
	
    	if(number<number2 && i%7==0) {
		
		
		System.out.println(i);
	}
    }
    
    for(int j=number; j>=number2; j--) {
    	if(number2>number && j%7==0) {
    		
    		System.out.println(j);
    	}
    }
}
}