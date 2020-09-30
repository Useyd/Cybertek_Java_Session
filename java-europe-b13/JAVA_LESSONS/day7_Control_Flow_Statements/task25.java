package day7_Control_Flow_Statements;

public class task25 {

	public static void main(String[] args) {
		
		//program that shows the greatest number
		int num1,num2,num3; 
		num1 = 45;
		num2 = 8;
		num3 = 1;
			
		if (num1>num2 && num1>num3) {
			
			System.out.println("The greatest number is " + num1);
		}
		
		if (num2>num1 && num2>num3) {
			
			System.out.println("The greatest number is " + num2);
						
		}
		
		if (num3>num1 && num3>num2) {
			
			System.out.println("The greatest number is " + num3);
		}
	}

}
