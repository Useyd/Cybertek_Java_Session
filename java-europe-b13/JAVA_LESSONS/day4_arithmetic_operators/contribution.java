package day4_arithmetic_operators;

public class contribution {
	public static void main(String[] args) {
		
		/*
		 This program calculates the amount of pay that will be contributed
		 to a retirement plan if %5, %8 or %10 monthly pay is withheld
		 */
		
		int wage=10000; //This is my example
		
		double contributionplan1=wage*0.05,
		contributionplan2=wage*0.08,
		contributionplan3=wage*0.1;
		
		System.out.println(contributionplan1);
		System.out.println(contributionplan2);
		System.out.println(contributionplan3);
	
		System.out.println();
		
		
		int wage1=10000; //My example 2
		double cont1;
		double cont2;
		double cont3;
		
		cont1=wage1*0.05;
		cont2=wage1*0.08;
		cont3=wage1*0.1;
		
		System.out.println(cont1);
		System.out.println(cont2);
		System.out.println(cont3);
		
		System.out.println();
		
		//Mentors example:
		//Variables to hold the monthly pay and the amount the contribution
		
		double monthlyPay=6000;
		double contribution;
		
		//Calculate and display %5 contribution
		contribution=monthlyPay*0.05;
		System.out.println("5 percent is $ " + contribution + " per month." );
	
		//Calculate and display %8 contribution
		contribution=monthlyPay*0.08;
		System.out.println("8 percent is $ " + contribution + " per month.");
		
		//Calculate and display %10 contribution
		contribution=monthlyPay*0.1;
		System.out.println("10 percent is $ " + contribution + " per month.");
		
	

		
	
	
	
	
	}

}
