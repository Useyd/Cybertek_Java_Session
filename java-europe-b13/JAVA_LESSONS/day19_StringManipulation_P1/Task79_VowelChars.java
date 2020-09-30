package day19_StringManipulation_P1;

public class Task79_VowelChars {

	public static void main(String[] args) {

	//Write a program to print only vowel(a,e,o,i,u) in given String.

		String word = "CybertekSchool";//this will only work for this word and the words with not ending with vowel..
		
		
		int length = word.length();
		
				
		for(int i=0; i<length; i++ ) {
		
			char letter = word.charAt(i);
		
			if (letter =='e' || letter=='o' || letter=='i'|| letter=='u') {
			
			System.out.print(letter);	
				
			if(i!=length-2) {//this line for comma.. 
				             //comma isn't adding at last letter in output 
			                 //last letter -> length-1,
				             //so we'll write length-2 for add comma just the second one at the end 
				
				System.out.print(",");
			
			}
			}
		}
		
		
		
		
		
		
		
	}

}
