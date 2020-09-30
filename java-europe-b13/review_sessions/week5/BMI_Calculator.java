package week5;

import java.util.Scanner;

public class BMI_Calculator {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your pounds,feet and inches:");
		int pounds = scanner.nextInt();
		int feet = scanner.nextInt();
		int inches = scanner.nextInt();
		
		
		BMI(pounds, feet, inches);

	}
	
	public static void BMI (int pounds,int feet,int inches) {
		
		
		double heightMeters = ( (feet * 12) + inches) * 0.0254;
		double mass = (pounds / 2.2);
		
		double BMI = mass / (heightMeters * heightMeters);
		
		if(BMI<18.5) {
			System.out.println(BMI + " :Your risk category is underweight");
		}else if(BMI<25) {
			System.out.println(BMI + " :Your risk category is normal weight");
		}else if(BMI<30) {
			System.out.println(BMI + " :Your risk category is overweight");
		}else {
			System.out.println(BMI + " :Your risk category is obese");
		}
	
	}

}