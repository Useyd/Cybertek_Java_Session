package day30_WrapperClass;

import java.util.Arrays;

public class Task96_Weather {

	public static void main(String[] args) {
		
		String str1 = "Today weather is sunny and 72 degree. It is a perfect day to practice java.";

		//Write a program to output: 72 degree is equal to 22.22 Celcius.
        // 1 degree Fahrenheit = -17.2222222 degrees Celsius
	
		String[] array = str1.split("and "); // after end space 72 comes. so we should split from there
		array = array[1].split(" degree");//when we split like that next, index 0 will be 72 ->72 is string in here! 
		
		
		String degree = array[0];// 72 as string
		double degreeFahrenheit = Double.parseDouble(degree);//converting to double object 
		
		double degreeCelcius = (degreeFahrenheit-32) *5/9;
		
		System.out.println(degreeFahrenheit + " degree is equal to " + Math.round(degreeCelcius) + " Celcius");
		
	    
		
	
	}

}
