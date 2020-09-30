package day25_Arrays_Part2;

import java.util.Arrays;

public class Task92_TableArray {

	public static void main(String[] args) {
/*
		ØWrite a Java program to store numbers 1 to 10 in an array using data instantiation. Then write a
		for loop to multiply each member of above array by 19, this way you will get table of 19 stored
		in the above array. Finally write another for loop to print all the array elements.
		ØYou should get the following output:
		19
		38
		57
		76
		95
		114
		133
		152
		171
		190
*/		
        int[]  numbers = new int[10];
		
		
		for(int i=0;i<numbers.length;i++) {
			
			numbers[i] = i+1;//to store numbers 1 to 10 it shouldn't start from 0. So we'll add 1 each of'em.
		}
		
		for(int i=0;i<numbers.length;i++) {
			
			System.out.println(numbers[i] * 19); // numbers increasing 19 by 19..
		}
		
		System.out.println(Arrays.toString(numbers));//it gives the array

	}

}
