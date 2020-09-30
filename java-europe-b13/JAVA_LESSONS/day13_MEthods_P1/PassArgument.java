package day13_MEthods_P1;

public class PassArgument {

	public static void main(String[] args) {

	int x = 15;//assigning x a number
		
    displayValue(7);
	displayValue(x);//just writing x as parameter, instead of writing number
	displayValue(x*4);	
	
	
	}
	public static void displayValue(int num) {
		
		System.out.println("The value is " + num);
		System.out.println("The value is " + num*2);
	    System.out.println();
	}
	public static void displayValue() {// this method has no parameters in the " () ". So compiler won't run it.
		
		System.out.println("10");//output never be like this line declares. 
	
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
