package week7;

import java.util.Scanner;

public class String_LowerUpper {

	public static void main(String[] args) {

		Scanner scan = new Scanner (System.in);
		System.out.println("What is the capital city of Turkey?");
        String capital = scan.next();
        
        
        
        System.out.println(capital.toUpperCase());
        System.out.println(capital.toLowerCase());
	}

}
