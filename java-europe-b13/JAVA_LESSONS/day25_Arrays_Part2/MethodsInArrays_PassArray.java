package day25_Arrays_Part2;

import java.util.Scanner;

public class MethodsInArrays_PassArray {

	public static void main(String[] args) {
		
		//create an array
		
		int[] numbers = new int[4];
		
		//pass the array to the getValues method
		getValues(numbers);
		
		System.out.println("Here are the numbers that you entered: ");
	
	    //pass the array to showArray method
		showArray(numbers);
	}

	public static void getValues(int[] numbers) {//we'll get values from user as ARRAY!. 
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a series of " + numbers.length +" numbers" );
		
		for(int i=0; i<numbers.length; i++) {
			
			System.out.println("Enter number " + (i+1) + " :");
		    numbers[i] = sc.nextInt();//user will enter input and it goes to index
		}
		
	}
	
    public static void showArray(int[] numbers) {// it will show the whole arrays that user entered

	for(int value: numbers) {
		
		System.out.println(value);
	}

		
	}

}
