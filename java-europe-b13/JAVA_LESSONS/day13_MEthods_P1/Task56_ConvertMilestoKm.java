package day13_MEthods_P1;

import java.util.Scanner;

public class Task56_ConvertMilestoKm {

	public static void main(String[] args) {

    
    
    
    convertKM();
		
	}

	public static void convertKM() {
    Scanner scanner = new Scanner (System.in);
	System.out.print("Please enter a mile value: ");
	int mile = scanner.nextInt();
	double km = mile*1.60934;
	System.out.println(mile+ " mile " + "is equal to "+ km+ " km");
		
	}

	
	
	
}
