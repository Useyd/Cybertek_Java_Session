package day7_Control_Flow_Statements;

public class small_tasks {

	public static void main(String[] args) {
//1-Write an if statement that assigns 5 to x when y is equal to 20
		int x , y;
		x=5;
		y=20;
		
		if (y==20) {
			
			x=5;
			
		} 
		
		System.out.println("x = " + x +", "+ " y = " + y);
		System.out.println();
//2-Write an if statement that multiplies pay rate by 1.5 if hours is greater than 40
	    double hours, payRate;
	    hours = 50;
	    payRate = 500;
	    
	    if (hours>40) {
	    	
	    	payRate=1.5*payRate;
	    }
	    
	    System.out.println("Payrate is " + payRate);
	    System.out.println();
//3-Write an if statement that sets the variable fees to 50 if the boolean variable max is true
	    
	    boolean max = true; // if false fee will be 20
	    int fee = 20;
	    
	    if (max==true) {
	    	
	    	fee=50;
	    }
		
		System.out.println("Fee is " + fee);
		System.out.println();
//4-Write an if statement that assigns 20 to the variable a if variable b is 50 AND c is greater
//and equal to 100
		
		int a, b, c;
		a=100;
		b=20;
		c=30;
		
		if (b==50 && c>=100) { //F || F -> F --> So a remains 100
			a=20;
			
		}
		
	    System.out.println("a = " + a);
	    System.out.println();
//5-Write an if statement what prints "Ideal Temp" if the temp is between 70 AND 80
	    
	    int temp =75;
	    if (temp>=70 && temp<80) {
	    	
	    System.out.println("Ideal Temp");
	         
 	    }
	    
	    	   
	}

}
