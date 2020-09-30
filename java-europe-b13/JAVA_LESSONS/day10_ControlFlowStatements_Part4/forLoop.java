package day10_ControlFlowStatements_Part4;

public class forLoop {

	public static void main(String[] args) {

/* 
  Loops check a condition: If it returns true
  a code block will run. Then the condition will be checked again
  and if it is still returns rue, the code block will run again.
  It repeats until the condition return false
  
  -for
  -while
  -do while
  
  */		
		
		//print 15 times Hello:
		
		System.out.println("Hello");
		System.out.println("Hello");
		System.out.println("Hello");
		System.out.println("Hello");
		System.out.println("Hello");
		System.out.println("Hello");
		System.out.println("Hello");
		System.out.println("Hello");
		System.out.println("Hello");
		System.out.println("Hello");
		System.out.println("Hello");
		System.out.println("Hello");
		System.out.println("Hello");
		System.out.println("Hello");
		System.out.println("Hello");
		System.out.println("***********");
/*
 *     
 * 
 *      for (initialization; condition; increment) {
 *                     
 *                     --STATEMENT--
 *      }
 * 
 *		
 *
 *
 *
 */
		
		
		
		for (int x=0; x<5; x++) {
		//First checks int x=0; then checks x<5; then goes to statement	
		//System.out.println("Useyd"); then makes incrementing x++; 
			//then goes to x<5 again until 5<5 (false)...	
			System.out.println("Useyd");
		}System.out.println();
		
		for (int i=1; i<=10; i++) {// it will start from 1
			System.out.println("i = "+i);
		}System.out.println();
		
		for (int i=5; i<=10; i++) {//it will start from 5
			System.out.println("i = " + i);
		}System.out.println();
		
		for(int num=20; num>10; num--) { //decrementing from 20 to 11
			System.out.println("num = " + num);
		}
		
		for(int i=0; i<=100; i+=10) {//it will start from zero, incrementing 10 by 10 (i+=10), ends in 100
			System.out.println("i = " + i);
			
		}System.out.println();
		
		for(int i=50; i>=0; i-=5) {//it will start from 50, 5 by 5 decreasing to  the zero
			System.out.println("i = " + i);
		}
	
	
	
	
	
	
	}

}
