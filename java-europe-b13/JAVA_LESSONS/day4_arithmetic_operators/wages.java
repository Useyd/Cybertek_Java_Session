package day4_arithmetic_operators;

import day2_printing_comments.doublecode;

//This program calculates hourly wages plus overtime for a week

public class wages {

	public static void main(String[] args) {

		double regularWage; //The calculated regular wage
		double basePay=25;
		double regularHours=40; //The hours worked less overtime
		
		double overtimeWages; // Overtime wages
		double overTimePay=37.5; // Overtime Pay rate
		double overTimeHours=10;
		double totalWage; //Total Wage
		
		regularWage=basePay*regularHours;
		overtimeWages=overTimePay*overTimeHours;
		totalWage=regularWage+overtimeWages;
		
		System.out.println("Wages for this week are $" + totalWage);
		System.out.println("");
		
		
		
		
		
		
	}
}
