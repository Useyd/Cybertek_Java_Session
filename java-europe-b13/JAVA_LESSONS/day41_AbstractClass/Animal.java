package day41_AbstractClass;

import java.util.Arrays;
import java.util.Scanner;

public class Animal {

	public static void main(String[] args) {
		
		
		Scanner input = new Scanner(System.in);
	    String[] words = {input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine()};
	   

	    //TODO: Write your code below
	    String newWords,hello;
	    
	    String[] word = new String[5];
	    for(int i=0; i<5; i++){
	      
	     hello = words[i].substring(0,1) +""+words[i].substring(words[i].length()-1);
	      
	      System.out.println(hello);
	      
	      
	      word[i]=hello;
	      
	      
	    }
		System.out.println(Arrays.toString(word));
	}
	
}
