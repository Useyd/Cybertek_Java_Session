package day24_Arrays_Part1;

import java.util.*;

public class Task88_Cars {

	public static void main(String[] args) {
		
/*		• Create an array that holds cars (Honda, Toyota, Nissan, BMW, Mercedes, Porsche,
		  Ferrari)
		• Ask user to enter an index number to choose his dream car.
		• Print the price for selected car.
		  Car prices :
		  Honda – Toyota – Nissan (Random price between 20000 and 40000)
		  BMW-Mercedes(Random price between 50000 and 80000)
		  Porsche - Ferrari(Random price between 100000 and 150000)
		• Hint : finding a random number between 2 numbers = > ((max - min) + 1) + min
*/
		
		

		Scanner sc = new Scanner(System.in);
		Random rn = new Random();
		System.out.println("Please enter an index number to choose your dream car:");
		int index = sc.nextInt();
		
		String [] car = new String [7];
		
		car [0] = "Honda";
		car [1] = "Toyota";
		car [2] = "Nissan";
		car [3] = "BMW";
		car [4] = "Mercedes";
		car [5] = "Porsche";
		car [6] = "Ferrari";
		
		int randomPrice;
		
		if(index==0 || index==1 || index==2) {
		
			randomPrice = rn.nextInt(((40000-20000)+1) + 20000);
			System.out.println("Your dream car is " + car [index] + " and its price is: $" + randomPrice);
		}else if(index==3 || index==4) {
			
			randomPrice = rn.nextInt(((80000-50000)+1) + 50000);
			System.out.println("Your dream car is " + car [index] + " and its price is: $" + randomPrice);
		}else if(index==5 || index==6) {
			
			randomPrice = rn.nextInt(((150000-100000)+1) + 100000);
			System.out.println("Your dream car is " + car [index] + " and its price is: $" + randomPrice);
		}
		
		
		
		
}
}
