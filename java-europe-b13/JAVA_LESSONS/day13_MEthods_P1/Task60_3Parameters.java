package day13_MEthods_P1;

public class Task60_3Parameters {

	public static void main(String[] args) {

/*Write a method that accepts 3 parameters:
 * 1-number
 * 2-number
 * 3-operator(-,*,+,/)
 * 
 * Sample output:
 * calculator(6,3,"+") --> 9 
 * calculator(6,3,"-") --> 3
 * calculator(6,3,"*") --> 18
 * calculator(6,3,"/") --> 2
 
 *
 */
		calculator(6,3,"+");// if is out of concept
		calculator(6,3,"-");
		calculator(6,3,"*");
		calculator(6,3,"/");
	
		System.out.println();
	
		switchcahculator(10,3,"+"); //we should use switch case
		switchcahculator(10,3,"-"); 
		switchcahculator(10,3,"*");
		switchcahculator(10,3,"/");
	}

	

	public static void calculator(int num1, int num2, String plus) {

		if(plus == "+") {
			int sum = num1+num2; 
			System.out.println("calculator("+num1+","+num2+","+ "+" +")-->"+sum);
			
		}else if (plus== "-") {
			int minus= num1-num2;
			System.out.println("calculator("+num1+","+num2+","+ "-" +")-->"+minus);
		
		}else if (plus == "*") {
			int multiple= num1*num2;
			System.out.println("calculator("+num1+","+num2+","+ "*" +")-->"+multiple);
		
		}else {
			int division = num1/num2;
			System.out.println("calculator("+num1+","+num2+","+ "/" +")-->"+division);
		
		
		}
		
		
		 
	}
	
	private static void switchcahculator(int i, int j, String sign) {
		
        
        
		int output;
		switch (sign) {
		
		case "+":
		output=i+j;
		System.out.println("calculator("+i+","+j+","+ "+" +")-->"+output);
		break;
		
		case "-":
		output=i-j;
		System.out.println("calculator("+i+","+j+","+ "+" +")-->"+output);
		break;
		
		case "*":
		output=i*j;
		System.out.println("calculator("+i+","+j+","+ "+" +")-->"+output);
		break;
		
		case "/":
		output=i/j;
		System.out.println("calculator("+i+","+j+","+ "+" +")-->"+output);
		break;
		
		default:
		System.out.println("Invalid Value");	
			
		}
		
	
	
	}















}










