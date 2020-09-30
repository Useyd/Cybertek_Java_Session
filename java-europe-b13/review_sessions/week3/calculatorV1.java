package week3;

public class calculatorV1 {

	public static void main(String[] args) {

		double num1 = 10.20;//changeable
		double num2 = 5.0; //changeable
		char operator = '+'; //changeable
		
		if (operator == '+') {
			
			System.out.println(num1+num2);
					
		}else if (operator == '-') {
			System.out.println(num1-num2);
			
		}else if (operator == '*') {
			System.out.println(num1*num2);
			
		}else if (operator == '/') {
			System.out.println(num1/num2);
			
		}else {
			System.out.println("Invalid Operator!");
		}
		
	}

}
