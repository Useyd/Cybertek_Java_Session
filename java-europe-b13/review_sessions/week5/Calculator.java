package week5;

public class Calculator {

	public static void main(String[] args) {
		
	int result = add(100,20);
	System.out.println(result);
	
	int x = subtract(25,5);
	System.out.println(x);
	
	
	}public static int add(int num1, int num2) {
	   int result = num1 + num2;
	   return result;

	}public static int subtract(int num1, int num2) {
	   int result = num1 - num2;
	   return result;
		
		
	}



}
