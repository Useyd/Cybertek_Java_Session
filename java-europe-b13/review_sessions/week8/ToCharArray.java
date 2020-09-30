package week8;

import java.util.Arrays;

public class ToCharArray {

	public static void main(String[] args) {
		
		String word = "Java";
		char[] letters = word.toCharArray();//it convers the string to chars with array based
		
		System.out.println("Letters length : " + letters.length);
		System.out.println(Arrays.toString(letters));//printing arrays
		
		String[] str = {"apple", "orange"};
		
		System.out.println(str[0].substring(2));
		System.out.println(str[1].substring(1,4));
		

	}

}
