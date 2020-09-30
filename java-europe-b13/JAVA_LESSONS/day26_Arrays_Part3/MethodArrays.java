package day26_Arrays_Part3;

import java.util.*;

public class MethodArrays {

	public static void main(String[] args) {
		//this is a dynamic method. so number can be changed.
		printArray(5);


	}
	
	
	public static int[] createArray(int arraySize) {//this second method creates the array and returns it to the first one 
		Random rn = new Random();
		 
		int[] myArray = new int[arraySize];
		
		for(int i=0; i<myArray.length; i++) {
			
			myArray[i] = rn.nextInt(100);
			
			
		}
		return myArray;
	}
	
	
	
	public static void printArray(int number) {//5 will assigned here first.
		
		for(int value: createArray(number)) {//in this line we are calling a second method with 5
			
			System.out.println(value);
		}
		
	}
	
	

}
