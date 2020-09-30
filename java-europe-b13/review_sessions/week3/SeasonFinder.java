package week3;

import java.util.Scanner;

public class SeasonFinder {

	public static void main(String[] args) {

		Scanner scanner = new Scanner (System.in);
		System.out.print("Enter mounth: ");
		int month =scanner.nextInt();
		
		switch(month) { //accepts byte, short, char, int, String
		case 3: case 4: case 5:
			System.out.println("It is Spring");
		    break;
		case 6: case 7: case 8:
			System.out.println("It is Summer");
			break;
		case 9: case 10: case 11:
			System.out.println("It is Fall");
		    break;
		case 12: case 1: case 2:
			System.out.println("It is Winter");
			break;
		default:
			System.out.println("invalid month");
		}
	
	
	
	
	}

}
