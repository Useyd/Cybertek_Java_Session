package day26_Arrays_Part3;

import java.util.Arrays;

public class Split_Method {

	public static void main(String[] args) {
		
		String str = "It will display the array of the size";
		
		String[] arr = str.split(" "); //it will split the spaces and creates a new array from the string
        
		System.out.println(Arrays.toString(arr));//it'll show us the array that created
	    System.out.println();
		//now we can print this new array's elements one by one:
		
		for(String value: arr) {
			
			System.out.println(value);
		}
	
	
	
	
	}

}
