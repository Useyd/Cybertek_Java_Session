package day20_StringManipulation_P2;

public class Task80_TwoStrings {

	public static void main(String[] args) {

//Write a method that accepts 2 strings(str1, str2)
//and prints the position index of the str2 if str2 is
//existing in str1. If it doesn't exist, prints not found!

//  checkingString("Your order confirmation number is XYZ","confirmation"); 		
		
//	"Your order confirmation number is XYZ", "confirmation"; 			
		
		
		checkingString("Your order confirmation number is XYZ", "confirmation");
		
		
	}

	
	public static void checkingString(String str1, String str2) {
	
		
		int indexofstr2 = str1.indexOf(str2);
		
		if(indexofstr2>-1) {
		System.out.println("str2 is existing in str1");	
		System.out.println("It starts from index " + str1.indexOf("confirmation"));
		
		}else {
		System.out.println("Not Found");
		}
		}
}
