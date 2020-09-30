package week5;

public class FIBONACCI {

//0 1 1 2 3 5 8 13 21 34....
	
/*1 -pre1
  
  1 -pre2
  
  2 -num=pre1+pre2   -pre1 
 
  3	                 -pre2               -pre1
  	
  5	                 -num=pre1+pre2      -pre2
  	
  8                  	                 -num=pre1+pre2
  	
  	
  1->8 we need a lopp which is 1 to 9	
  	
  	
 */
	
	public static void fibonaccisequence() {
		
	int count = 8;
	int pre1 = 0;
	int pre2 = 1;
	
	System.out.println("fibonacci series of count " + count + " numbers");
	
	for (int i=1; i<count; i++) {
		
		System.out.print(pre2+" ");

		//On each iteration, we are assigning second number to the first number and
		//assigning the sum of last two numbers to the second number		
	
	int sumofPrevTwo = pre1+pre2;	
	pre1=pre2;
	pre2=sumofPrevTwo;
	
	
	}
	
	
	}
	
	
	
	
	public static void main(String[] args) {
		
		fibonaccisequence();
		
		
	}
	
	
}
