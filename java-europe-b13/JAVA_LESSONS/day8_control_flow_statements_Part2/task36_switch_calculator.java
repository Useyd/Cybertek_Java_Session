package day8_control_flow_statements_Part2;

public class task36_switch_calculator {
 	public static void main(String[] args) {

 		//a calculator with switch case

		int num1,num2;
		num1=7;
		num2=4;
	    String operator="+";// operator is changeable...
	    int result=0;
		
		switch (operator) {
		
		case "+":
		result = num1+num2;
		break;
		
		case "-":
		result = num1-num2;
		break;
		
		case "/":
		result = num1/num2;
		break;
		
		case "*":
		result = num1*num2;
		break;
		
		default:
			System.out.println("Invalid Operator");
		
				     
		}
		
		System.out.println("Result is " + result);
	}

}
