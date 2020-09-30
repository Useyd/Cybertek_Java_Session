package day18_readingUserInput;

import java.util.Scanner;

public class UserInput_3 {

	public static void main(String[] args) {

     Scanner sc = new Scanner(System.in);
     
     System.out.print("Enter first number: ");
	 int n1 = sc.nextInt();
	 
	 System.out.print("Enter second number: ");
     int n2 = sc.nextInt();
     
     sc.nextLine();//we should add nextLine otherwise it will jump directly to output....
                   //it will ignore string object...  
     System.out.print("Enter a string: ");
	 String str = sc.nextLine();
	 
	 System.out.println("Output: " + n1 + " ; " + n2 + " ; " + str  );
	}

}
