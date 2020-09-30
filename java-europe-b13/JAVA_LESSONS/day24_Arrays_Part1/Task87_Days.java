package day24_Arrays_Part1;

import java.util.Scanner;

public class Task87_Days {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter an index number between 0-6: ");
		int indexNum = sc.nextInt();
		
		String [] day = new String[7];
        
        day[0] = "Monday";
        day[1] = "Tuesday";
        day[2] = "Wednesday";
        day[3] = "Thursday";
        day[4] = "Friday";
        day[5] = "Saturday";
        day[6] = "Sunday";
       
        System.out.println("Today is " + day[indexNum]);

	}

}
