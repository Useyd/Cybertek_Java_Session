package day15_Methods_P3;

public class Task69_SOImportantQUESTION {

	public static void main(String[] args) {
	/*PRIME Number

0,1 not prime Number

2 is prime Number

3 = > 3/2 ?

4 = > 4/2 ? 4/3 ?

5 = > 5/2 ? 5/3 ? 5/4 ?

6 = > 6/2 ? 6/3 ? 6/4 ? 6/5 ?

7 = > 7/2 ? 7/3 ? 7/4 ? 7/5 ? 7/6 ? 

9 = > 9/2 ? 9/3 ? 9/4 ? 9/5 ? 9/6 ? 9/7 ? 9/8 ? 

1- if statement - 0 or 1 not prime Number

2- if number not 0 or 1: 

   1- loop from 2 to number (excluded), or number-1..
   2- break loop*/	
		
		int number = 37;
		 
		if(isPrime(number)) {
			System.out.println(number + " is a prime number");
		}else {
			System.out.println(number + " is not a prime number");
		}

	}
	
	
	public static boolean isPrime(int number) {
		
		boolean  flag = true;//dummy variable for declare true and falses.
		
		if(number==0 || number==1) {
			
			flag=false;//dummy for if number is 0 or 1, FALSE
			
		}else {
			
			
			for(int i=2;i<number;i++) {
				
				if(number%i==0) {
					
					flag=false;//dummy for if a number(i) in loop divide with input number, FALSE
					
					break;
					
					
				}
				
			}
			
		
		}
		
		return flag;//Else, it will return boolean flag = true;
		
		
		
		
		
		
		
	}

}