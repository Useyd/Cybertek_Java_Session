package week3;

import java.util.Scanner;

public class check_pin_code {

	public static void main(String[] args) {
		System.out.println("Welcome to Bank of America");
		
		Scanner scanner = new Scanner(System.in);
		int secretpincode=2345;
		System.out.print("Please enter your Pin Code: ");
		int inputPinCode= scanner.nextInt();
		
		if (inputPinCode==secretpincode) {
			
			System.out.println("Welcome to your account!");
			
		}else {
			System.out.println("Invalid Pin Code!");
		}
		
		System.out.println("Thank you for your business");
	}

}
