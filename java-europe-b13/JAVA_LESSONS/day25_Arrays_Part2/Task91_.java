package day25_Arrays_Part2;

import java.util.Random;

public class Task91_ {

	public static void main(String[] args) {
		
/*		ØCreate an array with 10 elements
		ØInitialize each array element with random values between 0 and 100 but less than 100
		ØPrint each array element
*/
Random rn = new Random();
		
		int[] numbers = new int[10];
		
/*		Instead of assign one by one just looop it...
 
        numbers[0]=rn.nextInt(100);
		numbers[1]=rn.nextInt(100);
		numbers[2]=rn.nextInt(100);
		numbers[3]=rn.nextInt(100);
		numbers[4]=rn.nextInt(100);
		numbers[5]=rn.nextInt(100);
		numbers[6]=rn.nextInt(100);
		numbers[7]=rn.nextInt(100);
		numbers[8]=rn.nextInt(100);
		numbers[9]=rn.nextInt(100);
*/		
		for(int i=0;i<numbers.length;i++) {
			
			numbers[i]=rn.nextInt(100);//random range is 100. so it will start from 0 to 100.
			
		}
		
	 /* Instead of writing one by one like below
	    we'll use for loop..
		 
		System.out.println(numbers[0]);
		System.out.println(numbers[1]);
		System.out.println(numbers[2]);
		System.out.println(numbers[3]);
		System.out.println(numbers[4]);
		System.out.println(numbers[5]);
		System.out.println(numbers[6]);
		System.out.println(numbers[7]);
		System.out.println(numbers[8]);
		System.out.println(numbers[9]);
		*/
		
		for(int i=0;i<numbers.length;i++) {
			
			System.out.println(numbers[i]);
			
		}
		

		
		
		
		
		
		
}		
}