package day13_MEthods_P1;

import java.util.Scanner;

public class Task58_Compare2Numbers {

	public static void main(String[] args) {


		compareNumbers();
		
		
		
	}

	
	public static void compareNumbers() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter 2 numbers:");
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
		
		if(num1>num2) {
			System.out.println(num1 + " is greater than " + num2);
		
		}else if (num2>num2){
			System.out.println(num2 + " is greater than " + num1);
				
		}else {
			System.out.println("Numbers are equal");
		}
		
		
	}


	
	
	
	
	
	
	
	
}
