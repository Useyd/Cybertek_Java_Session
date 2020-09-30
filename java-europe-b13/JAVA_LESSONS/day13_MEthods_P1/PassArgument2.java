package day13_MEthods_P1;

public class PassArgument2 {

	public static void main(String[] args) {

		

		double x = 15.34;//assigning x a number as double
			
	    //displayValue(x); ->    1- if we want to write method like this,
		
		//otherwise we use casting:
		displayValue((int)x); //-> data loss happens. 15.34 -> 15
		
		showSum(5,15.34);
		showSum(300,233);
		showSum(30330,233.87);
		
		}
		public static void displayValue(int num) {//1- we should change the int as double 
			
			System.out.println("The value is " + num);
			System.out.println("The value is " + num*2);
		    System.out.println();
		}
		public static void displayValue() {// this method has no parameters in the " () ". So compiler won't run it.
			
			 System.out.println("10");//output never be like this line declares. 
		
		
	}
        public static void showSum(int num1, double num2) {
	    //also we can add multiple parameters in method too.
         	
        	int sum;
	        sum = num1+ (int)num2;
	        System.out.println("The sum is " + sum);
}
}
