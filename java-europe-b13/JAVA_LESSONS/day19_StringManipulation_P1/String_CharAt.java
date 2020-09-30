package day19_StringManipulation_P1;

public class String_CharAt {

	public static void main(String[] args) {


		String word = "computer";
	    
		System.out.println(word.length());//8
		
		System.out.println(word.charAt(0));// index starts from 0. Not 1! So, 0=c
		System.out.println(word.charAt(1));// 1=o
		System.out.println(word.charAt(2));// 2=m
		System.out.println(word.charAt(3));// 3=p
		System.out.println(word.charAt(4));// 4=u
		System.out.println(word.charAt(5));// 5=t
		System.out.println(word.charAt(6));// 6=e
		System.out.println(word.charAt(7));// 7=r
		System.out.println();
		
		//check if first character is 'A' 
		String word2 = "Apple";
		if(word2.charAt(0)=='A'){
			System.out.println("A is first character");
		}else {
			System.out.println("A isn't first character");
		}
		System.out.println();
		
		//check if first and last characters are same
		String word3 = "civic";
		
		char x = word3.charAt(0);
		char y = word3.charAt(4);
		if(x==y)
			System.out.println("first and last characters are same");
		else
		System.out.println("first and last characters are not same");	
		System.out.println();
		
		//last index not hard coded.
		
		String word4 = "Harpt";//with char-> 0,1,2,3,4 | length=5 so 5-1=4 -> 4 is the last index already... 
		char lastChar = word4.charAt(word4.length()-1);// using length for calculate how many indexes the word includes.
		                                               // because of indexes are starting from 0, we'll write length()-1 for finding the last index. Otherwise we'll see wrong output 
		System.out.println("Last char of " + word4 + " is " + lastChar );
		
		
		
		
		
		
		

	
	}
		
	   
	
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	

}
