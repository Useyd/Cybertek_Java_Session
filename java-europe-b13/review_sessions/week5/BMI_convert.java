package week5;

import java.util.Scanner;

public class BMI_convert {

	public static void main(String[] args) {


		Scanner scanner = new Scanner(System.in);
 
		System.out.print("Please enter your weight in pounds: ");
		int weightInpounds = scanner.nextInt(); 

		System.out.print("Please enter your height in feet: ");
		int heightinFeet = scanner.nextInt();
		
		System.out.print("Please enter inches: ");
		int inches = scanner.nextInt();
		
		
		BMI(weightInpounds,heightinFeet,inches);
		
		
	}

	public static void BMI(int weightInpounds, int heightinFeet, int inches) {

		double weightInkg = weightInpounds/2.2; 
		double heightInMeters = ((heightinFeet*12) + inches) *0.0254;
				
		double BMI = weightInkg/(heightInMeters*heightInMeters);		
		
		
		
		if(BMI<18.5) {
			System.out.println("Underweight");
		
		}else if(BMI<25) {
			System.out.println("Normal Weight");
			
		}else if(BMI<30) {
			System.out.println("Overweight");
		
		}else {
			System.out.println("Obese");
		}

		
		
		
	}

	
	
	
	
	
}
