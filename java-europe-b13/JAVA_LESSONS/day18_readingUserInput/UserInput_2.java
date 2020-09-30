package day18_readingUserInput;

import java.util.Scanner;//importing scanner class..

public class UserInput_2 {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		
		System.out.print("Provide a sentence and I'll repeat it: ");
		String str = sc.next(); //if our sentence includes spaces, next won't work well. 
		System.out.println(str);
		
		sc.nextLine();//Also, if we want to write another String after another String, we should create a nextLine method...
		
		
		System.out.print("Provide a sentence and I'll repeat it: ");
		String str2 = sc.nextLine();//we should use nextLine method...
			
		System.out.println(str2);
		
	}

}
