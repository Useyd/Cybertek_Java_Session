package day19_StringManipulation_P1;

public class Task78_counThechar {

	public static void main(String[] args) {

//Write a program to count the number of occurrences for specific char
//String word = "abcabqcabc";
//Number of a in this String is: 3		
		
		String word = "abcabqcabcijuhgddaxcvkkkfersadd";
		char Mychar='j';
		
		int length = word.length();
		int counter = 0;//for count how many chars of same one
		
		for(int i = 0; i<length; i++) {
			
			char nextchar = word.charAt(i); 
			
			if(nextchar == Mychar) 
			counter = counter +1; // or counter++ in short...
						
		}
		
		System.out.print("Number of "+ Mychar + " in this String is: " + counter);
	    
	}

}
