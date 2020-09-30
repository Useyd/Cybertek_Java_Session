package day26_Arrays_Part3;

import java.util.Scanner;


public class MethodArrays2 {

	public static void main(String[] args) {
		
		//createArray will accept one parameter which is carSize
        //user will enter some cars
		
		//findCar method will accept 2 parameters which integer and string.
		//if car is found - return true
		//if not - return false
	
	
	System.out.println(findCar(3, "Honda"));	
		
	}
	
	public static String[] createArray(int arraySize) {//first creating the array with scanner and for loop
		
		Scanner sc = new Scanner(System.in);
		String[] carArray = new String[arraySize];
		for(int i=0; i<carArray.length; i++) {
			
			System.out.println("Enter your car #"  + (i+1));
		    carArray[i] = sc.next();
		}
		
		    return carArray;	
	}
	
	
	
	
	public static boolean findCar(int value, String tofindCar) {//second creating the boolean method. for if car brand in array true, else false
		
		for(String car: createArray(value)){//for value, using calling first method with one int parameter. Then add value in it as a parameter. 
			
			if(car.equalsIgnoreCase(tofindCar));
			return true;
			
		}
		
			return false;
	}

}
