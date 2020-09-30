package week2;

public class UsingVariables {

	public static void main(String[] args) {

		int num1, num2 , num3;
		
		num1 = 100;
		num2 = num1; // copy 100 and assign to num2
		num3 = num2; // copy num2 (100) and assign to num3
		
		System.out.println(num1);
		System.out.println(num2); 
		System.out.println(num3);
		
		num1 =500;
		
		System.out.println(num1);
		System.out.println(num2); 
		System.out.println(num3);
		
		
	}

}
